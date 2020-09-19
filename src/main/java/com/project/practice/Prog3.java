package com.project.practice;

import java.util.Formatter;
import java.util.Scanner;

public class Prog3 {
	
		public static void main(String args[]) {
			int a;
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			Formatter f=new Formatter();
			
			System.out.println(f.format("%o", a));
		}
	}

