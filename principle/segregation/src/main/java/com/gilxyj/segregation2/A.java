package com.gilxyj.segregation2;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-23 01:08
 **/
public class A {
    public void depend1(Interface1 inteface){
        inteface.operation1();
    }

    public void depend2(Interface2 inteface){
        inteface.operation2();
    }

    public void depend3(Interface2 inteface){
        inteface.operation3();
    }
}
