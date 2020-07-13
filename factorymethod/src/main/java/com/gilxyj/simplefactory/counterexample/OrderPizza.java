package com.gilxyj.simplefactory.counterexample;

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

    private final static String CHEESE_PIZZA = "cheese";
    private final static String GREEK_PIZZA = "greek";
    private final static String PEPPER_PIZZA = "pepper";

    public OrderPizza(String type){
        Pizza pizza = null;
        if (CHEESE_PIZZA.equalsIgnoreCase(type)) {
            pizza = new CheesePizza();
        } else if (GREEK_PIZZA.equalsIgnoreCase(type)) {
            pizza = new GreekPizza();
        } else if (PEPPER_PIZZA.equalsIgnoreCase(type)) {
            pizza = new PepperPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
