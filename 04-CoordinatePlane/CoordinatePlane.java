import java.util.*;
public class CoordinatePlane{
  public static void main(String[] args){
    //sets up variables/scanner
    int x;
    int y;
    int x2;
    int y2;
    Scanner s = new Scanner(System.in);

    //asks for both points
    System.out.println("Give me your first point as (x, y)");
    String point1 = s.nextLine();

    System.out.println("Give me a second point as (x, y)");
    String point2 = s.nextLine();

    //setup variables from the points given
    x = Integer.parseInt(point1.substring(1,point1.indexOf(",")));
    y = Integer.parseInt(point1.substring(point1.indexOf(",")+2,point1.length()-1));
    x2 = Integer.parseInt(point2.substring(1,point2.indexOf(",")));
    y2 = Integer.parseInt(point2.substring(point2.indexOf(",")+2,point2.length()-1));


  }
  public static void CrowDistance(){

  }
  public static void TaxicabDistance(){

  }

}
