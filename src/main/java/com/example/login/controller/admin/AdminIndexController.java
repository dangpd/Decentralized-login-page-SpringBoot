package com.example.login.controller.admin;

import com.example.login.entity.User;
import com.example.login.service.MyUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminIndexController {

    @RequestMapping("/admin")
    public String viewHomePage(ModelMap model, final HttpServletRequest request) {
        MyUserDetails userDetail = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDetail.getUser();
        model.addAttribute("USER_ADMIN",  user);
        return "login_admin_success";
    }

}
