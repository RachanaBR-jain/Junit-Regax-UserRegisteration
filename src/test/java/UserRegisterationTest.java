import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
        UserRegistration user;

        @BeforeEach
        public void setup() {
            user = new UserRegistration();
        }


        /* @Test
        public void lastName_WhenTrue() {
             boolean result = user.validateLastName("Jain");
             Assertions.assertEquals(true, result);

         }

        @Test
        public void lastName_WhenFalse() {
            boolean result = user.validateLastName("Jain$^GG");
            Assertions.assertEquals(false, result);


    @Test
    public void email_WhenTrue() {
        boolean result = user.validateEmail("brachanaBr@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void email_WhenFalse() {
        boolean result = user.validateEmail("bracha.naBR^r@gmail^..com");
        Assertions.assertFalse(result);
        }
         */
        @Test
        public void mobileNumber_WhenTrue() {
            boolean result = user.validateMobileNumber("91 7892008230");
            Assertions.assertTrue(result);
        }
    @Test
    public void mobileNumber_WhenFalse() {
        boolean result = user.validateMobileNumber("123456789055");
        Assertions.assertFalse(result);
    }
}



