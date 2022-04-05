package com.example.coding.ObserveMode;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
	public static void main(String[] args) {
		Debit zhangsan = new ZhangSan();
		zhangsan.borrow(new Wangwu());
		zhangsan.borrow(new Zhaosi());

		zhangsan.notifyCredits();

	}


}

interface Debit {
	void borrow(Credit credit);
	void notifyCredits();
}

class ZhangSan implements Debit{

	List<Credit> credits =new ArrayList<>();

	@Override
	public void borrow(Credit credit) {
		credits.add(credit);
	}

	@Override
	public void notifyCredits() {
		credits.forEach(credit -> {
			credit.takeMoney();
		});
	}
}

interface Credit{
	void takeMoney();
}

class Wangwu implements Credit{

	@Override
	public void takeMoney() {
		System.out.println("Wangwu takes money");
	}
}

class Zhaosi implements Credit{

	@Override
	public void takeMoney() {
		System.out.println("Zhaosi takes money");
	}
}