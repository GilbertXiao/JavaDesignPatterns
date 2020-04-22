package com.gilxyj.segregation2;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-23 01:06
 **/
public class B implements Interface1,Interface2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

}
