package day7_28;
import java.util.Arrays;
//·­×ªÊý×é
import java.util.Scanner;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1656&konwledgeId=134
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n  =scan.nextInt();
		int[] a = new int[n];
		int[] sortA = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = scan.nextInt();
			sortA[i] = a[i];
		}
			
		System.out.print(isAsc(a,sortA));
		
		
	}
	public static String  isAsc(int[] a,int[] sortA)
	{
		if(a.length <= 1)
			return "yes";
		int len = a.length;
		 Arrays.sort(sortA);
		 int left = 0,right = len-1;
			while(left<len && sortA[left]==a[left]) left++;
			while(right>=0 && sortA[right]==a[right]) right--;
		 for(int i = left; i < right; i++){
			 if(a[i] < a[i+1])
				 return "no";
		 }
		 return "yes";
	}

}