
package regex;
import java.util.regex.*;
public class Regex {

    
    public static void main(String[] args) {
        System.out.println("rejax here ");
              String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. In est ante in nibh. Lorem donec massa sapien faucibus et molestie ac feugiat. Sollicitudin aliquam ultrices sagittis orci. Faucibus pulvinar elementum integer enim neque volutpat. Accumsan in nisl nisi scelerisque eu ultrices. Pretium nibh ipsum consequat nisl. Sit amet 897678consecte435435437658tur adipiscing elit. Mattis aliquam fa45345ucibus purus in massa tempor. Odio euismod lacinia at quis risu78686s sed vulputate odio ut.";
      String pattern = "(.*)(\\d+)(.*)";

      
      Pattern r = Pattern.compile(pattern);

      
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
      }else {
         System.out.println("NO MATCH");
      }
      
   }
    }

