package net.java.springannotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
/*
By default, Spring eagerly creates all singleton beans at startup of the application context.
The @Lazy annotation allows for Spring beans to load lazily (on-demand).
@Lazy can be used in conjunction with @Configuration, @Component and @Bean annotations
 */
public class LazyLoader {
    public LazyLoader() {
        System.out.println("LazyLoader...");
    }
}
