package com.gilxyj.factorymethod;

public class NYCheesePizza extends Pizza {

	public NYCheesePizza() {
		super.name = "NYCheesePizza";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作NYCheesePizza 准备原材料 ");
	}

}
