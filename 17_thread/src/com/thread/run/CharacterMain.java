package com.thread.run;

import com.thread.controller.CharacterRun;
import com.thread.model.vo.Character;

public class CharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharacterRun sng = new CharacterRun(new Character(50,1,"�����"));
		CharacterRun kim = new CharacterRun(new Character(30,2,"������"));
		CharacterRun yoo = new CharacterRun(new Character(10000,1,"������"));
		
		sng.start();
		kim.start();
		yoo.start();

	}

}
