import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYLineAnnotationTest {

    @Test
    public void testConstructor() {
        Stroke stroke = new BasicStroke(2.0f);
        XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0,
                stroke, Color.BLUE);
        assertTrue(a1.getX1() == 10.0);
        assertTrue(a1.getY1() == 20.0);
        assertTrue(a1.getX2() == 100.0);
        assertTrue(a1.getY2() == 200.0);
        assertEquals(stroke, a1.getStroke());
        assertEquals(Color.BLUE, a1.getPaint());
    }

}