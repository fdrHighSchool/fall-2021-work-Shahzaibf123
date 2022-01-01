import java.util.*;
public class median{
  public static void main(String[] args){
    int[] arr = {2,4,1,8,5,6};
    System.out.println(median(sort(arr)));
    //System.out.println(median(arr));
  }
  public static int[] sort(int[] arr){
<<<<<<< HEAD
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
=======
    int[] sorted = new int[arr.length];

    int temp = 0;//selection sort
  //  for (int j = 0; j < arr.length; j++){
      for (int i = 0; i < arr.length;i++){
        int min = arr[i];
        int minLoc = i;
        temp = arr[i];
        for (int j = i + 1; j < arr.length;j++) {
          if(arr[j] < min){
            min = arr[j];
            minLoc = j;
          }
        }
        arr[i] = min;
        arr[minLoc] = temp;
      }
      return arr;
  //  }
>>>>>>> ca3a729985d43d3c4e542f76b5d3e3ab28c72999
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
