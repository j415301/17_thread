package com.thread.controller;

//Runnable �������̽��� �����ؼ� �����ϴ� ���
public class InterThread implements Runnable{
	
	@Override
	public void run() {
		for (int i=0 ; i<50 ; i++) {
			System.out.println(i+" : InterThread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
