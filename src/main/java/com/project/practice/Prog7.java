package com.project.practice;

public class Prog7 {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("minimum number in a given array"+min);
		System.out.println("maximum number in a given array"+max);
	}

}
