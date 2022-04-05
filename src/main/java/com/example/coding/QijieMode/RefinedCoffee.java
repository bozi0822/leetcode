package com.example.coding.QijieMode;

import java.util.Random;

public abstract class RefinedCoffee extends Coffee {
	public RefinedCoffee(ICoffeeAdditives additives) {
		super(additives);
	}

	public void checkQuality() {
		Random ran = new Random();
		System.out.println(String.format(
			"%s add%s ", additives.getClass().getSimpleName(),
			ran.nextBoolean() ? "Too much" : "Too less"
		));
	}
}
