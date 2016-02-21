import java.util.Date;
import java.util.GregorianCalendar;

public class Employee{
  private String name;
  private double salary;

  private Date hireDate;

  public Employee(String n, double s, int year, int month, int day){
    name = n;
    salary = s;
    GregorianCalendar gcal = new GregorianCalendar(year, month, day);
    hireDate = gcal.getTime();
  }

  public String getName(){
    return name;
  }

  public double getSalary(){
    return salary;
  }

  public Date getHireDate(){
    return hireDate;
  }

  public void raiseSalary(double amount){
    salary += amount;
  }

}
