package com.gilxyj.prototype.example2;

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
 * @create: 2020-07-18 00:03
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Monkey monkey = new Monkey("tom", 2, "white");
        Monkey monkey1 = monkey.clone();
        Monkey monkey2 = monkey.clone();
        Monkey monkey3 = monkey.clone();
        Monkey monkey4 = monkey.clone();
        Monkey monkey5 = monkey.clone();
        System.out.println(monkey);
        System.out.println(monkey1);
        System.out.println(monkey2);
        System.out.println(monkey3);
        System.out.println(monkey4);
        System.out.println(monkey5);
    }
}
