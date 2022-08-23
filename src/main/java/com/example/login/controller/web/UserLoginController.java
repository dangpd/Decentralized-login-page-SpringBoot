package com.example.login.controller.web;

import com.example.login.Repository.UserRepository;
import com.example.login.entity.User;
import com.example.login.service.MyUserDetails;
import com.example.login.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserLoginController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/log_in")
    public String showLoginForm(Model model, HttpServletRequest request) {
        return "login_form";
    }

}
