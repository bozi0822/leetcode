package com.example.coding.QijieMode;

public class Main {
	public static void main(String[] args) {
		RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
		largeWithMilk.orderCoffee(2);
		largeWithMilk.checkQuality();
	}
}
