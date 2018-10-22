package com.ecommerce.phonestore.controller;

import com.ecommerce.phonestore.models.User;
import com.ecommerce.phonestore.models.security.PasswordResetToken;
import com.ecommerce.phonestore.service.UserService;
import com.ecommerce.phonestore.service.impl.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HomeController
{
    @Autowired
    private UserService userService;

    @Autowired
    private UserSecurityService userSecurityService;

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
    public String register(Locale locale, @RequestParam("token") String token, Model model)
    {
        PasswordResetToken passToken = userService.getPasswordResetToken(token);

        if (passToken == null) {
            String message = "Invalid Token.";
            model.addAttribute("message", message);

            return "redirect:/badRequest";
        }

        User user = passToken.getUser();
        String username = user.getUsername();

        UserDetails userDetails = userSecurityService.loadUserByUsername(username);

        Authentication authentication =
        new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());

        SecurityContextHolder.getContext().setAuthentication(authentication);


        return "register";
    }

    @RequestMapping("/forgot/password")
    public String forgotPassword(Locale locale, @RequestParam("token") String token, Model model)
    {
        PasswordResetToken passToken = userService.getPasswordResetToken(token);

        return "forgot/password";
    }


}
