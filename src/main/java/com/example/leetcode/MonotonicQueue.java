package com.example.leetcode;

import java.util.LinkedList;

public class MonotonicQueue {
	private LinkedList<Integer> q = new LinkedList<>();
	public void push(int n) {
		while (!q.isEmpty() && q.getLast() < n){
			q.pollLast();
		}
		q.addLast(n);
	}

	public int max(){
		return q.getFirst();
	}

	public void pop(int n) {
		if (q.getFirst() == n){
			q.pollFirst();
		}
	}
}



abstract class Car{
	abstract void drive();

	public static void main(String[] args) {
		Car benz = new Benz();
		benz.drive();
//		benz.amg();
//		Map<String,String> map = new HashMap<>();
//		map.put("","");
	}
}

class Benz extends Car{

	@Override
	void drive() {
		System.out.println("drive...");
	}

	void amg(){
		System.out.println("amg...");
	}
}