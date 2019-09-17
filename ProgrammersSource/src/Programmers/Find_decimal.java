package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Find_decimal {
	public static void main(String args[]) {
		int decimal[] = new int[1000000];
		Arrays.fill(decimal, 1);
		for(int i=0; i<decimal.length; i++) {
			int multiply = 2;
			if(i<2) {
				decimal[i]=0;
			}
			else {
				if(decimal[i]==1) {
					int num = decimal[i];
					while(num<=decimal.length) {
						decimal[num*multiply]=0;
						multiply++;
					}
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		String number =sc.nextLine();
		System.out.println(Serch(number,decimal));
	}
	public static int Serch(String number, int[] decimal) {
		int count=0;
		int length=1;
		StringBuilder sb = new StringBuilder();
		while(length<=number.length()) {
			sb.setLength(length);
			
		}
		return count;
	}
}
