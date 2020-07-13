package com.gilxyj.simplefactory.example;

import java.text.DateFormat;

public class PepperPizza extends Pizza {

	public PepperPizza() {
		super();
		super.name = "pepper";
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给制作胡椒披萨 准备原材料 ");
	}

}
