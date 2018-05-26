package gc23;

import java.util.Scanner;

public class ZeroSumRanges {

  public static void main(String[] args) {
    new ZeroSumRanges().solve();
  }

  public void solve() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    int count = 0;
    for (int i = 0; i < array.length; i++) {
      int sum = 0;
      for (int j = i; j < array.length; j++) {
        sum += array[j];
        if (sum == 0) {
          count++;
          sum = 0;
        }
      }
    }

    System.out.println(count);
  }
}
