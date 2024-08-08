package com.solution.controler;

import java.util.Scanner;
public class Start {
	
	  Scanner sc= new Scanner(System.in);
	 
      Decision d = new Decision();//0 0
     
	  
      public void main() {
    	   
    	   System.out.println("************************************");
    	   System.out.print("Enter Your Choise \n 1.Stone \n 2.Paper \n 3.Scissor "
    	   	                	+ "\n your choise ::");
            int uchoise = sc.nextInt();
            User u = new User();
           String uc = u.userChoise(uchoise);
           
           Comp c = new Comp();
           String cc = c.cChoise();
           
           System.out.println("\nUser's Choise :: "+uc);
           System.out.println("Comp's Choise :: "+cc +"\n");
           d.ruleCheck(uc, cc);
         
    	   System.out.println("************************************");

      }
      
      public void StartGame() {
    	  System.out.println("***********Welcom to Rock Paper Scissor********");
          System.out.print("Enter the no. of rounds :: ");
          int rounds = sc.nextInt();
          int i = 1;
          Start s = new Start();
          
          while(true) {
        	  System.out.println("Round No. "+ i);
        	  s.main();
        	  
        	  if(i==rounds) {
        		break;  
        	  }
        	  i++;
          }
         d.rule();
         
         
  		
          
    	  
      }
	
}
