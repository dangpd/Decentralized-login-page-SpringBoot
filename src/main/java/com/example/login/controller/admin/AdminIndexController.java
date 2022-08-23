package com.example.login.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminIndexController {

    @RequestMapping("/admin")
    public String viewHomePage(ModelMap model, final HttpServletRequest request) {
        return "login_admin_success";
    }

}
