package com.example.login.controller.admin;

import com.example.login.entity.User;
import com.example.login.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AdminLoginController {

    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> listUsers = userDetailsServiceImpl.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

}
