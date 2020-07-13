package com.gilxyj.factorymethod;



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
    private final static String GREEK_PIZZA = "greek";
    private final static String PEPPER_PIZZA = "pepper";

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (CHEESE_PIZZA.equalsIgnoreCase(type)) {
            pizza = new NYGreekPizza();
        } else if (GREEK_PIZZA.equalsIgnoreCase(type)) {
            pizza = new NYGreekPizza();
        } else if (PEPPER_PIZZA.equalsIgnoreCase(type)) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
