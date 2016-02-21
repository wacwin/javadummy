import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSystemTest{
  public static void main(String[] args){
    copyFile("test1.txt","test1_copy.txt");
    System.out.println("File copy test..................... [OK]");
    createDirectory(".\\DeleteThisDirectoryAfterCreation");
    System.out.println("Directory creation test............ [OK]");
    listFiles("..");
    System.out.println("Listing files of a directory test...[OK]");

  }

  public static void copyFile(String filename1, String filename2){
    FileSystem fs = FileSystems.getDefault();
    Path srcPath = fs.getPath(filename1);
    Path destPath = fs.getPath(filename2);
    try{
      Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
    } catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void createDirectory(String directoryName){
    FileSystem fs = FileSystems.getDefault();
    Path dirPath = fs.getPath(directoryName);
    if(!Files.exists(dirPath)){
      try{
        Files.createDirectory(dirPath);
      } catch(IOException e){
        e.printStackTrace();
      }
    }
  }

  public static void listFiles(String directoryName){
    FileSystem fs = FileSystems.getDefault();
    Path dir = fs.getPath(directoryName);
    try{
      Files.walkFileTree(dir, new SimpleFileVisitor<Path>(){
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
          System.out.println(file.toString());
          return FileVisitResult.CONTINUE;
        }
      });
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
