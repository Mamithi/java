package com.mamithi.rest.webservices.restfulwebservices.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping(path = "v1/person")
    public PersonV1 personV1(){
        return new PersonV1("John Doe");
    }

    @GetMapping(path = "v2/person")
    public PersonV2 personV2(){
       return new PersonV2(new Name("John", "Doe"));
    }

    @GetMapping(path = "/person/header", headers  = "X-API-VERSION=1")
    public PersonV1 headerV1(){
        return new PersonV1("John Doe");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2(){
        return new PersonV2(new Name("John", "Doe"));
    }
}
