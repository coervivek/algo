package page4.q358;

import java.util.Scanner;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

    String n=new Scanner(System.in).next();
    int sum = 0;
    HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();

    map.put(0, 6);
    map.put(1, 2);
    map.put(2, 5);
    map.put(3, 5);
    map.put(4, 4);
    map.put(5, 5);
    map.put(6, 6);
    map.put(7, 3);
    map.put(8, 7);
    map.put(9, 6);

    for(int i=0; i<n.length(); i++)
      sum += map.get(n.charAt(i)-'0');

    System.out.println(sum);
  }

}