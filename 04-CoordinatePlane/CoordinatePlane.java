//imports
import java.util.*;
import java.lang.Math;
public class CoordinatePlane{
  public static void main(String[] args){
    //sets up variables/scanner
    int x;
    int y;
    int x2;
    int y2;
    double distance;
    int tdistance;
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
    //gets CrowDistance and TaxicabDistance
    distance = CrowDistance(x, x2, y, y2);
    System.out.println("The distance between the two points is " + distance + ".");
    tdistance = TaxicabDistance(x, x2, y, y2);
    System.out.println("The distance between the two points, in taxicab, is " + tdistance + ".");
  }
  public static double CrowDistance(int x1, int x2, int y1, int y2){
    //distance formula sqrt[(y2-y1)^2+(x2-x1)^2]
    return Math.sqrt((Math.pow((y2-y1),2)+(Math.pow((x2-x1),2))));
  }
  public static int TaxicabDistance(int x1, int x2, int y1, int y2){
    //taxi cab distance |y2-y1|+|x2-x1|
    return Math.abs(y2-y1)+ Math.abs(x2-x1);
  }
}
