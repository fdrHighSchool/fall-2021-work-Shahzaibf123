import java.util.Arrays;
import java.util.*;
/*
Suppose a class was scheduled to have 5 exams
and the teacher was storing those exam grades
for each student in their own array.
Due to a test that many students did poorly on,
a 6th test has been introduced.
*/
public class Arraygrades {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // sample student with 5 slots for grades
    int[] sampleStudent = new int[5];

    // fill up the "gradebook"
    for(int i = 0; i < sampleStudent.length; i++) {
      sampleStudent[i] = (int)(Math.random() * 46) + 55;
    } // end for loop

    // display the first 5 grades
    System.out.println(Arrays.toString(sampleStudent));
    sampleStudent = Add(sampleStudent);
    System.out.println(Arrays.toString(sampleStudent));
    System.out.println(Arrays.toString(Replace(sampleStudent)));
  }
/*
A) Write a method that adds a 6th exam
to the sample student’s set of grades.
*/
  public static int [] Add(int[] arr){
    int[] scores = new int[arr.length + 1];
    for (int i = 0; i < arr.length;i++){
      scores[i] = arr[i];
    }
    scores[arr.length] = (int)(Math.random() * 46) + 55;

    return scores;
  }
/*
B) Write a method that takes the original set
of 5 grades and replaces the lowest grade if
the 6th grade is greater than it.
If it is not, then the original 5 grades remain.
*/
public static int[] Replace(int[] arr){
  int min = 99999999;
  int grade = arr[arr.length - 1];
  int temp = 0;
  int[] NList = new  int[arr.length - 1];
  for (int i = 0;i < arr.length; i++){
    if (arr[i] < min){
      min = arr[i];
      temp = i;
    }
  }
  if (grade > min){
    arr[temp] = grade;
  }
  for (int i = 0; i < NList.length; i++){
    NList[i] = arr[i];
  }
  return NList;
}
}
