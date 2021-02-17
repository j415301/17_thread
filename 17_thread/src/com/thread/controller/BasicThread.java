package com.thread.controller;

//기본 스레드 적용하기
public class BasicThread extends Thread{
	
	//1. Thread 객체를 상속받음
	//2. Thread 객체의 run 메소드를 override해서 처리
	@Override
	public void run() {
		//thread가 실행할 작업내용 구현
		for (int i=0 ; i<50 ; i++) {
			try {
				System.out.println(i+"상속받은 thread");
				sleep(500);//thread 실행을 잠시 지연시킴
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
