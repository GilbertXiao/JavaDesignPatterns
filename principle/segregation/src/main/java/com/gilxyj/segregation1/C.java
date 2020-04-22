package com.gilxyj.segregation1;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-23 01:08
 **/
public class C {
    public void depend1(Interface1 inteface1){
        inteface1.operation1();
    }

    public void depend4(Interface1 inteface1){
        inteface1.operation4();
    }

    public void depend5(Interface1 inteface1){
        inteface1.operation5();
    }
}
