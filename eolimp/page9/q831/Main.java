package page9.q831;

import java.util.Scanner;

public class Main {

  private static int s;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), ns[] = new int[n];
    boolean bs[] = new boolean[n];
    s = in.nextInt();
    bs[0] = true;
    for(int i=0; i<n; i++) ns[i] = in.nextInt();
    solve(ns, bs, 1, ns[0]);
    System.out.println("No solution");
  }

  private static void solve(int ns[], boolean bs[], int offset, int sum) {
    if(offset == ns.length) {
      if(sum == s) print(ns, bs);
      return;
    }

    bs[offset] = true;
    solve(ns, bs, offset+1, sum+ns[offset]);
    bs[offset] = false;
    solve(ns, bs, offset+1, sum-ns[offset]);
  }

  private static void print(int ns[], boolean bs[]) {
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<ns.length; i++)
      sb.append(bs[i] ? '+' : '-').append(ns[i]);
    sb.append('=').append(s);
    System.out.println(sb.substring(1));
    System.exit(0);
  }
}
