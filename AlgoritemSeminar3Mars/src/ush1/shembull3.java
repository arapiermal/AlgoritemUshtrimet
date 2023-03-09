package ush1;

import java.util.Scanner;

public class shembull3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ekuacioni a*x^2+b*x+c, jepni vlerat e a, b, dhe c");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		gjejVlerat(a,b,c);
	}
	
	public static void gjejVlerat(int a, int b, int c) {
		double D=b*b-4*a*c;
		System.out.println("Ekuacioni eshte: ("+a+")*x^2+("+b+")*x+("+c+")");
		System.out.println("Dallori eshte: "+D);
		if(D>0) {
			double x1=(-b+Math.sqrt(D))/(2*a);
			double x2=(-b-Math.sqrt(D))/(2*a);
			System.out.println("Dallori eshte pozitiv, keshtu qe ka 2 rrenje reale: \nx1="+x1+"\nx2="+x2);
		}
		else if(D==0) {
			double x=-b/(4*a);
			System.out.println("Dallori eshte 0, keshtu qe ka vetem nje rrenje reale: \nx="+x);
		}
		else {
			System.out.println("Dallori eshte negativ, keshtu qe s'ka rrenje reale");
		}
	}
}
