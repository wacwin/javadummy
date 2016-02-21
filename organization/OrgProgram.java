public class OrgProgram{
  public static void main(String[] args) throws ClassNotFoundException,
  InstantiationException, IllegalAccessException{
    Employee manager = new Manager("Charles",10000.00, 2016,1,10);
    System.out.println(manager.getClass().getName());

    String s = "java.util.Date";
    Object o = Class.forName(s).newInstance();
    System.out.println(o.toString());

  }

}
