package net.java.springannotations.repository;

import org.springframework.stereotype.Repository;

@Repository /*
Stereotype annotations are used to automatically create Spring beans in the Spring container.
the main Stereotype annotation is @Component.
Spring provides several other Stereotype meta annotations like @Repository,
used to create Beans for repositories at the DAO layer, where all database related logic is kept.
 */
public class MyRepository {
    public String hello() {
        return "Hello, this is a repository...";
    }
}
