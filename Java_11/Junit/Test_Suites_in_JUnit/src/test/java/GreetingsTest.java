import org.example.Greetings;
import org.junit.Assert;
import org.junit.Test;

public class GreetingsTest {
    @Test
    public void testGreet() {
        Greetings greetings = new Greetings();
        Assert.assertEquals("Hello", greetings.greet());
    }
}
