package Programmers;

public class FucntionDevelop {
	public static void main(String args[]) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] answer = ProgressRate(progresses, speeds);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	public static int next=0;
	public static int T;
	public static int[] ProgressRate(int[] progresses, int[] speeds) {
		T = progresses.length;
		int result[] = new int[progresses.length];
		int index=0; int i=0;
		while(next<=progresses.length-1) {
			if(progresses[next]>=100) {
				System.out.println("(while)i : "+i);
				distribution(result,progresses,i);
				i++;
			}
			for(int j=next; j<progresses.length; j++) {
				progresses[index%progresses.length] += speeds[index%speeds.length];
				index++;
			}
		}
		System.out.println("next : "+next);
		System.out.println("T : "+T);
		T=T-(next-1);
		System.out.println("T-next-1 : "+T);
		int restruct[] = new int[T];
		for(int t=0; t<restruct.length; t++) {
			restruct[t] = result[t];
		}
		return restruct;
	}
	public static void distribution(int[] result, int[] progresses, int i) {
		if(progresses[next]>=100) {
			result[i]++;
			System.out.println("i : "+i);
			System.out.println("result : "+result[i]);
			next++;
			if(next==(progresses.length)) return;
			distribution(result,progresses,i);
		}
		else return;
	}
}
