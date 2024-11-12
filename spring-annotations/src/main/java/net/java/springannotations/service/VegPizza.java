package net.java.springannotations.service;

import org.springframework.stereotype.Component;

//@Component
/*
this annotation tells the Spring container to favour this implementation of the Pizza interface,
thus avoiding the need for @Qualifier, unless you want to specify a different implementation
*/
public class VegPizza implements Pizza {

    @Override
    public String getPizza() {
        return "Veg Pizza";
    }
}

/*
CRUD annotations:

GET HTTP requests are used to get one or more resources,
and using @GetMapping allows for mapping these requests to specific handler methods.
It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.GET).

POST HTTP requests are used to create a resource,
and using @PostMapping allows for mapping these requests to specific handler methods.
It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.POST).
@RequestBody is responsible for retrieving the HTTP request body,
and auto-converting it to Java object.

PUT HTTP requests are used to update the resource,
and using @PutMapping allows for mapping these requests to specific handler methods.
It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.Put).

DELETE HTTP requests are used to delete the resource,
and using @DeleteMapping allows for mapping these requests to specific handler methods.
It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.DELETE).
 */
