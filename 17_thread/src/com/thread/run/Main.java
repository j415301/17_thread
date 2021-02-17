package com.thread.run;

import com.thread.controller.BasicThread;
import com.thread.controller.InterThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쓰레드 실행하기
		
		BasicThread t = new BasicThread();
		t.start();
		
		BasicThread t1 = new BasicThread();
		t1.start();
		
		
		//인터페이스 구현 thread 실행하기
		Thread t2 = new Thread(new InterThread());
		t2.start();
		//
		
		
		
		//join() 메소드 사용
		try {
			t2.join();//t2가 메인 thread 이전에 join함! -> t2가 다 실행될 때까지 main thread 실행 X
			//join: 이 쓰레드가 끝날 때가지 기다려라! (다음 thread의 실행 저지)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		for(int i=0 ; i<50 ; i++) {
			System.out.println(i+" : 메인 thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		

		
	}

}
