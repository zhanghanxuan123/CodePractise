package day7_27;

import java.util.Scanner;
//π……Ò
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1664&konwledgeId=134
public class Main {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		if(days == 1){
			System.out.println(1);
		}else {
			int price =1;int priceDownDate = 3;int priceDownNum = 1;
			for (int i = 2; i <=days; i++) {
				if(priceDownDate == i){
					priceDownNum++;
					priceDownDate =(priceDownNum*priceDownNum
							+3*priceDownNum)/2+1;
					price--;
				}else {
					price++;
				}
			
			}
			System.out.println(price);
		}
		
	}
}
