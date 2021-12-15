import java.io.*;
import java.util.*;
public class mode{
  public static void main(String[] args){
    int count;
    Scanner s = new Scanner(System.in);
    System.out.println("How many random numbers do you want to find the mode of?");
    count = s.nextInt();
    int[] array = new int[count];
    for (int i = 0; i < count;i++){
      array[i] = (int)(Math.random()*100) + 1;
    }
    System.out.println(mode(array));
  }
  public static int mode(int[] arr){
    /*make list frequency that passes through the values and have the index of the values
    see how much each occurred then return the index of the highest
    */
    int[] freq = new int[101];
    int maxLoc = 0;
    Arrays.fill(freq,0);
    int max = -99999;
    int counter = 0;
    for(int i = 0; i < arr.length;i++){
      freq[arr[i]]++;
    }
    for (int i = 0; i < freq.length; i++){
      if (freq[i] > max){
        max = freq[i];
        maxLoc = i;
      }

    }
    System.out.println(Arrays.toString(arr));

    return arr[];
    /* 0 1 1 2 3
       1 2 1 1
       freq[2]
    */
  }
}
