package com.example.coding.threadOrderRun;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Solution1 {
	public static void main(String[] args) {
		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1,
			5000L, TimeUnit.HOURS, new ArrayBlockingQueue<>(2)
			);

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 run");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t2 run");
			}
		});

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t3 run");
			}
		});
		poolExecutor.submit(t1);
		poolExecutor.submit(t2);
		poolExecutor.submit(t3);
		poolExecutor.shutdown();
	}
}
