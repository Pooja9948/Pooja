package com.BridgeLabzPrograms;

import java.util.Random;
public class DeckOfCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   char[][] card=new char[4][13];
       int cardtype=cardType();
       for(int i=0;i<36;i++){
    	   Random rand=new Random();
    	   int rndm = rand.nextInt(13);
	       switch(rndm){
	       case 1:
	    	   System.out.println("2");
	    	   break;
	       case 2:
	    	   System.out.println("3");
	    	   break;
	       case 3:
	    	   System.out.println("4");
	    	   break;
	       case 4:
	    	   System.out.println("5");
	    	   break;
	       case 5:
	    	   System.out.println("6");
	    	   break;
	       case 6:
	    	   System.out.println("7");
	    	   break;
	       case 7:
	    	   System.out.println("8");
	    	   break;
	       case 8:
	    	   System.out.println("9");
	    	   break;
	       case 9:
	    	   System.out.println("10");
	    	   break;
	       case 10:
	    	   System.out.println("Jack");
	    	   break;
	       case 11:
	    	   System.out.println("Queen");
	    	   break;
	       case 12:
	    	   System.out.println("King");
	    	   break;
	       case 13:
	    	   System.out.println("Ace");
	    	   break;
	       }
        }
       
	}
	public static int cardType(){
		Random rand=new Random();
 	   int rndm = rand.nextInt(4);
 	   switch(rndm){
 		   case 1:
 			   System.out.println("Clubs");
 			   
 			   break;
 		   case 2:
 			  System.out.println("Diamonds");
 			
			   break;
 		   case 3:
 			  System.out.println("Hearts");
 			
			   break;
 		   case 4:
 			  System.out.println("Spades");
 			 
			   break;
 	   }
 	   return rndm;
	}
	public static void allotOneCard(int playerNumber) {
		Random random = new Random();
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (card[suit][rank] != 0) {
			allotOneCard(playerNumber);
		} else {
			cards[suit][rank] = playerNumber;
		}
	}

}
