package net.java.springannotations.controller;

import org.springframework.stereotype.Controller;

@Controller /*
Stereotype annotations are used to automatically create Spring beans in the Spring container.
the main Stereotype annotation is @Component.
Spring provides several other Stereotype meta annotations like @Controller,
used to create Beans at the controller layer, this handles most HTTP requests.
 */
public class MyController {

    public String hello() {
        return "hello, this is a controller.";
    }
}
