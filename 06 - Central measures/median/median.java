import java.util.*;
public class median{
  public static void main(String[] args){
    int[] arr = {2,4,1,8,5,6};
    System.out.println(median(sort(arr)));
    //System.out.println(median(arr));
  }
  public static int[] sort(int[] arr){
    int min = 9999999;
    int temp = 0;//selection sort
    for (int j = 0; j < arr.length - 1; j++){
      temp = j;
      for (int i = j + 1; i < arr.length;i++){
        if(arr[i] < arr[temp]){
          temp = i;
        }
      }
      min = arr[temp];
      arr[temp] = arr[j];
      arr[j] = min;
    }
    return arr;
  }
  public static double median(int[] arr){
      int n = arr.length;
      double m=0;
      if (n%2==1){
        m = arr[(n+1)/2-1];
	    }
      else {
        m = (arr[n/2-1] + arr[n/2])/2;
      }
       return m;
  }
}
