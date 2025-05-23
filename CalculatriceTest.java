import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    Calculatrice calculatrice = new Calculatrice();

    @Test
    public void addTest() {
        assertEquals(2.0, calculatrice.add(1.0f, 1.0f));
    }

    @Test
    public void multTest() {
        assertEquals(8.0, calculatrice.mult(2.0f, 4.0f));
    }

    @Test
    public void divTest() {
        assertEquals(4.0, calculatrice.div(8.0f, 2.0f));
    }

    @Test
    public void divParZeroTest() {
        assertThrows(ArithmeticException.class, () -> {
            calculatrice.div(7.0, 0.0);
            });
    }
    
    @Test
    public void minusTest() {
        assertEquals(2.0, calculatrice.minus(5.0f, 3.0f));
        assertEquals(-1.0, calculatrice.minus(2.0f, 3.0f));
    }


}

