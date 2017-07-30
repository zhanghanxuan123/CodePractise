package day7_29;

import java.text.DecimalFormat;
import java.util.Scanner;


//Ô¼µÂ¶û²âÊÔ
//http://exercise.acmcoder.com/online/online_judge_list_all
public class Main {
	static String a = null;
	static String b = null;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a = scanner.next();
		b = scanner.next();
		String trans = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>='0'&&a.charAt(i)<='9'
				||a.charAt(i)>='a'&&a.charAt(i)<='z'
				||a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				trans = trans+"1";
			}else {
				trans = trans+"0";
			}
		}
		int count = 0;
		for (int i = 0; i < trans.length(); i++) {
			if (trans.charAt(i)==b.charAt(i)) {
				count++;
			}
		}
		float out = (float) count * 100 / (float) b.length();
		System.out.printf("%.2f%%", out);
	}
}
