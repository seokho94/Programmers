package Programmers; //출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

import java.util.Scanner;

public class Dart {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder(sc.nextLine());
		String total = result.reverse().toString();
		String score[] = total.split("");
		int count = 0;
		int sum = 0;
		boolean option_minus=false;
		boolean option_bonus = false;
		int bonus = 2, bonus_count=0;
		while(count<score.length) {
			if(score[count].contains("S")==true) {
				count++;
				if(count+1<score.length &&score[count+1].contains("S")==false && score[count+1].contains("D")==false && score[count+1].contains("T")==false && 
						score[count+1].contains("*")==false && score[count+1].contains("#")==false) {
					count++;
					score[count]+=score[count-1];
				}
				if(option_bonus==true&&option_minus==true) { 
					sum+=((int)Math.pow(Integer.parseInt(score[count]),1))*bonus*(-1); 
					option_minus=false; 
					bonus_count--;
					if(bonus_count==0) option_bonus=false;
					if(bonus_count==2) bonus-=2;
				}
				else if(option_minus==true) { sum+=((int)Math.pow(Integer.parseInt(score[count]),1))*(-1); option_minus=false; }
				else if(option_bonus==true) { 
					sum+=((int)Math.pow(Integer.parseInt(score[count]),1))*bonus;
					bonus_count--;
					if(bonus_count==0) option_bonus=false;
					if(bonus_count==2) bonus-=2;
				}
				else { sum+=((int)Math.pow(Integer.parseInt(score[count]),1)); }
			}
			else if(score[count].contains("D")==true) {
				count++;
				if(count+1<score.length && score[count+1].contains("S")==false && score[count+1].contains("D")==false && score[count+1].contains("T")==false && 
						score[count+1].contains("*")==false && score[count+1].contains("#")==false) {
					count++;
					score[count]+=score[count-1];
				}
				if(option_bonus==true&&option_minus==true) { 
					sum+=((int)Math.pow(Integer.parseInt(score[count]),2))*bonus*(-1); 
					option_minus=false; 
					bonus_count--;
					if(bonus_count==0) option_bonus=false;
					if(bonus_count==2) bonus-=2;
					}
				else if(option_minus==true) { sum+=((int)Math.pow(Integer.parseInt(score[count]),2))*(-1); option_minus=false; }
				else if(option_bonus==true) { 
					sum+=((int)Math.pow(Integer.parseInt(score[count]),2))*bonus; 
					bonus_count--;
					if(bonus_count==0) option_bonus=false;
					if(bonus_count==2) bonus-=2;
				}
				else { sum+=((int)Math.pow(Integer.parseInt(score[count]),2)); }
			}
			else if(score[count].contains("T")==true) {
				count++;
				if(count+1<score.length && score[count+1].contains("S")==false && score[count+1].contains("D")==false && score[count+1].contains("T")==false && 
						score[count+1].contains("*")==false && score[count+1].contains("#")==false) {
					count++;
					score[count]+=score[count-1];
				}
				if(option_bonus==true&&option_minus==true) { 
					sum+=((int)Math.pow(Integer.parseInt(score[count]),3))*bonus*(-1); 
					option_minus=false; 
					bonus_count--;
					if(bonus_count==0) option_bonus=false;
					if(bonus_count==2) bonus-=2;
				}
				else if(option_minus==true) { sum+=((int)Math.pow(Integer.parseInt(score[count]),3))*(-1); option_minus=false; }
				else if(option_bonus==true) { 
					sum+=((int)Math.pow(Integer.parseInt(score[count]),3))*bonus; 
					bonus_count--;
					if(bonus_count==0) option_bonus=false;
					if(bonus_count==2) bonus-=2;
				}
				else { sum+=((int)Math.pow(Integer.parseInt(score[count]),3)); }
			}
			else if(score[count].contains("*")==true) { 
				option_bonus=true;
				if(bonus_count==1) {bonus_count+=2; bonus+=2; }
				else if(bonus_count==2) {bonus+=2;}
				else if(bonus_count==0){bonus_count+=2; bonus=2;}
				else {bonus_count+=1;} 
				count++;
			}
			else if(score[count].contains("#")) {option_minus=true; count++;}
			else count++;
		}
		System.out.println(sum);
	}
}
