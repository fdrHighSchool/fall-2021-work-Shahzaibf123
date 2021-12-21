import java.util.*;
import java.io.*;
public class DtoB {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Input binary to convert to decimal.");
    String data = s.nextLine();


  }
  public static int ConvertBtoD(String a){
    int counter = 0;
    int exp = a.length() - 1;
    char car = "";
    for (int i = 0;i < a.length(); i++){
      car = a.charAt(i);
      if (char.equals("1")){
        counter += Math.pow(2,a.indexOf(char,exp));
      }
      exp = exp - 1;
    }
    return (int)counter;
  }

}
