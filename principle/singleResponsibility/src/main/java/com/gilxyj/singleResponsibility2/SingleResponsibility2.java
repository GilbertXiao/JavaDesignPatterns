package com.gilxyj.singleResponsibility2;

import com.gilxyj.singleResponsibility1.Vehicle;

/**
 * @program: principle
 * @description:
 * @author: GilbertXiao
 * @create: 2020-04-22 22:34
 **/
public class SingleResponsibility2 {

    //方式2 遵守了单一职责，但是这样的改动很大，即将类分解，同时修改客户端。
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("潜水艇");
    }
}
