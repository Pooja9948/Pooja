package com.BridgeLabzPrograms;

import java.util.Scanner;

public class TicTacToe {

	public static final int EMPTY = 0;
    public static final int CROSS = 1;
	public static final int NOUGHT = 2;
	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int NOUGHT_WON = 3;
	public static final int ROWS = 3, COLS = 3; 
	public static int[][] board = new int[ROWS][COLS];
	public static int currentState;
	public static int currentPlayer;
	public static int currntRow, currentCol;
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initGame();
		do {
	         playerMove(currentPlayer);
	         updateGame(currentPlayer, currntRow, currentCol);
	         printBoard();
	         // Print message if game-over
	         if (currentState == CROSS_WON) {
	            System.out.println("'X' won!!!");
	         } else if (currentState == NOUGHT_WON) {
	            System.out.println("'O' won!!!");
	         } else if (currentState == DRAW) {
	            System.out.println("It's a Draw!!!");
	         }
	         // Switch player
	         currentPlayer = (currentPlayer == CROSS) ? NOUGHT : CROSS;
	      } while (currentState == PLAYING);
	}
	public static void initGame() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            board[row][col] = EMPTY;
	         }
	      }
	      currentState = PLAYING;//0
	      currentPlayer = CROSS; //1
	}
	public static void playerMove(int s) {
	      boolean validInput = false; 
	      do {
	         if (s == CROSS) {
	            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
	         } else {
	            System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
	         }
	         int row = in.nextInt() - 1;
	         int col = in.nextInt() - 1;
	         if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) {
	            currntRow = row;
	            currentCol = col;
	            board[currntRow][currentCol] = s;
	            validInput = true;
	         } else {
	            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
	                  + ") is not valid. Try again...");
	         }
	      } while (!validInput); 
	}
	public static void updateGame(int s, int currentRow, int currentCol) {
	      if (hasWon(s, currentRow, currentCol)) {
	         currentState = (s == CROSS) ? CROSS_WON : NOUGHT_WON;
	      } else if (isDraw()) {
	         currentState = DRAW;
	      }
	 }
	public static boolean isDraw() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            if (board[row][col] == EMPTY) {
	               return false;
	            }
	         }
	      }
	      return true;
	}
	public static boolean hasWon(int s, int currentRow, int currentCol) {
	      return (board[currentRow][0] == s   
	                   && board[currentRow][1] == s
	                   && board[currentRow][2] == s
	              || board[0][currentCol] == s
	                   && board[1][currentCol] == s
	                   && board[2][currentCol] == s
	              || currentRow == currentCol    
	                   && board[0][0] == s
	                   && board[1][1] == s
	                   && board[2][2] == s
	              || currentRow + currentCol == 2
	                   && board[0][2] == s
	                   && board[1][1] == s
	                   && board[2][0] == s);
	}
	public static void printBoard() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            printCell(board[row][col]);
	            if (col != COLS - 1) {
	               System.out.print("|");
	            }
	         }
	         System.out.println();
	         if (row != ROWS - 1) {
	            System.out.println("-----------"); 
	         }
	      }
	      System.out.println();
	}
	 public static void printCell(int content) {
	      switch (content) {
	         case EMPTY:  System.out.print("   "); break;
	         case NOUGHT: System.out.print(" O "); break;
	         case CROSS:  System.out.print(" X "); break;
	      }
	   }

}
