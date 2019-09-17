package Programmers;

import java.util.Scanner;

public class FourBlock {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		String board[] = new String[m];
		for(int i=0; i<m; i++) {
			board[i]=sc.nextLine();
		}
		sc.close();
		
	}
}
