import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int col = 0;
    String[][] board = new String[6][7];
    int lengthc = 6;
    /*
    [][][][][][][]
    [][][][][][][]
    [][][][][][][]  6 rows 7 columns
    [][][][][][][]
    [][][][][][][]
    [][][][][][][] */
    //System.out.println(Arrays.deepToString(board));
    //while (!(winCheck)) {

    //}
    System.out.print("\033[H\033[2J");
    fillBoard(board);
    int turn = 2;
    if (turn % 2 == 0) {
      displayBoard(board);
      System.out.println("Player X, write the column you want to fill:");
      col = s.nextInt();
      for (int row = 0; row < board.length; row++) {
        if (board[row][col].equals("[ ]")) {
          board[row][col - 1] = "[X]";
          break;
        }
      }
    }

    displayBoard(board);

  } // end main method

  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method

  public static boolean winCheck(String[][] board) {
      int tempx = 0;
      int tempo = 0;
      for(int row = 0; row < board.length; row++) {
        for(int col = 0; col < board[row].length; col++) {
          if(board[row][col].equals("X")){
            tempx++;
          }
          else if (board[row][col].equals("O")){
            tempo++;
          }


          //test for 4 in a row, columns, or diagonals
        }
      }
      return true;
  }

} // end class
