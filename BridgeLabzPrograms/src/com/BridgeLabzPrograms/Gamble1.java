package com.BridgeLabzPrograms;

public class Gamble1 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		 // try{
        int stake=Integer.parseInt(args[0]);
        int goal=Integer.parseInt(args[1]);
        int trial=Integer.parseInt(args[2]);
		// }catch(NumberFormatException e){
		//        System.out.println("Exception caught!!!");
		//        e.printStackTrace();
		//}
		int win=0;
		int bet=0;
		int lose=0;
		for(int t=0;t<trial;t++){
			int cash=stake;
			while(cash>0 && cash<goal){
				bet++;
				if(Math.random() > 0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goal)
				win++;
			if(cash==0)
				lose++;
		}
		if(win==1){
		System.out.println(win + " wins of " + trial);
		System.out.println("Percent of games won = " + 100.0 * win / trial);
		}
		if(lose==1){
		System.out.println(lose + " loses of " + trial);
		System.out.println("Percent of games lose = " + 100.0 * lose / trial);
		}
		System.out.println("Avg bets = " + 1.0 * bet / trial);

	}

}
