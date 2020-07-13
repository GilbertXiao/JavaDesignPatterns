package com.gilxyj.abstractfactory.ingredientfactory;

import com.gilxyj.abstractfactory.cheese.Cheese;
import com.gilxyj.abstractfactory.sauce.Sauce;
import com.gilxyj.abstractfactory.veggie.Veggies;

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
 * @create: 2020-07-12 21:16
 **/
public interface PizzaIngredientFactory {
    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

}
