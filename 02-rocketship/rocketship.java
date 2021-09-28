public class rocketship{//start of class
public static void main(String[] args){//start of main method
  top();//spaces added to box and country to allign with top so the image fits a rocketship
  box();//calls in the order which is needed to create the rocket
  Country();
  box();
  top();
}//end of main method
public static void top(){//start of top function
  System.out.println("     /\\   \n    /  \\ \n   /    \\");//creates the triangle top in the rocketship
}//end of top function
public static void box(){//start of box function
  System.out.println("  +------+\n  |      |\n  |      |\n  +------+");// Creates the box in the rocketship
}//end of box function
public static void Country(){// start of country function
  System.out.println("  |United|\n  |States|");//prints middle of rocketship with the US name in it
}//end of country function
}//end of class
