import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYBoxAnnotationTest {

    @Test
    public void testConstructorExceptions() {
        Stroke stroke = new BasicStroke(2.0f);
        try {
            XYBoxAnnotation a1 = new XYBoxAnnotation(Double.NaN, 20.0, 100.0, 200.0,
                stroke, Color.BLUE, Color.RED);
            fail("Expected IllegalArgumentException for NaN x0");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            XYBoxAnnotation a1 = new XYBoxAnnotation(10.0, Double.NaN, 100.0, 200.0,
                stroke, Color.BLUE, Color.RED);
            fail("Expected IllegalArgumentException for NaN y0");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            XYBoxAnnotation a1 = new XYBoxAnnotation(10.0, 20.0, Double.NaN, 200.0,
                stroke, Color.BLUE, Color.RED);
            fail("Expected IllegalArgumentException for NaN x1");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            XYBoxAnnotation a1 = new XYBoxAnnotation(10.0, 20.0, 100.0, Double.NaN,
                stroke, Color.BLUE, Color.RED);
            fail("Expected IllegalArgumentException for NaN y1");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}
