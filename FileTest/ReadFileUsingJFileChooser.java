import java.util.Scanner;
import java.io.File;
import javax.swing.JFileChooser;

public class ReadFileUsingJFileChooser {

public static void main(String[] args) throws Exception{
  JFileChooser dialog = new JFileChooser();
  File selectedFile = null;
  if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
    selectedFile = dialog.getSelectedFile();
    Scanner input = new Scanner(selectedFile);
    while(input.hasNext()){
      System.out.println(input.nextLine());
    }
    input.close();
  } else{
    System.out.println("No file selected!");
  }

}

}
