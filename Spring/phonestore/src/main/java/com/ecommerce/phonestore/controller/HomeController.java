package com.ecommerce.phonestore.controller;

import com.ecommerce.phonestore.models.security.PasswordResetToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/account")
    public String account()
    {
        return "account";
    }

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("/register")
    public String register()
    {
        return "register";
    }

    @RequestMapping("/forgot/password")
    public String forgotPassword(Locale locale, @RequestParam("token")  String token){
        PasswordResetToken passToken =  userService.getPsswordResetToken(token);

        return "forgot/password";
    }


}
