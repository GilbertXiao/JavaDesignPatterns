package com.gilxyj.abstractfactory;

import com.gilxyj.abstractfactory.pizza.Pizza;
import com.gilxyj.abstractfactory.pizzastore.ChicagoPizzaStore;
import com.gilxyj.abstractfactory.pizzastore.NYPizzaStore;
import com.gilxyj.abstractfactory.pizzastore.PizzaStore;

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
 * @create: 2020-07-05 22:24
 **/
public class OrderPizza {


    PizzaStore pizzaStore;

    public OrderPizza(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    public Pizza orderPizza(String type){
        Pizza pizza ;
        pizza = pizzaStore.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new NYPizzaStore());
        Pizza cheese = orderPizza.orderPizza("cheese");

        OrderPizza orderPizza1 = new OrderPizza(new ChicagoPizzaStore());
        Pizza cheese1 = orderPizza1.orderPizza("cheese");

    }
}
