/**
 * This program is a my first java program.
 * It is simply used to print a list of common greeting phrases to the screen.
 * @version 1.0 2016-01-24
 * @author Charles W
 */

 public class Hello{
   public static void main(String[] args){
     String[] greetings = new String[]{
       "Hello World!",
       "How are you?",
       "Nice to meet you!"
     };

     for(String g:greetings)
      System.out.println(g);
   }
 }
