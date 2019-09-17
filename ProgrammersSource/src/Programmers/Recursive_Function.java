package Programmers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Recursive_Function { //1부터 Num까지의 합
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int sum =0;
		sum+=sum(Num);
		int Arr[] =  new int[Num];
		int count = 0;
		System.out.println(sum);
		ArraysFill(Arr,count);
		printArrays(Arr,Arr.length);
		while(ArraysReserch(Arr, 0, sc.nextInt())==false) {
		ArraysReserch(Arr,0,sc.nextInt());
		}
		sc.close();
	}
	public static int sum(int N) {
		if(N==1) return N;
		else {
			return N+sum(N-1);
		}
	}
	public static int[] ArraysFill(int arr[],int index) {
		Random random = new Random();
		if(index==arr.length) return arr;
		else {
			arr[index]=random.nextInt(100);
			index++;
			return ArraysFill(arr,index);
		}
	}
	public static String printArrays(int arr[],int length) {
		String result="";
		if(length<1) return result;
		else {
			int index=(int)Math.abs(arr.length-length);
			System.out.println("index : "+index+" 의 값 : "+arr[index]);
			length--;
			return printArrays(arr,length);
		}
	}
	public static boolean ArraysReserch(int arr[],int begin ,int target) {
		if(begin==arr.length) {
			System.out.println("존재하지않습니다.");
			return false;
		}
		if(arr[begin]==target) {
			System.out.println("arr 배열 "+"index "+begin+"에 있습니다.");
			return true;
		}
		else {
			begin++;
			return ArraysReserch(arr,begin,target);
		}
	}
}
