import java.util.*;
import java.io.*;
public class DtoB {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Input binary to convert to decimal.");
    String data = s.nextLine();
    System.out.println(ConvertBtoD(data));

  }
  public static int ConvertBtoD(String a){
    Scanner s = new Scanner(System.in);
    int counter = 0;
    int exp = a.length() - 1;
    String car = "";
    for (int i = 0;i < a.length(); i++){
      car = s.nextLine();
      if (car.equals("1")){
        counter += Math.pow(2,a.indexOf(car,exp));
      }
      exp = exp - 1;
    }
    return (int)counter;
  }

}
