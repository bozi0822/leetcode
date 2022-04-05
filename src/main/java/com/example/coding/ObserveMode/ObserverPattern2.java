package com.example.coding.ObserveMode;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern2 {
	public static void main(String[] args) {
		Cat1 cat1 = new Cat1();
		new Mouse1(cat1);
		new Mouse2(cat1);
		new Master1(cat1);
		cat1.cry();
	}

}

interface Observer1{
	void response();
}

interface Subject1{
	void aimAt(Observer1 observer);
}

abstract class Observer1Auto implements Observer1{

	Observer1Auto(Subject1 subject1) {
		subject1.aimAt(this);
	}

}


class Mouse1 extends Observer1Auto {

	Mouse1(Subject1 subject1) {
		super(subject1);
	}

	@Override
	public void response() {
		System.out.println(" Mouse1 run");
	}
}

class Mouse2 extends Observer1Auto {

	Mouse2(Subject1 subject1) {
		super(subject1);
	}

	@Override
	public void response() {
		System.out.println(" Mouse2 run");
	}
}

class Master1 extends Observer1Auto{

	Master1(Subject1 subject1) {
		super(subject1);
	}

	@Override
	public void response() {
		System.out.println(" Master awake");
	}
}


class Cat1 implements Subject1{

	private List<Observer1> observers = new ArrayList<>();

	@Override
	public void aimAt(Observer1 observer) {
		observers.add(observer);
	}

	public void cry(){
		observers.forEach(observer -> observer.response());
	}
}

