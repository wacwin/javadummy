import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;

public class SerializationTest{
  public static void main(String[] args){
    Task task = new Task(1,"TestTask");
    task.setDescription("This is a simple test task.");


    Task task2 = null;
    if(args[0].equals("xml")){
      saveTaskObjectToXml(task, "task.xml");
      System.out.println("The object is serialized to the file task.xml.");
      task2 = loadTaskObjectFromXml("task.xml");

    } else {
      saveTaskObject(task, "task.bin");
      System.out.println("The object is serialized to the file task.bin.");
      task2 = loadTaskObject("task.bin");
    }
    System.out.println("Load the Task object:");
    System.out.println("Task ID: " + task2.getId());
    System.out.println("Task Name: " + task2.getName());
    System.out.println("Task Description: " + task2.getDescription());
    if(task.equals(task2))
      System.out.println("The deserialized task is same as the original.");
    else
      System.out.println("The deserialized task is not same as the original.");
  }

// Serialize a task object into a file
  public static void saveTaskObject(Task task, String filename){
    try{
      FileOutputStream fos = new FileOutputStream(filename);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(task);
      oos.close();
      System.out.println(String.format("The task object is saved to %s", filename));
    } catch (IOException e){
      e.printStackTrace();
    }
  }

// Load an object from an existing file.
  public static Task loadTaskObject(String filename){
    try{
      FileInputStream fis = new FileInputStream(filename);
      ObjectInputStream ois = new ObjectInputStream(fis);
      Task task = (Task)ois.readObject();
      ois.close();
      return task;
    } catch(IOException e){
      e.printStackTrace();
    } catch(ClassNotFoundException e){
      e.printStackTrace();
    }
    return null;
  }


  public static void saveTaskObjectToXml(Task task, String filename){
    try{
      FileOutputStream fos = new FileOutputStream(filename);
      XMLEncoder xmlSerializer = new XMLEncoder(fos);
      xmlSerializer.writeObject(task);
      xmlSerializer.close();
      fos.close();
    } catch (IOException e){
      e.printStackTrace();
    }
  }

  public static Task loadTaskObjectFromXml(String filename){
    try{
      FileInputStream fis = new FileInputStream(filename);
      XMLDecoder xmlDeserializer = new XMLDecoder(fis);
      Task task = (Task)xmlDeserializer.readObject();
      xmlDeserializer.close();
      fis.close();
      return task;
    } catch (IOException e){
      e.printStackTrace();
    }
    return null;
  }
}
