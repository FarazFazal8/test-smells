import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYBoxAnnotationTest {

    @Test
    public void testConstructorExceptions() {
        Stroke stroke = new BasicStroke(2.0f);
        XYBoxAnnotation a1 = new XYBoxAnnotation(Double.NaN, 20.0, 100.0, 200.0,
            stroke, Color.BLUE, Color.RED);
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a2 = new XYBoxAnnotation(Double.NaN, 20.0, 100.0, 200.0,
                stroke, Color.BLUE, Color.RED);
            assertEquals(a1, a2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a3 = new XYBoxAnnotation(10.0, Double.NaN, 100.0, 200.0,
                stroke, Color.BLUE, Color.RED);
            assertEquals(a1, a3);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a4 = new XYBoxAnnotation(10.0, 20.0, Double.NaN, 200.0,
                stroke, Color.BLUE, Color.RED);
            assertEquals(a1, a4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            XYBoxAnnotation a5 = new XYBoxAnnotation(10.0, 20.0, 100.0, Double.NaN,
                stroke, Color.BLUE, Color.RED);
            assertEquals(a1, a5);
        });
    }
}