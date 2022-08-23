package com.example.login.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class UserIndexController {

    @RequestMapping("/customer")
    public String viewHomePage(ModelMap model,final HttpServletRequest request) {
        return "login_customer_success";
    }
}
