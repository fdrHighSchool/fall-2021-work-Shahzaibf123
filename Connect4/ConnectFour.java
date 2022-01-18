import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int row = 0;
    int col = 0;
    String[][] board = new String[6][7];
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
    fillBoard(board);
    int turn = 1;
    if (turn % 2 == 0) {
      System.out.println("Player X, write the row:")
      row =

    }

    displayBoard(board);
    System.out.print("\033[H\033[2J");
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
  }

} // end class
