package ush1;

import java.util.Scanner;

public class Ush11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Jepni kohen totale ne sekonda: ");
		int t=scan.nextInt();
		shfaqRezultatin(t);
	}
	public static void shfaqRezultatin(int sek) {
		int min=sek/60;
		sek=sek%60;
		int h=min/60;
		min=min%60;
		System.out.println(h + " ore e " + min + " minuta e " + sek + " sekonda");
	}
}
