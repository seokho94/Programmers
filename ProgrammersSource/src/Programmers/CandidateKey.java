package Programmers; //출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

public class CandidateKey {
	public static void main(String args[]) {
		int food_times[] = {3,1,2};
		int k=5;
		int answer = 0;
		int max = food_times.length;
		int count=0, i=0, finish=0, last=0;;
		while(count<k) {
			if(food_times[i%max]!=0) {
				food_times[i%max]--;
				last=i%max;
				count++;
			}
			else if(food_times[i%max]==0) {
				food_times[i%max]=-1;
				finish++;
			}
			if(finish==max-1) {
				answer=-1;
				break;
			}
			i++;
		}
	}
}
