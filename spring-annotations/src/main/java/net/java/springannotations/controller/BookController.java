package net.java.springannotations.controller;

import net.java.springannotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
/*
RESTful web services within Spring MVC, @Controller and @ResponseBody are required.
Spring 4.0 introduced @RestController, a specialized version of @Controller.
This is a convenience annotation, adding @Controller and @ResponseBody annotations.
This makes creating RESTful web services in Spring MVC
is done by annotating a Java class with @RestController.
 */
@RequestMapping("/api") // this sets the base uri that all other uris must include
//@Controller
/*
@Controller annotation designates a Java class as a Spring MVC controller.
This simply means that the class handles HTTP requests in a Spring MVC application.
@Controller is a specialization of @Component,
allowing auto-detection of implementation classes through classpath scanning.
 */
//@ResponseBody
public class BookController {

    @RequestMapping("/hello-world") // @Controller is typically paired with @RequestMapping for request handling methods.
//    @ResponseBody // @ResponseBody is used on request handler methods to return the JSON as a response to the client.
    public String hello() {
        return "Hello World";
    }

    /*
    GET HTTP requests are used to get one or more resources,
    and using @GetMapping allows for mapping these requests to specific handler methods.
    It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.GET).
     */
    @GetMapping(value = {"/book", "/javabook", "/java"}, // setting multiple uri routes.
//    method = RequestMethod.GET, // setting an HTTP method with @RequestMapping.
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, // setting multiple produce types, the format which is produced by the method.
            consumes = MediaType.APPLICATION_JSON_VALUE // setting the format of data consumed by the method
    )
//    @ResponseBody
    public Book getBook() {
        Book book = new Book(1, "JAVA BOOK", "A book about learnin' JAVA");
        return book;
    }

    /*
    POST HTTP requests are used to create a resource,
    and using @PostMapping allows for mapping these requests to specific handler methods.
    It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.POST).
     */
    @PostMapping(value = "/books/create",
//            method = RequestMethod.POST
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
//    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        /*
        @RequestBody is responsible for retrieving the HTTP request body,
        and auto-converting it to Java object.
         */
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    /*
    PUT HTTP requests are used to update the resource,
    and using @PutMapping allows for mapping these requests to specific handler methods.
    It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.Put).
     */
    @PutMapping(
            value = "/books/update/{id}",
//            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        updatedBook.setId(id);
        return ResponseEntity.ok(updatedBook);
    }

    /*
    DELETE HTTP requests are used to delete the resource,
    and using @DeleteMapping allows for mapping these requests to specific handler methods.
    It is a composed annotation that acts as a shortcut for @RequestMapping(method=RequestMapping.DELETE).
     */
    @DeleteMapping(
            value = "/books/delete/{id}",
//            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        System.out.println(id);
        return ResponseEntity.ok("Delete book with id " + id);
    }
}