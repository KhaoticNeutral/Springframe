package net.java.springannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class MeatPizza implements Pizza {

    @Override
    public String getPizza() {
        return "Meat Pizza";
    }
}