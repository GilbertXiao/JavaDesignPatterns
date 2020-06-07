package com.gilxyj.liskov1;

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
        A a = new A();
        System.out.println("1+2="+a.function1(1, 2));
        System.out.println("2+3="+a.function1(2, 3));

        System.out.println("-------------------------");

        A b = new B();
        System.out.println("1+2="+b.function1(1, 2)); //没想到B 已经改了继承的方法，造成结果错误
        System.out.println("2+3="+b.function1(2, 3));

    }
}
