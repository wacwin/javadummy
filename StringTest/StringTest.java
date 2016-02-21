import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringTest{
  public static void main(String[] args){
    testString();
  }

  //This test case indicate that == should not be used for comparing values of two string objects
  public static void compareString(){
    String a = "Hello";
    String b = "Hello";
    System.out.println("a=Hello, b=Hello");
    System.out.println("a==b: " + a==b?"Yes":"No");
    System.out.println("a equals b: " + ( a.equals(b) ? "Yes" : "No"));
  }

  public static void trimString(String a){
    System.out.println("The string you are trimming is: " + a);
    System.out.println("The trimmed string is: " + a.trim());
  }

  public static void converseCase(String a){
    System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());
  }

  public static void concateString(){
    String a = "Hello";
    String b = "World";
    System.out.println("concat:" + a.concat(" " + b));
    System.out.println("+:" + a+" " + b);
    StringBuffer cstr = new StringBuffer();
    cstr.append(a).append(" ").append(b);
    System.out.println("StringBuffer: " + cstr.toString());

  }

  public static void convert2Integer(){
    String a = "10";
    int na = Integer.valueOf(a);
    int nb = Integer.parseInt(a);
    System.out.println(na + nb);
  }

  public static void iterateString(){
    String a = "Hello, world!";
    for(char c:a.toCharArray()){
      System.out.println(c);
    }
  }

  public static void testString(){
    String str = "I love java7.2.5!";
    System.out.println(str.matches("I love .*[ 0-9]!"));

    Pattern pattern = Pattern.compile("I love .*[ 0-9]!");
    Matcher matcher = pattern.matcher(str);
    System.out.println(matcher.matches());
  }
}
