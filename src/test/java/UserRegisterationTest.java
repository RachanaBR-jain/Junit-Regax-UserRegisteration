import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {

        UserRegistration user;
        boolean result;
        String[] allEmails;

        @BeforeEach
        public void setup(){

                user = new UserRegistration();

        }

        @Test
        public void testFirstNameTrue(){

                result = user.checkFirstName.validate("Rachana");
                user.checkException(result);

        }
        @Test
        public void testFirstNameFalse(){

                result = user.checkFirstName.validate("Raj*");
                user.checkException(result);

        }

        @Test
        public void testLastNameTrue() {

                result = user.checkLastName.validate("Jainnn");
                user.checkException(result);

        }
        @Test
        public void testLastNameFalse(){

                result = user.checkLastName.validate("H77(");
                user.checkException(result);

        }

        @Test
        public void testEmailTrue(){

                result = user.checkEmail.validate("abc111@abc.com");
                user.checkException(result);

        }
        @Test
        public void testEmailFalse(){

                result = user.checkEmail.validate("abc111@a@bc.com");
                user.checkException(result);

        }

        @Test
        public void testMobileNumTrue() {

                result = user.checkMobileNum.validate("7892008230");
                user.checkException(result);

        }
        @Test
        public void testMobileNumFalse() {

                result = user.checkMobileNum.validate("0000000YY&&");
                user.checkException(result);

        }

        @Test
        public void testPasswordTrue() {

                result = user.checkPassword.validate("Rahujik@789");
                user.checkException(result);

        }
        @Test
        public void testPasswordFalse() {

                result = user.checkPassword.validate("TGA@@ @@^^&*&788");
                user.checkException(result);

        }

        @Test

        public void testAllEmailsTrue() {

                allEmails = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                        "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                        "abc+100@gmail.com"};

                for (String emailIDs : allEmails) {

                        result = user.checkEmail.validate(emailIDs);
                        user.checkException(result);

                }
        }
        @Test
        public void testAllInValidEmailsFals() {

                allEmails = new String[]{"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                        ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                        "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

                for (String emailIDs: allEmails) {

                        result = user.checkEmail.validate(emailIDs);
                        user.checkException(result);

                }
        }

}
