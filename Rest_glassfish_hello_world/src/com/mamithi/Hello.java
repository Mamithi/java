package com.mamithi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {


    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello(){
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHTMLHello(){
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" +"</h1></body>" + "</html>";
    }

}
