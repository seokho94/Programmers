package Programmers;

import java.util.Scanner;

public class Skill_Tree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String skill = sc.nextLine();
		int T = Integer.parseInt(sc.nextLine());
		int count = 0;
		String skill_tree[] = new String[T];
		for(int i=0; i<T; i++) {
			skill_tree[i] = sc.nextLine();
			if(Skill(skill_tree[i],skill)==true) count++;
		}
		System.out.println(count);
	}
	public static boolean Skill(String skill_tree,String skill) {
		boolean check = true;
		char skill_check[] = skill.toCharArray();
		for(int i=0; i<skill_check.length; i++) {
			if(i!=0 && skill_tree.contains(String.valueOf(skill_check[i]))==false) {
				if(skill_tree.contains(String.valueOf(skill_check[i]))==true) {
					check = false;
					break;
				}
			}
			else {
				if(i!=0) {
					int index_precedence = skill_tree.indexOf(String.valueOf(skill_check[i-1]));
					int index = skill_tree.indexOf(String.valueOf(skill.charAt(i)));
					if(index_precedence>index || index_precedence<0) {
						check = false;
						break;
					}
				}
			}
		}
		return check;
	}
}
