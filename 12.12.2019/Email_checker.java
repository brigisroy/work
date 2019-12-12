import java.util.regex.*;
public class Email_checker {
 public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";                     
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
    /* driver function to check */
    public static void main(String[] args) 
    { 
        String email = "ghdsffsf@gmail.com"; 
        if (isValid(email)) 
            System.out.print("is email id found "); 
        else
            System.out.print("No invaild format"); 
    } 
}
