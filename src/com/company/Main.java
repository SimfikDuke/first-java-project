package com.company;

public class Main {
	public static void main(String[] args) {
		TryThread[] threads = new TryThread[200];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new TryThread("---("+Integer.toString(i+1)+")---:");
			threads[i].start();
		}
		ContentList.mainWork();
		FileWork fileWork = new FileWork();
		fileWork.doSomeWork();
		System.out.print("Hello World");
	}
}
