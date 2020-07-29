package com.zhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String Index(){
        return "zhang/login";
    }

    @GetMapping(value = "/toRegister")
    public String toRegister(){
        return "zhang/regist";
    }

    @GetMapping(value = "toSave")
    public String toSave(){
        return "zhang/addEmp";
    }

}
