package ush1;

import java.util.Scanner;

public class Ush10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni vlerat a dhe b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Vlerat pas shkembimit:");
		System.out.println("a="+a+"\nb="+b);

	}
	
}
