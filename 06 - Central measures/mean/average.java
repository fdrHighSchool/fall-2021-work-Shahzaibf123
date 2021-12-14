import java.util.*;
import java.io.*;
public class average{
  public static void main(String[] args){
    int count;
    double average;
    int total = 0;
    Scanner s = new Scanner(System.in);
      System.out.println("How many random numbers do you want to count the average of?");
      count = s.nextInt();
      int[] arr = new int[count];
      for (int i = 0; i < count;i++){
        arr[i] = (int)(Math.random()*100) + 1;
      }
      for (int i = 0; i < arr.length ;i++){
        total += arr[i];
      }
      //System.out.println(Arrays.toString(arr));
      average = total / arr.length;
      System.out.println(average);
  }

}
