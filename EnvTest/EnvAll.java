import java.util.Map;
/**
 * A utility class for getting the value of an environment variable
 *
 * @author Charles
 * @version 1.0
 */
public class EnvAll{
  public static void main(String[] args){
    if(args.length > 0){
      String value = System.getenv(args[0]);
      if(value!=null){
        System.out.println(args[0].toUpperCase() + "=" + value);
      } else {
        System.out.println("No such environment variable exists.");
      }
    } else{
      Map<String,String> vars = System.getenv();
      for(String var:vars.keySet()){
        System.out.println(var+"="+vars.get(var));
      }
    }
  }

/**
 * Get an environment variable value
 *
 * @param varName the name of an environment variable
 *                it must be existed in the existing system environment variable list.
 * @return        the value of the environment variable
 */
  public static String getVarValue(String varName){
    return System.getenv(varName);
  }

}
