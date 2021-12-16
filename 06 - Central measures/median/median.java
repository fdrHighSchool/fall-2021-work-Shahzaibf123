import java.util.*;
public class median{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6};
    System.out.println(median(arr));
  }
  public static int[] sort(int[] arr){
    int[] sorted = [arr.length];
    int min = 9999999;
    for (int j = 0; j < arr.length; j++){
      for (int i = 0; i < arr.length;i++){
        if (arr[i] < min){
          min = arr[i];
        }
      }
    }
  }
  public static double median(int[] arr){
    int med = 0;
    int medt = 0;
    int med1 = 0;
    int med3 = 0;
    if (!(arr.length % 2 == 0)){ //if it is odd
      med = (arr.length - 1) / 2;
      return arr[med];

    }
    else{//if it is even
      med1 = (arr.length / 2);
      medt = (arr.length / 2) - 1;
      med3 = (arr[med1] + arr[medt]) / 2;
      return med3;

    }
  }
}
