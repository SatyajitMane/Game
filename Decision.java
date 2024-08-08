package com.solution.controler;

public class Decision {
      public static int userScore ;
      public static int compScore ;
	
	public void ruleCheck(String uc ,String cc) {
		if((uc.equals("paper") && cc.equals("stone")) ||
		    (uc.equals("stone") && cc.equals("scissor")) ||
		    (uc.equals("scissor") && cc.equals("paper"))) {
			System.out.println("User Won this Round\n");
			userScore++;
			
		}
		else if((cc.equals("paper") && uc.equals("stone")) ||
			    (cc.equals("stone") && uc.equals("scissor")) ||
			    (cc.equals("scissor") && uc.equals("paper"))) {
			System.out.println("Comp Won this Round\n");
			compScore++;
		}
		else {
			System.out.println("This Round is tie you both Selected Same Option\n");
		}
		
		System.out.println("User's Score :: "+userScore);
		System.out.println("Comp's Score :: "+compScore);
		
	}
	
	public void rule() {
		 if(userScore > compScore) {
        	  System.out.println("User won this Game with score of "+userScore);
          }
          else if(userScore < compScore) {
        	  System.out.println("Comp won this Game with score of "+compScore);
          }
          else {
        	  System.out.println("The Game is Tie\n Thank you for playing");
          }
        
	}
}
