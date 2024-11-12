package net.java.springannotations.controller;

import net.java.springannotations.service.Pizza;
import net.java.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//        ("pizzaDemo")

/*
@Component indicates that this annotated class is a Spring Bean 'component'.
It tells the Spring container to automatically create the Spring bean.
 */

public class PizzaController {

    private Pizza pizza;

//    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

//    @Autowired // field injection example
//    private VegPizza vegPizza;
    /*
    @Autowired is used to automatically inject a bean.
    It can be used in:
        constructor injection, injecting the bean withing the constructor
        setter injection, injecting the bean in the setter method
        field injection, injecting the bean as a class field
     */

//    @Autowired // constructor injection example
//    public PizzaController(@Qualifier("meatPizza") Pizza pizza) {
//        /*
//        @Qualifier is used in conjunction with @Autowired.
//        This is useful when we have many beans configured for the same type.
//        Here we have an interface, using @Qualifier we can tell it which implementation
//         of the interface to use.
//         */
//        this.pizza = pizza;
//    }

//    @Autowired // setter injection example
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza() {
        return pizza.getPizza();
    }


    /*
    @Bean annotation also provides initMethod and destroyMethod attributes,
    this is to perform certain actions between the Bean's initialization and destruction.
     */
    private void init() {
        // write logic for initialization, making sure the bean has everything it needs, such as data
        System.out.println("Initializing pizza controller");
    }

    private void destroy() {
        // write termination logic, destroying records etc., to ensure proper bean destruction.
        System.out.println("Destroying pizza controller");
    }
}
