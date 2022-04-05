package com.example.coding.threadOrderRun;

public class Solution2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 run");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					t1.join();
					System.out.println("t2 run");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					t2.join();
					System.out.println("t3 run");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
		t3.start();


	}
}
