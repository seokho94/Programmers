package Programmers;

import java.util.Scanner;

public class StringSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String word[] = {"ab","bc","cd","de","ef","fg","gh","hi","ij",""};
		int count = 0;
		for(int t=0; t<word.length-1; t++) {
			Sort(word, n, count);
		}
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}
	}
	public static String[] Sort(String word[], int n, int count) {
		int ch_index = n;
		if(count==word.length-1) return word;
		if(word[count].charAt(ch_index)>word[count+1].charAt(ch_index)) {
			Swap(word,count);
		}
		else if(word[count].charAt(ch_index)==word[count+1].charAt(ch_index)) {
			Equals(word,count,ch_index);
		}
		count++;
		return Sort(word,n,count);
	}
	public static void Swap(String word[], int index) {
		String tmp = word[index];
		word[index] = word[index+1];
		word[index+1] = tmp;
	}
	public static void Equals(String word[], int index,int ch_index) {
		ch_index++;
		if(word[index].charAt(ch_index)==word[index+1].charAt(ch_index)) {
			Equals(word,index,ch_index);
		}
		else if(word[index].charAt(ch_index)>word[index+1].charAt(ch_index)) {
			Swap(word,index);
		}
	}
}
