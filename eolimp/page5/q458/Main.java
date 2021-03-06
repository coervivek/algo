package page5.q458;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int w = in.nextInt(), h = in.nextInt();
    ArrayList<String> buf = new ArrayList<String>();
    StringBuilder sb = new StringBuilder();

    for(int i=2*h; i>0; i--) buf.add(in.next());

    String code = in.next();
    for(int i=0; i<h; i++) {
      String s1 = buf.get(i), s2 = buf.get(i+h);
      for(int j=0; j<w; j++) {
        if(s1.charAt(j) == '0' && s2.charAt(j) == '0') sb.append(code.charAt(0));
        else if(s1.charAt(j) == '0' && s2.charAt(j) == '1') sb.append(code.charAt(1));
        else if(s1.charAt(j) == '1' && s2.charAt(j) == '0') sb.append(code.charAt(2));
        else sb.append(code.charAt(3));
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}
