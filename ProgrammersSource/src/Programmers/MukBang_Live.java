package Programmers;

public class MukBang_Live {
	public static void main(String args[]) {
		int food_times[] = {3,1,2};
		long k = 5;
		int index=0;
		int i=0,count=0;
		if(check(food_times,k)==false){
            index = -1;
            System.out.println(index);
        }
		else {
		while(count<=k) {
			if(food_times[i%food_times.length]!=0) {
				food_times[i%food_times.length]--;
				index = i%food_times.length+1;
				count++;
			}
			i++;
		}
		System.out.println(index);
	}
	}
	public static boolean check(int arr[],long k) {
		long sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        if(sum<=k) return false;
        return true;
	}
}
