package com.mamithi.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path="/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path="/helloworld/bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path="/helloworld/pathvar/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @GetMapping(path="/helloworld/i18n")
    public String helloWorldI18n(@RequestHeader(name="Accept-Language", required = true)  Locale locale){
        return messageSource.getMessage("good.morning.message", null, locale);
    }
}
