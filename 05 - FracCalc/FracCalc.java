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

  if (!(opera1.contains("/"))){//if it does not have a frac its only a whole number
    denomleft = 1;
    wholeleft = Integer.parseInt(opera1.substring(0,1));
    numleft = wholeleft;
  }
  else{//if it has a frac it could be {whole_frac} or just {frac}
    denomleft  = Integer.parseInt(opera1.substring(opera1.indexOf("/") + 1, opera1.length()));
    if (opera1.contains("_")){//if it is {whole_frac}
      numleft = Integer.parseInt(opera1.substring(opera1.indexOf("_") + 1,opera1.indexOf("/")));
      wholeleft = Integer.parseInt(opera1.substring(0,opera1.indexOf("_")));
    }
    else{//if it is just {frac}
      wholeleft = 0;
      numleft = Integer.parseInt(opera1.substring(0,opera1.indexOf("/")));
    }
  }

  if(!(opera2.contains("/"))){
    denomright = 1;
    wholeright = Integer.parseInt(opera2.substring(0, 1));
    numright = wholeright;
  }
  else{
    denomright = Integer.parseInt(opera2.substring(opera2.indexOf("/") + 1, opera2.length()));
    if (opera2.contains("_")){
      numright = Integer.parseInt(opera2.substring(opera2.indexOf("_") + 1, opera2.indexOf("/")));
      wholeright = Integer.parseInt(opera2.substring(0, opera2.indexOf("_")));
    }
    else{
      wholeright = 0;
      numright = Integer.parseInt(opera2.substring(0,opera2.indexOf("/")));
    }
  }
  if (input.contains("+")){
    return Add(wholeleft, numleft, denomleft, wholeright, numright, denomright);
  }
  else if(input.contains("-")){

  }
  else if (input.contains("*")){

  }
  else{

  }

}
  public static String Add(int whole1,int num1,int den1,int whole2,int num2,int den2){
    if(!(whole1 == 0)){
      int newnum1 = num1 + (whole1 * den1);
    }
    if(!(whole2 == 0)){
      int newnum2 = num2 + (whole2 * den2);
    }
    int numsum = (newnum1 * den2 + newnum2 * den1);
    int densum = (den1 * den2);
    String sum = numsum + "/" + densum;
    return sum;
  }
}
