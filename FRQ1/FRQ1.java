import java.util.*;
import java.io.*;
public class FRQ1 {
  public static void main(String[] args){
    System.out.println(isSelfDivisor(15));

  }
    public static boolean isSelfDivisor(int number){
        int n = number;
        while(n>0){
          int temp = n % 10;
          if (temp == 0 || number % temp != 0) {
            return false;
          }
          n /= 10;
        }
        return true;
        }

    }
