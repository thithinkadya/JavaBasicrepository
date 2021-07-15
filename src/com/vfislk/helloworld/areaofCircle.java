package com.vfislk.helloworld;

public class areaofCircle {
	public static double areaCircle(int r){
		
		double area = 3.1428*r*r;
		return area;
	}

	public static double areatriangle(int b, int h){
		return 0.5*b*h;
	}
	public static void main(String[] args) {
		int r =10;
		double result = areaofCircle.areaCircle(r);
		System.out.println(result);
		int b=10,h=15;
		double res = areaofCircle.areatriangle(b, h);
		System.out.println(res);
	}

}
