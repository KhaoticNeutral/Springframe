package net.java.springannotations.service;

import org.springframework.stereotype.Service;

@Service /*
Stereotype annotations are used to automatically create Spring beans in the Spring container.
the main Stereotype annotation is @Component.
Spring provides several other Stereotype meta annotations like @Service,
used to create Beans at the Service layer, used to keep business logic.
 */
public class MyService {
    public String hello() {
        return "Hello, this is a service!";
    }
}
