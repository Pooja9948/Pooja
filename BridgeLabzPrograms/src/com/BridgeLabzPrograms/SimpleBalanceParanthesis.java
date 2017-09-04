package com.BridgeLabzPrograms;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Pooja
 *
 */
public class SimpleBalanceParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an arithmetic expression");
	String st=sc.nextLine();
	boolean b=balancedParenthensies(st);
	if(b)
		System.out.println("The arithmetic expression is balanced");
	else
			System.out.println("The arithmetic expression is not balanced");
	}
	/**
	 * @param string
	 * @return boolean
	 * 
	 * balanced paranthesis
	 */
	public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
