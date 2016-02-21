import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;

public class UrlReader{
  public static void main(String[] args) throws Exception{
    try{
      URL url = new URL("http://www.baidu.com");
      Scanner input = new Scanner(url.openStream());
      while(input.hasNext()){
        System.out.println(input.nextLine());
      }
      input.close();
    } catch(MalformedURLException ex){
      System.out.println("Invalide URL.");
    } catch(java.io.IOException ex){
      System.out.println("I/O Errors: no such file.");
    }
  }
}
