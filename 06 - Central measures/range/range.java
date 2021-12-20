import java.io.*;
import java.util.*;
public class range{
  public static void main(String[] args){
      int count;
      Scanner s = new Scanner(System.in);
      System.out.println("What is the number of random numbers you want the range of?");
      count = s.nextInt();
      int[] array = new int[count];
      for (int i = 0; i < count;i++){
        array[i] = (int)(Math.random()*100) + 1;
      }
      System.out.println(range(array));

  }
  public static int range(int[] arr){
    return (max(arr)) - (min(arr));
  }
  public static int max(int [] arr){
    int max = -99999;
    for(int i = 0;i < arr.length;i++){
      if (arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
  public static int min(int[] arr){
    int min = 99999;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }
}
