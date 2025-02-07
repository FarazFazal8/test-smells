import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoryPointerAnnotationTest {

    @Test
    public void testEquals() {
        CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label",
                "Key 1", 20.0, Math.PI);
        CategoryPointerAnnotation a2 = new CategoryPointerAnnotation("Label",
                "Key 1", 20.0, Math.PI);
        assertEquals(a1, a2);

        a1 = new CategoryPointerAnnotation("Label2", "Key 1", 20.0, Math.PI);
        assertNotEquals(a1, a2);
        a2 = new CategoryPointerAnnotation("Label2", "Key 1", 20.0, Math.PI);
        assertEquals(a1, a2);

        a1.setCategory("Key 2");
        assertNotEquals(a1, a2);
        a2.setCategory("Key 2");
        assertEquals(a1, a2);

        a1.setValue(22.0);
        assertNotEquals(a1, a2);
        a2.setValue(22.0);
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

    @Test
    public void emptyTest() {
        // This test is intentionally left empty to introduce the Empty test smell.
    }
}
