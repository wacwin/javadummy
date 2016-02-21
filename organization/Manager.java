public class Manager extends Employee{
  private double bonus;

  /**
   *@param n the manager's name
   *@param s the manager's salary
   *@param year the hire year
   *@param month the hire month
   *@param day the hire day
   */
  public Manager(String n, double s, int year, int month, int day){
    super(n,s,year,month,day);
    bonus=0;
  }

  public void setBonus(double bonus){
    this.bonus = bonus;
  }

  public double getSalary(){
    double baseSalary = super.getSalary() + bonus;
    return baseSalary;
  }

}
