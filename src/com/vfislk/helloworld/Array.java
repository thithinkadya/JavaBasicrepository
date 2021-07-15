package com.vfislk.helloworld;

public class Array {
	public static void main(String[] args) {
		int mark = 40;
		if (mark>90) {
			System.out.println("Grade A");
		}
		else if (mark>80 && mark<90) {
			System.out.println("Grade B");
		}
		else if (mark>60 && mark < 80) {
			System.out.println("Grade C");
		}
		else if ( mark < 60) {
			System.out.println("Grade F");
		}
	}
}
