package com.gilxyj.segregation2;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-23 01:08
 **/
public class C {
    public void depend1(Interface1 inteface){
        inteface.operation1();
    }

    public void depend4(Interface3 inteface){
        inteface.operation4();
    }

    public void depend5(Interface3 inteface){
        inteface.operation5();
    }
}
