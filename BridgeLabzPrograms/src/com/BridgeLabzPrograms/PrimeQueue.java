package com.BridgeLabzPrograms;

import java.util.LinkedList;
import java.util.Scanner;

class QNode
{
    int key;
    QNode next;
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}
class Queue
{
    QNode front, rear;
      
    public Queue() {
        this.front = this.rear = null;
    }
     
    void enqueue(int key)
    {
        QNode temp = new QNode(key);
      
        if (this.rear == null)
        {
           this.front = this.rear = temp;
           return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
}
public class PrimeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		for(int i=0;i<10;i++){
			System.out.println("enter number");
			int n=sc.nextInt();
			q.enqueue(n);
			
		}
	}
	 
}
