import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Console{
  public static void main(String[] args) throws ParseException{

    System.out.println(args.length + " parameters are passed in.");
    for(String arg:args)
      System.out.println(arg);


    Scanner in = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = in.nextLine();
    System.out.println("What is your birth date?");
    String birthDateString = in.nextLine();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date birthDate = sdf.parse(birthDateString);
    Date now = new Date();
    long age = (now.getTime() - birthDate.getTime())/24/60/60/1000/365;
    System.out.println("You are " + age + " years old!");
    
  }
}
