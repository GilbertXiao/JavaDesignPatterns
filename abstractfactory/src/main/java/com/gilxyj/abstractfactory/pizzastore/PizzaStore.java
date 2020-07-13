package com.gilxyj.abstractfactory.pizzastore;

import com.gilxyj.abstractfactory.pizza.Pizza;

public interface PizzaStore {
    Pizza createPizza(String type);
}
