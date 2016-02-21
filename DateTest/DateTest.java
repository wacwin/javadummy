import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DateTest{
  public static void main(String[] args){
    Date now = new Date();
    System.out.println("Today is:" + now);
    System.out.println(now.getTime());

    // Format a date in a given format
    SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    String newDateString = dateFormatter.format(now);
    System.out.println(newDateString);

    // Parse a date directly from a string with SimpleDateFormat
    String day1 = "10/23/2012 09:20:15";
    Date day1Date = null;
    try{
      day1Date = dateFormatter.parse(day1);
      System.out.println(day1Date);
    } catch(Exception e){
      System.out.println(e);
    }

    // It is recommended to use Calendar object for more precise date functions
    Calendar cal = Calendar.getInstance();
    String calDate = dateFormatter.format(cal.getTime());
    System.out.println("Calendar date: " + calDate);

    // TimeUnits can be used to understand the difference between two date objects
    long mils = cal.getTimeInMillis() - day1Date.getTime();
    long hours = TimeUnit.MILLISECONDS.toHours(mils);
    System.out.println(String.format("There are %d hours difference.",hours));

  }
}
