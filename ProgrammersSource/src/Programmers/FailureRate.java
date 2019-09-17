package Programmers;

import java.util.Arrays;

public class FailureRate {
	public static int[] solution(int N, int[] stages) {
		double count[] = new double[501];
		int answer[] = new int[N];
		for(int i=0; i<stages.length; i++) {
			if(stages[i]<6) {
				count[stages[i]]++;
			}
		}
		double rate[] = new double[N+1];
		double Rank[] = new double[N+1];
		double People = stages.length;
		for(int i=0; i<N+1; i++) {
			if(People==0) {
				rate[i]=0;
				Rank[i] = rate[i];
			}
			else {
				rate[i] = count[i]/People;
				Rank[i] = rate[i];
			}
			People-=count[i]; //People이 0이 된다면 런타임 에러
		}
		Arrays.sort(Rank);
		Reverse(Rank);
		int k=0;
		for(int i=1; i<Rank.length; i++) {
			answer[k] = Search(rate,Rank[i]);
			k++;
		}
		return answer;
	}
	public static double[] Reverse(double Rank[]) {
		for(int i=1; i<=Rank.length/2; i++) {
			double tmp = Rank[i];
			Rank[i] = Rank[Rank.length-i];
			Rank[Rank.length-i] = tmp;
		}
		return Rank;
	}
	public static int Search(double rate[],double target) {
		int index = rate.length;
		for(int i=1; i<rate.length; i++) {
			if(rate[i]==target) {
				if(index>i) {
					index=i;
				}
			}
		}
		rate[index]=-1;
		return index;
	}
	public static void main(String args[]) {
		int[] stages= {2};
		int N = 1;
		int result[] = solution(N,stages);
		for(int i=0; i<result.length; i++)System.out.println(result[i]);
	}
}