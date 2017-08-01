package day7_31;

import java.util.Scanner;

public class Main {
      public static void main(String args[]) {
            int sum = 0;
            int max = 0;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  sum += b - a;
                  if (max < sum) {
                        max = sum;
                  }
            }
            System.out.println(max);
      }
}
