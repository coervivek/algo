package page70.q6940;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
    int t = in.nextInt(), n;

    while(t-- > 0) {
      String s = in.next();
      if(tree.containsKey(s)) tree.put(s, tree.get(s) + 1);
      else tree.put(s, 1);
    }

    int max = -1; String ms = null;
    for(String s : tree.descendingKeySet()) {
      n = tree.get(s);
      if (n > max) {
        ms = s;
        max = n;
      }
    }
    System.out.println(ms + " " + max);
  }
}
