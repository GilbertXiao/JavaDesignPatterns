package com.gilxyj.factorymethod;

public class ChicagoCheesePizza extends Pizza {

	public ChicagoCheesePizza() {
		super.name = "ChicagoCheesePizza";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作ChicagoCheesePizza 准备原材料 ");
	}

}
