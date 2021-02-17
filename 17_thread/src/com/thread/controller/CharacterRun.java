package com.thread.controller;

import java.util.Scanner;

import com.thread.model.vo.Character;

public class CharacterRun extends Thread{
	
	private Character c;
	
	public CharacterRun(Character c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				sleep((int)(Math.random()*1000)+500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int damage = (int)(Math.random()*30)+1;
			System.out.print(c.getName()+"님 버튼을 누르세요 (1,2,3) : ");
			int cho = sc.nextInt();
			
			int com = (int)(Math.random()*3)+1;
			if (cho != com) {
				System.out.println(c.getName()+"님이 "+damage+" 공격을 받았습니다.");
				c.setHp(c.getHp()-damage);
			} else {
				System.out.println(c.getName()+"님이 공격을 피했습니다.");
			}
			
			if (c.getHp()<0) {
				System.out.println(c.getName()+"님이 공격에 의해 로그아웃했습니다.");
				break;
			}
		}
	}
}
