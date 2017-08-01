package day7_30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Streetlights {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num  = scanner.nextInt();
		
		int length = scanner.nextInt();
		while(length>=1&&length<=109&&num>=1&&num<=1000) {
		int[] array = new int[num+2];
		array[0] = 0;
		array[num+1] = length;
		for (int i = 1; i < array.length-1; i++) {
			array[i] = scanner.nextInt();
		}
		int maxlength = 0;
		Arrays.sort(array);
		for (int i = 1; i < array.length-2; i++) {
			int distance = array[i+1]-array[i];
			if (distance>maxlength) {
				maxlength = distance;
			}
		}
		float result = (float)maxlength/2;
		float fromStart = array[1]-array[0];
		float fromEnd = array[num+1]-array[num];
		float[] arr = {result,fromEnd,fromStart};
		Arrays.sort(arr);
		System.out.println(String.format("%.2f", arr[2]));
	}
	}

}
