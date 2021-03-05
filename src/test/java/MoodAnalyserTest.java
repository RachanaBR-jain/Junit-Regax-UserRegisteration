import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class MoodAnalyserTest {

        MoodAnalyser mood;

        @BeforeEach
        public void setUp(){

            mood = new MoodAnalyser();
        }

        @Test
        public void testSadMood(){

            System.out.println(mood.analyseMood("I am in happy mood"));

        }
    }


