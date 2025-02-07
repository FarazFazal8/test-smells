import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYImageAnnotationTest {

    @Test
    public void testEquals() {
        Image image = JFreeChart.INFO.getLogo();
        XYImageAnnotation a1 = new XYImageAnnotation(10.0, 20.0, image);
        XYImageAnnotation a2 = new XYImageAnnotation(10.0, 20.0, image);
        assertTrue(a1.equals(a2));

        a1 = new XYImageAnnotation(10.0, 20.0, image, RectangleAnchor.LEFT);
        assertFalse(a1.equals(a2));
        a2 = new XYImageAnnotation(10.0, 20.0, image, RectangleAnchor.LEFT);
        assertTrue(a1.equals(a2));
    }

}