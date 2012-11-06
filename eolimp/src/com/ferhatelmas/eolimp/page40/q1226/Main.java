package com.ferhatelmas.eolimp.page40.q1226;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> hash = new HashMap<String, Integer>();

    int t = Integer.parseInt(br.readLine());
    boolean[] b = new boolean[t];

    int n, i, j;
    Integer val;
    String[] s;
    for(i=0; i<t; i++) {
      n = Integer.parseInt(br.readLine().trim());
      for(j=0; j<n; j++) {

        s = br.readLine().split(" ");

        if((val = hash.get(s[1] + "." + s[0])) != null) {
          hash.remove(s[1] + "." + s[0]);
          if(--val != 0) hash.put(s[1] + "." + s[0], val);
        } else {
          if((val = hash.get(s[0] + "." + s[1])) == null) hash.put(s[0] + "." + s[1], 1);
          else hash.put(s[0] + "." + s[1], ++val);
        }

      }

      b[i] = hash.isEmpty();
      hash.clear();
    }

    for(boolean bo : b)
      System.out.println(bo ? "YES" : "NO");
  }

}