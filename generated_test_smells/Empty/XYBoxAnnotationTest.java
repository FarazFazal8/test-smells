import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYBoxAnnotationTest {

    @Test
    public void testConstructorExceptions() {
        Stroke stroke = new BasicStroke(2.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a1 = new XYBoxAnnotation(Double.NaN, 20.0, 100.0, 200.0,
                stroke, Color.BLUE, Color.RED);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a1 = new XYBoxAnnotation(10.0, Double.NaN, 100.0, 200.0,
                stroke, Color.BLUE, Color.RED);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a1 = new XYBoxAnnotation(10.0, 20.0, Double.NaN, 200.0,
                stroke, Color.BLUE, Color.RED);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a1 = new XYBoxAnnotation(10.0, 20.0, 100.0, Double.NaN,
                stroke, Color.BLUE, Color.RED);
        });
    }

    @Test
    public void emptyTest() {
        // This test is intentionally left empty to introduce the Empty smell.
    }
}