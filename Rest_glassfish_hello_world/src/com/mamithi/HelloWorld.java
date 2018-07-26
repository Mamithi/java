package com.mamithi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {


    // The java method will process HTTP GET request
    @GET

    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces
    public String getClichedMessage(){

        return "Hello world";
    }

}
