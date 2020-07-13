package com.gilxyj.simplefactory.counterexample;

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

    //准备原材料，不同的披萨不一样，因此，我们做成抽象方法
    abstract void prepare();

    void bake(){
        System.out.println(name + " banking...");
    }

    void cut(){
        System.out.println(name + " cutting...");
    }

    void box(){
        System.out.println(name + " boxing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
