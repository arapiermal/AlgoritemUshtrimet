package ush1;

import java.util.Scanner;

public class Ush14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Jepni nje numer: ");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println("Numri "+n+" eshte cift");
		}
		else {
			System.out.println("Numri "+n+" eshte tek");
		}
	}

}
