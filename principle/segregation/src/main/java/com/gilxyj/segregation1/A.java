package com.gilxyj.segregation1;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-23 01:08
 **/
public class A {
    public void depend1(Interface1 inteface1){
        inteface1.operation1();
    }

    public void depend2(Interface1 inteface1){
        inteface1.operation2();
    }

    public void depend3(Interface1 inteface1){
        inteface1.operation3();
    }
}
