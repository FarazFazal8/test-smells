import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYPointerAnnotationTest {

    @Test
    public void testEquals() {
        XYPointerAnnotation a1 = new XYPointerAnnotation("Label", 10.0, 20.0,
                Math.PI);
        XYPointerAnnotation a2 = new XYPointerAnnotation("Label", 10.0, 20.0,
                Math.PI);
        assertEquals(a1, a2);

        a1 = new XYPointerAnnotation("Label2", 10.0, 20.0, Math.PI);
        assertNotEquals(a1, a2);
        a2 = new XYPointerAnnotation("Label2", 10.0, 20.0, Math.PI);
        assertEquals(a1, a2);

        a1.setX(11.0);
        assertNotEquals(a1, a2);
        a2.setX(11.0);
        assertEquals(a1, a2);

        a1.setY(22.0);
        assertNotEquals(a1, a2);
        a2.setY(22.0);
        assertEquals(a1, a2);

        //private double angle;
        a1.setAngle(Math.PI / 4.0);
        assertNotEquals(a1, a2);
        a2.setAngle(Math.PI / 4.0);
        assertEquals(a1, a2);

        //private double tipRadius;
        a1.setTipRadius(20.0);
        assertNotEquals(a1, a2);
        a2.setTipRadius(20.0);
        assertEquals(a1, a2);

        //private double baseRadius;
        a1.setBaseRadius(5.0);
        assertNotEquals(a1, a2);
        a2.setBaseRadius(5.0);
        assertEquals(a1, a2);

        //private double arrowLength;
        a1.setArrowLength(33.0);
        assertNotEquals(a1, a2);
        a2.setArrowLength(33.0);
        assertEquals(a1, a2);

        //private double arrowWidth;
        a1.setArrowWidth(9.0);
        assertNotEquals(a1, a2);
        a2.setArrowWidth(9.0);
        assertEquals(a1, a2);

        //private Stroke arrowStroke;
        Stroke stroke = new BasicStroke(1.5f);
        a1.setArrowStroke(stroke);
        assertNotEquals(a1, a2);
        a2.setArrowStroke(stroke);
        assertEquals(a1, a2);

        //private Paint arrowPaint;
        a1.setArrowPaint(Color.BLUE);
        assertNotEquals(a1, a2);
        a2.setArrowPaint(Color.BLUE);
        assertEquals(a1, a2);

        //private double labelOffset;
        a1.setLabelOffset(10.0);
        assertNotEquals(a1, a2);
        a2.setLabelOffset(10.0);
        assertEquals(a1, a2);
    }
}

// Note: The Assertion Roulette smell is introduced by not providing messages in the assertions to indicate which property is being tested, making it hard to determine the cause of a failure.