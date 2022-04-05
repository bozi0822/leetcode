package com.example.coding.threadOrderRun;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Solution3 {

	private static Boolean allowT2Run = false;
	private static Boolean allowT3Run = false;

	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	public static void main(String[] args) {



		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1){
					System.out.println("t1 run");
					allowT2Run = true;
					lock1.notify();
				}

			}
		});


		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1){
					if (!allowT2Run){
						try {
							System.out.println("t2 wait");
							lock1.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("t2 run");

					synchronized (lock2){
						allowT3Run = true;
						lock2.notify();
					}
				}


			}
		});


		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock2){
					if (!allowT3Run){
						try {
							System.out.println("t3 wait");
							lock2.wait();
						} catch (Exception e){
							e.printStackTrace();
						}
					}

					System.out.println("t3 run");

				}
			}
		});


		t1.start();
		t2.start();
		t3.start();

	}

}
