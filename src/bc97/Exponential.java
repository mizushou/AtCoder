package bc97;

import java.util.Scanner;

public class Exponential {

  public static void main(String[] args) {
    new Exponential().solve();
  }

  public void solve() {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    if (x == 1) {
      System.out.println(x);
      return;
    }

    int result = 2;

    for (int i = 2; i <= x; i++) {
      for (int j = 2; Math.pow(i, j) <= x; j++) {
        result = Math.max((int) Math.pow(i, j), result);
      }
    }
    System.out.println(result);
  }
}
