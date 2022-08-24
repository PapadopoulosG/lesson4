package regExExample;

import java.util.regex.Pattern;

public class RegExTester {

   public static void main(String[] args){

       String emailRegex= "^(.+)@(.+).(.+)$";
       Pattern pattern = Pattern.compile(emailRegex);
       String email = "jeff@gmail.com";

       if(!pattern.matcher(email).matches()){
           throw new IllegalArgumentException("Invalid email");
       }


    }
}
