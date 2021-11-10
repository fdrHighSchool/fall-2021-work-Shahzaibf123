import java.util.*;
public class FracCalc {
  public static void main(String[] args){
    int loop = 1;
    while (loop == 1){
    Scanner s = new Scanner(System.in);

    String calcThis = s.nextLine();

    if (calcThis.equals("Quit") || calcThis.equals("QUIT") || calcThis.equals("Q") || calcThis.equals("q")){
      loop = loop + 1;
    }
    else{
    System.out.println(produceAnswer(calcThis));
  }
  }
}
public static String produceAnswer(String input){//1_5/2 + 7/2

  String opera1 = input.substring(0, input.indexOf(" "));
  String opera2 = input.substring(input.lastIndexOf(" ") + 1, input.length());
  int denomright;
  int denomleft;
  int wholeleft;
  int wholeright;
  int numleft;
  int numright;

  if (!(opera1.contains("/"))){
    denomleft = 1;
    wholeleft = opera1.substring(0,1);
    numerator = wholeleft
  }
  else{
    denomleft  = opera1.substring(opera1.indexOf("/") + 1, opera1.length());
    if (opera1.contains("_")){
      
      numleft = opera1.substring(opera1.indexOf("_"),opera1.indexOf("/"));
    }
  }

  if (opera2.contains("/")){
     denomright = opera2.substring(opera2.indexOf("/")+1,opera2.length()); }
  else{
     denomright = 1;
  }


}
  public static int LCM(int x, int y){
    return 0;
  }
  }
