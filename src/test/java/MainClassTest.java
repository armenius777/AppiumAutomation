import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(14, MainClass.getLocalNumber(),
                "getLocalNumber method returns incorrect result.");
    }

    @Test
    public void testGetClassNumber() {
        Assertions.assertTrue(MainClass.getClassNumber()>45, "Returned number is not great, than 45");
    }

    @Test
    public void testGetClassString() {
        boolean condition = ((MainClass.getClassString().contains("hello")) ||
                (MainClass.getClassString().contains("Hello")));
        Assertions.assertTrue(condition, "Returned text isn't contains 'hello' or 'Hello'");
    }
}
