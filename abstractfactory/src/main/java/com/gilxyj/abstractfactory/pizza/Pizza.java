package com.gilxyj.abstractfactory.pizza;

import com.gilxyj.abstractfactory.cheese.Cheese;
import com.gilxyj.abstractfactory.sauce.Sauce;
import com.gilxyj.abstractfactory.veggie.Veggies;

import java.util.Arrays;

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
 * @create: 2020-07-05 22:13
 **/
public abstract class Pizza {

    String name;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;

    //准备原材料，不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " banking...");
    }

    public void cut(){
        System.out.println(name + " cutting...");
    }

    public void box(){
        System.out.println(name + " boxing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                '}';
    }
}
