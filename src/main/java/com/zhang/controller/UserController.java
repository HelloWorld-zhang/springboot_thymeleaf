package com.zhang.controller;


import com.zhang.entity.User;
import com.zhang.service.UserService;
import com.zhang.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public  String Login(String username,String password){
        User login = userService.login(username, password);
        if(login!=null){
            return "redirect:/emp/findAll";
        }else{
            return "redirect:/index";
        }


    }



    @PostMapping("/register")
    public String register(User user,String code,HttpSession session){
        String sessionCode =(String)session.getAttribute("code");
        if (sessionCode.equalsIgnoreCase(code)){
            userService.register(user);
            return "redirect:/index";
        }else{
            return "redirect:/toRegister";
        }
    }

    //验证码
    @GetMapping("/code")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        //存入session中
        session.setAttribute("code",securityCode);
        //相应图片
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image,"png",os);
    }
}
