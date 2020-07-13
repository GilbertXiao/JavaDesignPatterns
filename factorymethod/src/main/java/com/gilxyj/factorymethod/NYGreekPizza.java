package com.gilxyj.factorymethod;

public class NYGreekPizza extends Pizza {

	public NYGreekPizza() {
		super.name = "NYGreekPizza";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作NYGreekPizza 准备原材料 ");
	}

}
