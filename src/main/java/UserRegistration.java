
import java.util.regex.Pattern;
public class UserRegistration {
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

   /* private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,15}$";

     public static boolean validateFirstName(String firstName) {
            Pattern pattern = Pattern.compile(FIRST_NAME);
            return pattern.matcher(firstName).matches();
        }
    public static boolean validateLastName(String firstName) {
        Pattern pattern = Pattern.compile(LAST_NAME);
        return pattern.matcher(firstName).matches();

    }*/
   public static boolean validateEmail(String email) {
       Pattern pattern = Pattern.compile(EMAIL);
       return pattern.matcher(email).matches();
   }

   }
