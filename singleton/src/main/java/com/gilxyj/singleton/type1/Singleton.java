package com.gilxyj.singleton.type1;

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
 * @create: 2020-06-13 21:49
 **/
//饿汉式（静态常量）
public class Singleton {

    //1. 构造器私有化（防止new）
    private Singleton(){
    }

    //2. 类的内部创建对象
    private final static Singleton instance = new Singleton();

    //3. 对外暴露一个静态的公共方法。getInstance
    public static Singleton getInstance(){
        return instance;
    }
}
