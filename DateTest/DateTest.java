import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest{
  public static void main(String[] args){
    Date now = new Date();
    System.out.println("Today is:" + now);
    System.out.println(now.getTime());

    // Format a date in a given format
    SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    String newDateString = dateFormatter.format(now);
    System.out.println(newDateString);
  }
}
