package com.zhang.controller;

import com.zhang.entity.Emp;
import com.zhang.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping(value = "/findAll")
    public String findAll(Model model){
        List<Emp> allList = empService.findAll();
        model.addAttribute("emps",allList);
        return "zhang/emplist";
    }

    @PostMapping(value = "/save")
    public String Save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping(value = "/delete")
    public String delete(String id) {
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    @GetMapping(value = "/find")
    public String find(String id, Model model) {
        Emp emp = empService.find(id);
        model.addAttribute("emp", emp);
        return "zhang/updateEmp";
    }

    @PostMapping(value = "update")
    public String update(Emp emp) {
        empService.update(emp);
        return "redirect:/emp/findAll";
    }

}
