package page26.q2540;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    in.nextLine();

    TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    while(in.hasNextLine()) {
      int l = in.nextLine().split("\\s+").length;
      if(l >= 2 && l <= 75)
        tree.put(l, 1 + (tree.containsKey(l) ? tree.get(l) : 0));
    }

    for(int k : tree.descendingKeySet())
      System.out.println(k + " " + tree.get(k));
  }
}
