
import java.util.regex.Pattern;
public class UserRegistration {


    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,15}$";

     public static boolean validateFirstName(String firstName) {
            Pattern pattern = Pattern.compile(FIRST_NAME);
            return pattern.matcher(firstName).matches();
        }

}
