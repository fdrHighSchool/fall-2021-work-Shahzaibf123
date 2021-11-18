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
  String ans;

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
int newnum1;
int newnum2;
  if(!(wholeleft == 0)){
    newnum1 = numleft + (wholeleft * denomleft);
  }
  else{
    newnum1 = numleft;
  }
  if(!(wholeright == 0)){
    newnum2 = numright + (wholeright * denomright);
  }
  else{
    newnum2 = numright;
  }


  if (input.contains("+")){
    ans = Add(newnum1, denomleft, newnum2, denomright);
  }
  else if(input.contains("-")){
    ans = Subtract(newnum1, denomleft, newnum2, denomright);
  }
  else if (input.contains("*")){
    ans = Multiply(newnum1, denomleft, newnum2, denomright);
  }
  else{
    ans = Divide(newnum1, denomleft, newnum2, denomright);
  }
  int numans = Integer.parseInt(ans.substring(0,ans.indexOf("/")));
  int denans = Integer.parseInt(ans.substring(ans.indexOf("/") + 1,ans.length()));

  return ans;

}


  public static String Add(int num1,int den1,int num2,int den2){

    int numsum = (num1 * den2 + num2 * den1);
    int densum = (den1 * den2);
    String sum = numsum + "/" + densum;
    return sum;
  }
  public static String Subtract(int num1,int den1,int num2,int den2){

    int numsub = (num1 * den2 - num2 * den1);
    int densub = (den1 * den2);
    String sub = numsub + "/" + densub;
    return sub;
  }
  public static String Multiply(int num1,int den1,int num2,int den2){
    int numult = (num1 * num2);
    int denmult = (den1 * den2);
    String product = numult + "/" + denmult;
    return product;
  }
  public static String Divide(int num1,int den1,int num2,int den2){
    int numdiv = (num1 * den2);
    int dendiv = (num2 * den1);
    String div = numdiv + "/" + dendiv;
    return div;
  }

  public static String Simplify(String frac){
    return "";
  }
  public static int GCF(int num, int den){
    for (int i = 0; i >=)
  }
}
