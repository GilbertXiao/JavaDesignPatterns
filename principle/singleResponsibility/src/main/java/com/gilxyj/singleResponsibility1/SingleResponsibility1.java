package com.gilxyj.singleResponsibility1;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-22 22:34
 **/
public class SingleResponsibility1 {

    //方式1 的run方法违反单一职责原则
    //解决的方案非常简单，根据交通工具运行方式不同，分解不同类即可。
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
