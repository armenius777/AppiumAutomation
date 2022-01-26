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
}
