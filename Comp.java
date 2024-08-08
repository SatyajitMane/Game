package com.solution.controler;

import java.util.Random;

public class Comp {

	public String cChoise() {
		Random r = new Random();
		int x = r.nextInt(1,4);
		
		String cChoise = "";
		switch(x) {
		case 1: cChoise ="stone";
		    break;
		case 2: cChoise ="paper";
	        break;
		case 3: cChoise ="scissor";
	        break;
	    default:System.out.println("Invalid Input!! Please Try Again");
		}
		
		return cChoise;
	}
}
