package com.example.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping(value = {"/", "/index"})
    public String viewHomePage(ModelMap model, final HttpServletRequest request) {
        return "index";
    }
}
