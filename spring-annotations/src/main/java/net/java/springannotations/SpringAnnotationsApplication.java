package net.java.springannotations;

import net.java.springannotations.configurationproperties.AppPropertiesDemo;
import net.java.springannotations.controller.MyController;
import net.java.springannotations.controller.PizzaController;
import net.java.springannotations.lazy.LazyLoader;
import net.java.springannotations.repository.MyRepository;
import net.java.springannotations.service.MyService;
import net.java.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  SpringAnnotationsApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
//        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//        System.out.println(pizzaController.getPizza());

//        VegPizza vegPizza = context.getBean(VegPizza.class);
//        VegPizza vegPizza = context.getBean("vegPizzaBean");
//        VegPizza vegPizza = context.getBean("vegPizza");
//        System.out.println(vegPizza.getPizza());

        MyController myController = (MyController) context.getBean("myController");
        System.out.println(myController.hello());

        MyService myService = (MyService) context.getBean("myService");
        System.out.println(myService.hello());

        MyRepository myRepository = (MyRepository) context.getBean("myRepository");
        System.out.println(myRepository.hello());

        AppPropertiesDemo appPropertiesDemo = (AppPropertiesDemo) context.getBean(AppPropertiesDemo.class);
        appPropertiesDemo.display();

        LazyLoader lazyLoader = (LazyLoader) context.getBean(LazyLoader.class); // once created, the Bean will load lazily

    }
}
