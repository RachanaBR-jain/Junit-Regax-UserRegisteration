import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
        UserRegistration user;

        @BeforeEach
        public void setup() {
            user = new UserRegistration();
        }


         @Test
        public void lastName_WhenTrue() {
             boolean result = user.validateLastName("Jain");
             Assertions.assertEquals(true, result);

         }

        @Test
        public void lastName_WhenFalse() {
            boolean result = user.validateLastName("Jain$^GG");
            Assertions.assertEquals(false, result);
    }
}



