package com.BridgeLabzPrograms;

import java.util.Random;
public class DeckOfCard {

	static int[][] card = new int[4][13];
	static String[][] res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  for (int i = 1; i <= 4; i++) {
		  for (int j = 0; j < 9; j++) {
			  allotOneCard(i);
		}
		  System.out.println("Player " + i + " cards:");
		  printCard(i);
		
	}
	}
	public static String cardType(int suitNumber){
		
 	   switch(suitNumber){
 		   case 1:
 			   return "Clubs";
 		   case 2:
 			  return "Diamonds";
 		   case 3:
 			  return "Hearts";
 		   case 4:
 			  return "Spades";
 	   }
 	   return null;
	}
	public static void allotOneCard(int playerNumber) {
		Random random = new Random();
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (card[suit][rank] != 0) {
			allotOneCard(playerNumber);
		} else {
			card[suit][rank] = playerNumber;
		}
	}
	public static void printCard(int playerNumber) {
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				if (card[suit][rank] == playerNumber) {
					//res[suit][rank]=cardType(suit);
					System.out.print(cardType(suit) + " " + rankType(rank) + "\t");
				}
			}
		}
		System.out.println("\n");
	}

	static String rankType(int rndm) {
    switch(rndm){
    case 1:
 	   return "2";
    case 2:
    	return "3";
    case 3:
    	return "4";
    case 4:
    	return "5";
    case 5:
    	return "6";
    case 6:
    	return "7";
    case 7:
    	return "8";
    case 8:
    	return "9";
    case 9:
    	return "10";
    case 10:
 	   return "Jack";
    case 11:
 	   return "Queen";
 	case 12:
 	   return "King";
 	case 13:
 	   return "Ace";
 	 }
	return null;
}

}
