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
