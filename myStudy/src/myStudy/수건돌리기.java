package myStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 수건돌리기 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		Queue<Integer> jo = new LinkedList<Integer>();
		Queue<Integer> jos = new LinkedList<Integer>();
		
		System.out.print("m = ");
		int m = input.nextInt();
		
		for(int i=0; i<n; i++){
			jo.offer(i+1);		// 순차보관
		}
		
		System.out.println("jo peek = " + jo.peek());
				
		int count =	1;
		
		while(!jo.isEmpty()){
			if(count % m == 0){
				jos.offer(jo.poll());
			}
			if(count % m != 0){
				jo.offer(jo.poll()); // 뺏다가 다시 넣으면 순서가 원래대로 돌아감.
			}
			count++;
		}
		
		
		System.out.print("<"+jos.poll());		
		while(!jos.isEmpty()){
			System.out.print(", "+jos.poll());
		}		
		System.out.print(">");
	}
}
