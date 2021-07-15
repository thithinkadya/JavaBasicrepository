package com.vfislk.assignment;

public class Assign1 {

	public static void main(String[] args) {
		System.out.println("USING FOR LOOP");
		System.out.println("Even numbers");
		for ( int i = 0; i<=30;i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Odd numbers");
		for ( int i = 1; i<=30;i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("FOR WHILE LOOP");
		int i = 0;
		while (i<=30) {
			System.out.print(i+" ");
			i= i+2;
		}
		System.out.println();
		int j = 1;
		while (j<=30) {
			System.out.print(j+" ");
			j= j+2;
		}

	}

}
