package bc97;

import java.util.Scanner;

public class ColorfulTransceivers {

  public static void main(String[] args) {
    new ColorfulTransceivers().solve();
  }

  public void solve() {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int distance1 = Math.abs(a - c);

    if (distance1 <= d) {
      System.out.println("Yes");
      return;
    }

    int distance2 = Math.abs(a - b);
    int distance3 = Math.abs(b - c);

    if (distance2 <= d && distance3 <= d) {
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}
