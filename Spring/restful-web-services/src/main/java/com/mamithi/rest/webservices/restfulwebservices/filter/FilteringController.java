package com.mamithi.rest.webservices.restfulwebservices.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean(){
        return new  SomeBean("values1", "values2", "values3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveLisOfSomeBean(){
        return Arrays.asList(new  SomeBean("values1", "values2", "values3"),
                new  SomeBean("values12", "values22", "values32"));
    }
}
