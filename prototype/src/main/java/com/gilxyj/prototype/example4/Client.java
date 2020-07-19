package com.gilxyj.prototype.example4;

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
 * @create: 2020-07-19 15:00
 **/
public class Client {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("aaa");

        Stack stack1 = stack.deepClone();
        System.out.println(stack1);

    }
}
