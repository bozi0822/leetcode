package com.example.coding.t10;

public class PrintString implements Runnable {

	private boolean isContinuePrint = true;

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	@Override
	public void run() {
		printStringMethod();
	}

	private void printStringMethod() {

		try {
			while (isContinuePrint == true) {
				System.out.println("run printStringMethod threadName="
					+ Thread.currentThread().getName()
				);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
