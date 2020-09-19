package com.project.practice;

import java.util.Scanner;

public class Prog6 {
	public static void main(String args[]) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int b=1;b<=a;b++) { //row
			for(int c=1;c<=b;c++) { //column
				if(c==1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.print(b);
		}
	}


}
