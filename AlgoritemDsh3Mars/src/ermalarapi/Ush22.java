package ermalarapi;

import java.util.Scanner;

public class Ush22 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Sa i keni te ardhurat: ");
		int teArdhurat=scan.nextInt();
		System.out.println("Taksa juaj eshte: "+llogaritTaksen(teArdhurat));
	}
	public static double llogaritTaksen(int lek) {
		double taksa;
		if(lek<28000)
			taksa=0;
		else if(lek<50000)
			taksa=0.2*(lek-28000);
		else if(lek<100000)
			taksa=4400+0.3*(lek-50000);
		else
			taksa=19400+0.3*(lek-100000);
		return taksa;
	}
}
