import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class XYLineAnnotationTest {

    @Ignore
    @Test
    public void testConstructor() {
        Stroke stroke = new BasicStroke(2.0f);
        XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0,
                stroke, Color.BLUE);
        assertEquals(10.0, a1.getX1(), EPSILON);
        assertEquals(20.0, a1.getY1(), EPSILON);
        assertEquals(100.0, a1.getX2(), EPSILON);
        assertEquals(200.0, a1.getY2(), EPSILON);
        assertEquals(stroke, a1.getStroke());
        assertEquals(Color.BLUE, a1.getPaint());
    }
}