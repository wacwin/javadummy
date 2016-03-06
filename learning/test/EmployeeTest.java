package learning.test;
import learning.core.Employee;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EmployeeTest{
  public static void main(String args[]){
    String birthDateString = "1982-01-01";
    String onboardDateString = "2016-01-09";
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    try{
      Date birthDate = df.parse(birthDateString);
      Date onboardDate = df.parse(onboardDateString);
      Employee e = new Employee("Peter",birthDate,onboardDate,"Senior Manager",null);
      System.out.println(String.format("%s: %s", e.getName(), df.format(e.getBirthDate())));
      long dtime = birthDate.getTime() + (long)8*365*24*60*60*1000;
      birthDate.setTime(dtime);
      System.out.println(String.format("%s: %s", e.getName(), df.format(e.getBirthDate())));
    } catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
}
