package com.project.practice;

import java.util.Scanner;

public class Prog4 {
	public static void main(String args[]) {
		int a[]=new int[5];
		System.out.println("Input the 5 numbers :");
		for(int i=0;i<a.length;i++) {
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
			
		}
		int sum=0,avg=0;
		for( int i:a) {
			
			sum+=i;
			
		}
		avg=sum/a.length;
		System.out.println("Sum of 5 numbers :"+sum);
		System.out.println("Average of 5 numbers :"+avg);
	}

}
