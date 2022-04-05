package com.example.coding.t10;

public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();
		System.out.println("I gonna stop it stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
