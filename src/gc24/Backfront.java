package gc24;

import java.util.Scanner;

public class Backfront {

  public static void main(String[] args) {
    new Backfront().solve();
  }

  public void solve() {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int[] P = new int[n];
    for (int i = 0; i < n; i++) {
      P[i] = input.nextInt();
    }

    // ここがN^2
    //    ArrayList<Integer> I = new ArrayList<>();
    //    for (int i = 1; i <= n; i++) {
    //      I.add(P.indexOf(i));
    //    }
    int[] Q = new int[n];
    for (int i = 0; i < n; i++) {
      Q[P[i] - 1] = i;
    }

    int cnt = 0;
    int maxLen = 0;
    for (int i = 0; i < n - 1; i++) {
      if (Q[i] < Q[i + 1]) {
        cnt++;
      } else {
        maxLen = Math.max(maxLen, cnt);
        cnt = 0;
      }
    }
    System.out.println("cnt:" + cnt);
    System.out.println("maxLen:" + maxLen);
    maxLen = Math.max(maxLen, cnt);
    System.out.println(n - maxLen - 1);
  }
}
