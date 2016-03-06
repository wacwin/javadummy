/*
 * Any individuals can freely use this code for learning purpose.
 *
 *
 */
package learning.core;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * A simple object representing an employee.
 *
 * @author Charles W
 * @since 0.1
 */
public class Employee{
  private String name;
  private Date birthDate;
  private decimal salary;
  private Date onboardDate;
  private String title;
  private Employee reportTo;

  /**
   * The default constructor of Employee.
   * No parameters specified. You have to manually specify the field values with member functions.
   *
   */
  public Employee(){}

  /**
   * Construct an Employee object with explicit parameters.
   *
   * @param name The name of an employee
   * @param birthDate The birth date
   * @param onboardDate The onboard date
   * @param title The job title
   * @param manager The manager of the employee
   */
  public Employee(String name, Date birthDate, Date onboardDate, String title, Employee manager){
    this.name = name;
    this.birthDate = birthDate;
    this.onboardDate = onboardDate;
    this.title = title;
    this.reportTo = manager;
  }

  /**
   * Construct an Employee object with explicit parameters.
   *
   * @param name The name of an employee
   * @param birthDate The birth date. The string format must be "yyyy-MM-dd".
   * @param onboardDate The onboard date. The string format must be "yyyy-MM-dd".
   * @param title The job title
   * @param manager The manager of the employee
   */
  public Employee(String name, String birthDateString, String onboardDateString, String title, Employee manager){
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    this.name = name;
    this.birthDate = df.parse(birthDateString);
    this.onboardDate = df.parse(onboardDateString);
    this.title = title;
    this.reportTo = manager;
  }

  /**
   * Get the name of the employee.
   *
   * @return The name of the employee
   */
  public String getName(){
    return this.name;
  }

  /**
   * Get the birth date of the employee.
   *
   * @return The birth date of the employee
   */
  public Date getBirthDate(){
    return this.birthDate;
  }
  /**
   * Get the onboard date of the employee.
   *
   * @return The onboard date of the employee
   */
  public Date getOnboardDate(){
    return this.onboardDate;
  }
  /**
   * Get the title of the employee.
   *
   * @return The title of the employee
   */
  public String getTitle(){
    return this.title;
  }
  /**
   * Get the manager of the employee.
   *
   * @return The manager of the employee
   */
  public Employee getManager(){
    return this.reportTo;
  }
  /**
   * Get the current salary of the employee.
   *
   * @return The current salary of the employee
   */
  public decimal getSalary(){
    return this.salary;
  }

  /**
   * Set the name of the employee.
   *
   * @param name The name of the employee
   */
  public void setName(String name){
    this.name = name;
  }

  /**
   * Set the birth day of the employee.
   *
   * @param birthDate The birth day of the employee
   */
  public void setBirthDate(Date birthDate){
    this.birthDate = birthDate;
  }

  /**
   * Set the birth day of the employee.
   *
   * @param birthDate The birth day of the employee which must be in the string format "yyyy-MM-dd"
   */
  public void setBirthDate(String birthDate){
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    this.birthDate = df.parse(birthDate);
  }

  /**
   * Set the onboard day of the employee.
   *
   * @param birthDate The onboard day of the employee
   */
  public void setOnboardDate(Date onboardDate){
    this.onboardDate = onboardDate;
  }
  /**
   * Set the onboard day of the employee.
   *
   * @param onboardDate The onboard day of the employee which must be in the string format "yyyy-MM-dd"
   */
  public void setOnboardDate(String onboardDate){
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      this.onboardDate = df.parse(onboardDate);
  }
  /**
   * Set the title of the employee.
   *
   * @param title The title of the employee
   */
  public void setTitle(String title){
    this.title = title;
  }
  /**
   * Set the salary of the employee.
   *
   * @param salary The salary of the employee
   */
  public void setSalary(decimal salary){
    this.salary = salary;
  }
  /**
   * Set the manager of the employee.
   *
   * @param manager The manager of the employee
   */
  public void setManager(Employee manager){
    this.reportTo = manager;
  }
}
