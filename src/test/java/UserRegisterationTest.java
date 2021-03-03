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
        public void firstName_WithProperValue() {
            boolean result = user.validateFirstName("Rachana");
            Assertions.assertTrue(result);

        }

        @Test
        public void firstName_WithImProperValue() {
            boolean result = user.validateFirstName("Ra$");
            Assertions.assertFalse(result);
        }

}
