package com.gilxyj.abstractfactory.pizzastore;


import com.gilxyj.abstractfactory.ingredientfactory.NYPizzaIngredientFactory;
import com.gilxyj.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import com.gilxyj.abstractfactory.pizza.CheesePizza;
import com.gilxyj.abstractfactory.pizza.PepperPizza;
import com.gilxyj.abstractfactory.pizza.Pizza;
import com.gilxyj.abstractfactory.pizza.VeggiePizza;

import java.security.PublicKey;

/**
 * @program: javaDesignPatterns
 * @description:
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-07-07 01:55
 **/
public class NYPizzaStore implements PizzaStore{

    private final static String CHEESE_PIZZA = "cheese";
    private final static String VEGGIE_PIZZA = "viggie";
    private final static String PEPPER_PIZZA = "pepper";

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (CHEESE_PIZZA.equalsIgnoreCase(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(VEGGIE_PIZZA.equalsIgnoreCase(type)){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if(PEPPER_PIZZA.equalsIgnoreCase(type)){
            pizza = new PepperPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepper Pizza");
        }

        return pizza;
    }

}
