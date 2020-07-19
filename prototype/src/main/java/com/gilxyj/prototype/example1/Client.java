package com.gilxyj.prototype.example1;

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
 * @create: 2020-07-14 01:22
 **/
public class Client {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("sun", 4, "White");

        //copy
        Monkey monkey1 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey2 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey3 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey4 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey5 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey6 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey7 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey8 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey9 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());
        Monkey monkey10 = new Monkey(monkey.getName(), monkey.getAge(), monkey.getColor());

    }
}
