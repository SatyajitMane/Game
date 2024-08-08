package com.solution.controler;

public class User {
    
	public String userChoise(int x) {
		String uChoise = "";
		switch(x) {
		case 1: uChoise ="stone";
		    break;
		case 2: uChoise ="paper";
	        break;
		case 3: uChoise ="scissor";
	        break;
	    default:System.out.println("Invalid Input!! Please Try Again");
		}
		
		return uChoise;
		
	}
}
