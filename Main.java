package tersYildizCizme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Üçgen kaç satýrdan oluþacak: ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=(n*2)-1;j>2*i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
