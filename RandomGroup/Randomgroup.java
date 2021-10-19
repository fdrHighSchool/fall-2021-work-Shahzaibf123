import java.util.*;
public class Randomgroup{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int loop = 1;
    while (loop == 1){
      game();
      System.out.println("Would you like to replay the game? If yes, type yes, if not, type no.");
      String answer = s.nextLine();
      if (answer.equals("yes") || answer.equals("Yes")){
        loop = 1;
      }
      else if (answer.equals("no") || answer.equals("No")){
        loop++;
      }
    }
  }
  public static void game(){
    int lives;
    int randomnumber;
    int guess;
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to this game of random numbers!");
    System.out.println("First select a difficulty. Type E for easy, M for medium, and H for hard.");
    String difficulty = input.nextLine();

    if (difficulty.equals("E") || difficulty.equals("Easy") || difficulty.equals("easy")){
      System.out.println("Easy difficulty selected. \nGuess the random number from 1-15. You have 10 lives!. Hints are given.");
      lives = 10;
      randomnumber = (int)(Math.random()*15+1);
      guess = input.nextInt();
      for (int i = 0; i <= 10; i++){
          if (guess == randomnumber){
            System.out.println("You guessed the correct number! You have won with " + lives + " lives left.");
            break;
          }
          else if (guess > randomnumber){
            if (lives == 1){
              lives--;
              System.out.println("Game Over! You have 0 lives.");
              break;
            }
            else{
          lives--;
          System.out.println("You were wrong! Your guess was greater than the random number! Guess again you have " + lives + " live(s) left.");
          guess = input.nextInt(); }
          }
          else if (guess < randomnumber){
              if (lives == 1){
                lives--;
                System.out.println("Game Over! You have 0 lives.");
                break;
              }
              else{
            lives--;
            System.out.println("You were wrong! Your guess was less than the random number! Guess again you have " + lives + " live(s) left.");
            guess = input.nextInt(); }
        }
      }

    }  else if (difficulty.equals("M") || difficulty.equals("Medium") || difficulty.equals("medium")){
      System.out.println("Medium difficulty selected.\nGuess the random number from 1-15. You have 10 lives. Hints are not given.");
      lives = 10;
      randomnumber = (int)(Math.random()*15+1);
      guess = input.nextInt();
      for (int i = 0; i <= 10; i++){
          if (guess == randomnumber){
            System.out.println("You guessed the correct number! You have won with " + lives + " live(s) left.");
            break;
          }
          else if (guess != randomnumber){
            if (lives == 1){
              lives--;
              System.out.println("Game Over! You have 0 lives.");
              break;
            }
            else{
              lives--;
              System.out.println("Your guess was wrong! Guess again you have " + lives + " lives left.");
              guess = input.nextInt();
            }
          }
      }
    }  else if (difficulty.equals("H") || difficulty.equals("Hard") || difficulty.equals("hard")){
      System.out.println("Hard difficulty selected.\nGuess the number from 1-20. You have 6 lives. Hints are not given.");
      lives = 6;
      randomnumber = (int)(Math.random()*20+1);
      guess = input.nextInt();
      for (int i = 0; i <= 6;i++){
        if (guess == randomnumber){
          System.out.println("You guessed the correct number! You have won with " + lives + " live(s) left.");
          break;
        }
        else if (guess != randomnumber){
          if (lives == 1){
            lives--;
            System.out.println("Game Over! You have 0 lives.");
            break;
          }
          else{
            lives--;
            System.out.println("Your guess was wrong! Guess again you have " + lives + " lives left.");
            guess = input.nextInt();
          }
        }
      }
    }
    else{
      System.out.println("Invalid difficulty selected.");
    }
  }
}
