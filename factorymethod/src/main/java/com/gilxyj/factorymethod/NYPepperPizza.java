package com.gilxyj.factorymethod;

public class NYPepperPizza extends Pizza {

	public NYPepperPizza() {
		super.name = "NYPepperPizza";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作NYPepperPizza 准备原材料 ");
	}

}
