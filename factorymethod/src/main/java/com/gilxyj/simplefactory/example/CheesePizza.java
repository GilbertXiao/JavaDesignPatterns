package com.gilxyj.simplefactory.example;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		super();
		super.name = "cheese";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作奶酪披萨 准备原材料 ");
	}

}
