package page16.q1548;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long l, i = 0;
    while((l = in.nextLong()) != 0) {
      System.out.println("Case " + (++i) + ": " + (long)Math.ceil((Math.sqrt(8 * l + 9) + 3) / 2));
    }
  }
}
