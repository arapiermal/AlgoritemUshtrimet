package ermalarapi;

import java.util.Scanner;

public class Ush23 {
	public static final int BITS=4;
	public static void main(String[] args) {
		System.out.println("Jepni nje numer nga 0 ne 15");
		Scanner scan=new Scanner(System.in);
		int nr=scan.nextInt();
		int binar=neBinar(nr);
		System.out.printf("Numri ne binar eshte: %04d",binar);
	}
	public static int neBinar(int a) {
		if(a>=Math.pow(2,BITS))
			return 0;
		int b[]=new int[BITS];
		for(int i=0;i<b.length;i++) {
			b[i]=a%2;
			a/=2;
		}
		int binar=0;
		for(int i=0;i<b.length;i++) {
			binar+=b[i]*Math.pow(10, i);
		}
		return binar;
	}
}
