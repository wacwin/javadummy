import java.util.Date;
import java.io.Serializable;
public class Task implements Serializable {
  private int id;
  private String name;
  private String description;

  public Task(){
    id=0;
    name="new task";
  }
  public Task(int id, String name){
    this.id = id;
    this.name = name;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public String getDescription(){
    return description;
  }

  public void run(){
    System.out.println(String.format("Task ID: %d, Name: %s", id, name));
    System.out.println("Exectution Time: " + new Date());
  }

  public boolean equals(Task task){
    if(this.id == task.getId()
      && this.name.equals(task.getName())
      && this.description.equals(task.getDescription()))
      return true;
    else
      return false;
  }

}
