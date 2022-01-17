import java.util.*;
public class Grades2D {
  public static void main(String[] args) {
    int num = 1;
    int[][] studentGrades = new int[15][5];
      for(int row = 0; row < studentGrades.length;row++) { // < 15 amount of subarrays is the total length
        for(int col = 0; col < studentGrades[0].length;col++) {// < 5 length of first row
          studentGrades[row][col] = num;
          num++;
        }
      }
      System.out.println(Arrays.deepToString(studentGrades));

  }

}
