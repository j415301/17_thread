package com.thread.controller;

//�⺻ ������ �����ϱ�
public class BasicThread extends Thread{
	
	//1. Thread ��ü�� ��ӹ���
	//2. Thread ��ü�� run �޼ҵ带 override�ؼ� ó��
	@Override
	public void run() {
		//thread�� ������ �۾����� ����
		for (int i=0 ; i<50 ; i++) {
			try {
				System.out.println(i+"��ӹ��� thread");
				sleep(500);//thread ������ ��� ������Ŵ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
