package com.gilxyj.factorymethod;

public class ChicagoGreekPizza extends Pizza {

	public ChicagoGreekPizza() {
		super.name = "ChicagoGreekPizza";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作ChicagoGreekPizza 准备原材料 ");
	}

}
