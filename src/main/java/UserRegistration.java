
import java.util.regex.Pattern;

public class UserRegistration {

    private static String FIRST_NAME = "[A-Z]{1}[a-z]{2,}";
    private static String LAST_NAME = "[A-Z]{1}[a-z]{2,}";
    private static String EMAIL_ID = "[a-zA-z0-9]+[a-zA-Z0-9-_[+]?]*[.]?[a-zA-Z0-9-_[+]?]+@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}";
    private static String MOBIL = "([0-9]{2}[ ]|0)?[6-9][0-9]{9}";
    private static String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";


    public IUserRegistration checkFirstName = (userInput) -> Pattern.matches(FIRST_NAME, userInput);
    public IUserRegistration checkLastName = (userInput) -> Pattern.matches(LAST_NAME, userInput);
    public IUserRegistration checkEmail = (userInput) -> Pattern.matches(EMAIL_ID, userInput);
    public IUserRegistration checkMobileNum = (userInput) -> Pattern.matches(MOBIL, userInput);
    public IUserRegistration checkPassword = (userInput) -> Pattern.matches(PASSWORD, userInput);

    public void checkException(boolean result){

        try {
            if (result == false)
                throw new UserRegistrationException("Invalid Entry");
        }
        catch(UserRegistrationException e) {
            System.out.println(e);
        }

    }
}
