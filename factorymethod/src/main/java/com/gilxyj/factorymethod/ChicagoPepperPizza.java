package com.gilxyj.factorymethod;

public class ChicagoPepperPizza extends Pizza {

	public ChicagoPepperPizza() {
		super.name = "ChicagoPepperPizza";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作ChicagoPepperPizza 准备原材料 ");
	}

}
