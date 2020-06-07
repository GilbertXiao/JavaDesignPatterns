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
 * @create: 2020-05-23 17:04
 **/
public class B extends A{

    //change function1 of A by accident
    @Override
    public Integer function1(int a, int b) {
        return a-b;
    }
}
