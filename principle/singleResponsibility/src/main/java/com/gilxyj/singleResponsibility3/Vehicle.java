package com.gilxyj.singleResponsibility3;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-22 22:33
 **/
public class Vehicle {

    public void run (String vehicle){
        System.out.println(vehicle+"在公路运行");
    }

    public void runAir (String vehicle){
        System.out.println(vehicle+"在天空运行");
    }

    public void runWater (String vehicle){
        System.out.println(vehicle+"在水中运行");
    }
}
