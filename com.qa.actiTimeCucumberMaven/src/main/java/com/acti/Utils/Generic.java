package com.acti.Utils;

import java.util.Random;

public class Generic {
	
	static Random rand;
	
	public static void fnWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static String getRandomCustomerName(int noCharacter) {
		rand = new Random();
		String s="Test Customer ";
		for(int i=0;i<noCharacter;i++) {
			char c = (char) ('a'+rand.nextInt(26));
			s = s+c;
			
		}
		return s;
		
		
		
		
	}

}
