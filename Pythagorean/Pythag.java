import java.util.*;
public class Pythag {
  public static void main(String[] args){
    int a = 100;
    int b = 100;
    double c = 0;
    int sum = 0;
    boolean condition = false;
    // a stays b changes
    for (int i = 0; i < 400; i++){
      c = Math.pow(a,2) + Math.pow(b,2);
      sum = a + b + (int)c;
      if (sum == 1000) {
        System.out.println(a*b*c);
      }
      b++;
    }
      a = 100;
      b = 100;
      for (int i = 0; i < 400; i++){
        c = Math.pow(a,2) + Math.pow(b,2);
        sum = a + b + (int)c;
        if (sum == 1000) {
          System.out.println(a*b*c);
        }
        a++;
      }
  }
}
