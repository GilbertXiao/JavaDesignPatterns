package com.gilxyj.segregation2;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-23 01:48
 **/
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); //A 类通过接口去依赖（使用）B
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());//C 类通过接口去依赖（使用）D
        c.depend4(new D());
        c.depend5(new D());

    }
}
