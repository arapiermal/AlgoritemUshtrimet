package ush1;

import java.util.Scanner;

public class Ush13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Jepni vleren e rrezes: ");
		int r=scan.nextInt();
		double P=2*Math.PI*r;
		double S=Math.PI*r*r;
		System.out.println("Perimetri i rrethit eshte "+P);
		System.out.println("Siperfaqja e rrethit eshte "+S);

	}
}
