
import java.util.regex.Pattern;
public class UserRegistration {
  private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL);
        return pattern.matcher(email).matches();
    }
   }
