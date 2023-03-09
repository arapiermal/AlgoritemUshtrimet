package ermalarapi;

import java.util.Scanner;

public class Ush17 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Jepni 2 numra: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		veprime(a,b);
		
	}
	public static void veprime(int a, int b) {
		if(b>a) {
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.println("Numri me i madh: "+a+"\nNumri me i vogel: "+b);
		int sum=a+b;
		int dif=a-b;
		int prod=a*b;
		int div=a/b;
		System.out.println("Shuma eshte: "+sum+"\nDiferenca eshte: "+dif);
		System.out.println("Prodhimi eshte: "+prod+"\nHeresi eshte: "+div);

	}
}
