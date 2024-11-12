package net.java.springannotations.lazy;

import org.springframework.stereotype.Component;

@Component
// Loading beans eagerly (at startup) is recommended, this is to avoid late error detections.
public class EagerLoader {
    public EagerLoader() {
        System.out.println("EagerLoader...");
    }
}
