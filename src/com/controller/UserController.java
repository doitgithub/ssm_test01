package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")  //http://localhost:8080/ssm_test01/user/hello.do

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/hello") //http://localhost:8080/ssm_test01/user/hello   *
    public ModelAndView find(User user)
    {
        System.out.println("userName = "+user.getUserName());
        ModelAndView mandv = new ModelAndView();
        mandv.setViewName("index");
        mandv.addObject("user", user); //addObject后台调用的request.setAttribute
        return mandv;
    }
}