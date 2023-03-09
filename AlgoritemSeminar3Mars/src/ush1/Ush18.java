package ush1;

import java.util.Scanner;

public class Ush18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Sa pike mori studenti: ");
		int pike=scan.nextInt();
		int nota;
		if(pike>=90)
			nota=10;
		else if(pike>=80)
			nota=9;
		else if(pike>=70)
			nota=8;
		else if(pike>=60)
			nota=7;
		else if(pike>=50)
			nota=6;
		else if(pike>=40)
			nota=5;
		else
			nota=4;
		System.out.println("Nota e marre eshte "+nota);

	}
}
