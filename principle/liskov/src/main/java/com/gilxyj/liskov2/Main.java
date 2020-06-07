package com.gilxyj.liskov2;

/**
 * @program: principle
 * @description:
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-05-23 17:05
 **/
public class Main {

    public static void main(String[] args) {
        Base a = new A();
        System.out.println("1+2="+a.function1(1, 2));
        System.out.println("2+3="+a.function1(2, 3));

        System.out.println("-------------------------");

        Base b = new B();
        System.out.println("1-2="+b.function1(1, 2));
        System.out.println("2-3="+b.function1(2, 3));

    }
}
