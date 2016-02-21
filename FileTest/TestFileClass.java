import java.io.File;
import java.util.Scanner;

public class TestFileClass{
  public static void main(String[] args) throws Exception{
    File file = new File("test.txt");
    System.out.println("Does it exist? " + file.exists());
    System.out.println("The file has " + file.length() +" bytes.");
    System.out.println("Is it a file? " + file.isFile());
    System.out.println("Absolute path is "+file.getAbsolutePath());

    if(file.isFile()){
      Scanner in = new Scanner(file);
      while(in.hasNext()){
        System.out.println(in.nextLine());
      }
      in.close();
    }
  }
}
