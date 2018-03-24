package com.company;

public class TryThread extends Thread{
	String name;
	public TryThread(String name) {
		this.name = name; 
		}
	@Override
	public void run() {
		super.run();
		for(int i=0;i<1000;i++) {
			//System.out.println(name+": "+(i+1));
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------"+name+" DONE!!!");
	}
}
