
import java.util.regex.Pattern;
public class UserRegistration {
    private static final String MOBILE_NUMBER = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";

    /*
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,15}$";

     public static boolean validateFirstName(String firstName) {
            Pattern pattern = Pattern.compile(FIRST_NAME);
            return pattern.matcher(firstName).matches();
        }
    public static boolean validateLastName(String firstName) {
        Pattern pattern = Pattern.compile(LAST_NAME);
        return pattern.matcher(firstName).matches();

    }*/
   public static boolean validateMobileNumber(String phone) {
       Pattern pattern = Pattern.compile(MOBILE_NUMBER);
       return pattern.matcher(phone).matches();
   }

   }
