package com.example.coding.QijieMode;

public class LargeCoffee extends RefinedCoffee {
	LargeCoffee(ICoffeeAdditives additives) {
		super(additives);
	}

	@Override
	public void orderCoffee(int count) {
		System.out.print(String.format("大杯咖啡%d杯 ", count));
		additives.addSomething();
	}
}
