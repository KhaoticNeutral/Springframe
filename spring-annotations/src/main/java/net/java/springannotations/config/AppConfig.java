package net.java.springannotations.config;

import net.java.springannotations.controller.PizzaController;
import net.java.springannotations.service.MeatPizza;
import net.java.springannotations.service.Pizza;
import net.java.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// if @Lazy were used here, all spring beans created through this config would load lazily.
public class AppConfig {

    @Bean
    /*
    @Bean is used to indicate a method that produces a bean that is handled by the Spring container.
    It is typically declared inside a Configuration class to create Spring Bean definitions.
    The bean made from this method has the same name as the method,
    but this can be set using @Bean(name="beanName").
    */
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    // if @Lazy were used here only this Bean would load lazily
    public Pizza meatPizza() {
        return new MeatPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(meatPizza());
    }
}
