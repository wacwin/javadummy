import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class MathTest{
  public static void main(String[] args){
    compareInt();
  }

  public static void convertFloatToInt(){
    Scanner in = new Scanner(System.in);
    float a = Float.MAX_VALUE;
    System.out.println("Please input a float number. Press q to exit.");
    while(in.hasNext("q")==false){
      if(in.hasNextFloat()){
        a = in.nextFloat();
        System.out.println("The converted Integer value is:"+Math.round(a));
      } else {
        System.out.println("Please input a valid float number.");
        in.next();
      }
    }
    in.close();
  }

  public static void formatDouble(){
    double a = 347.9887780;
    NumberFormat nf = new DecimalFormat("##.000");
    String result = nf.format(a);
    System.out.println("The format of the double value 347.9887780L is: " + result);
  }

  public static void compareInt(){
    int a = 10;
    int b = 10;
    int c = -10;

    System.out.println(a==b);
    System.out.println(a==c);
  }
}
