import java.util.Date;

public class DateTest{
  public static void main(String[] args){
    Date now = new Date();
    System.out.println("Today is:" + now);
    System.out.println(now.getTime());
  }
}
