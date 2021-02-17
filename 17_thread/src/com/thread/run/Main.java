package com.thread.run;

import com.thread.controller.BasicThread;
import com.thread.controller.InterThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �����ϱ�
		
		BasicThread t = new BasicThread();
		t.start();
		
		BasicThread t1 = new BasicThread();
		t1.start();
		
		
		//�������̽� ���� thread �����ϱ�
		Thread t2 = new Thread(new InterThread());
		t2.start();
		//
		
		
		
		//join() �޼ҵ� ���
		try {
			t2.join();//t2�� ���� thread ������ join��! -> t2�� �� ����� ������ main thread ���� X
			//join: �� �����尡 ���� ������ ��ٷ���! (���� thread�� ���� ����)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		for(int i=0 ; i<50 ; i++) {
			System.out.println(i+" : ���� thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		

		
	}

}
