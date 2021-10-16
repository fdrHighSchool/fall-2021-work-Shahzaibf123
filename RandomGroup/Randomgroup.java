import java.util.*;
public class Randomgroup{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcom to this game of random numbers!");
    System.out.println("First select a difficulty. Type E for easy, M for medium, and H for hard.");
    String difficulty = input.nextLine();
    System.out.println("Difficulty chosen was " + difficulty + ".");
  }

}
