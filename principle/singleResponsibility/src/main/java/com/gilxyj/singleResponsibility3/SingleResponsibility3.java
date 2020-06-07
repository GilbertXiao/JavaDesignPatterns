package com.gilxyj.singleResponsibility3;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-22 22:34
 **/
public class SingleResponsibility3 {

    //方式3 只是增加了方法。虽然没有类这个级别上遵守单一职责原则，但是在方法的级别上，仍然准备单一职责原则的。
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.runAir("飞机");

        int i = Math.floorMod(-4, 3);
        System.out.println(i);
        System.out.println(-3 ^ 3);
    }
}
