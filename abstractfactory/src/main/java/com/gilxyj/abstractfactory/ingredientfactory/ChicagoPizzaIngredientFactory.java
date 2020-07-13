package com.gilxyj.abstractfactory.ingredientfactory;

import com.gilxyj.abstractfactory.cheese.Cheese;
import com.gilxyj.abstractfactory.cheese.MozzarellaCheese;
import com.gilxyj.abstractfactory.sauce.Sauce;
import com.gilxyj.abstractfactory.sauce.TomatoSauce;
import com.gilxyj.abstractfactory.veggie.*;

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
 * @create: 2020-07-12 21:18
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Oregano(),new BlackOlive(),new eggplant(),new WhitePepper()};
        return veggies;
    }
}
