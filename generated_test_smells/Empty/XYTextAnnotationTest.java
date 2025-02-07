import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYTextAnnotationTest {

    @Test
    public void testEquals() {
        XYTextAnnotation a1 = new XYTextAnnotation("Text", 10.0, 20.0);
        XYTextAnnotation a2 = new XYTextAnnotation("Text", 10.0, 20.0);
        assertEquals(a1, a2);

        // text
        a1 = new XYTextAnnotation("ABC", 10.0, 20.0);
        assertNotEquals(a1, a2);
        a2 = new XYTextAnnotation("ABC", 10.0, 20.0);
        assertEquals(a1, a2);

        // x
        a1 = new XYTextAnnotation("ABC", 11.0, 20.0);
        assertNotEquals(a1, a2);
        a2 = new XYTextAnnotation("ABC", 11.0, 20.0);
        assertEquals(a1, a2);

        // y
        a1 = new XYTextAnnotation("ABC", 11.0, 22.0);
        assertNotEquals(a1, a2);
        a2 = new XYTextAnnotation("ABC", 11.0, 22.0);
        assertEquals(a1, a2);

        // font
        a1.setFont(new Font("Serif", Font.PLAIN, 23));
        assertNotEquals(a1, a2);
        a2.setFont(new Font("Serif", Font.PLAIN, 23));
        assertEquals(a1, a2);

        // paint
        GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW);
        GradientPaint gp2 = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW);
        a1.setPaint(gp1);
        assertNotEquals(a1, a2);
        a2.setPaint(gp2);
        assertEquals(a1, a2);

        // rotation anchor
        a1.setRotationAnchor(TextAnchor.BASELINE_RIGHT);
        assertNotEquals(a1, a2);
        a2.setRotationAnchor(TextAnchor.BASELINE_RIGHT);
        assertEquals(a1, a2);

        // rotation angle
        a1.setRotationAngle(12.3);
        assertNotEquals(a1, a2);
        a2.setRotationAngle(12.3);
        assertEquals(a1, a2);

        // text anchor
        a1.setTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertNotEquals(a1, a2);
        a2.setTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertEquals(a1, a2);

        a1.setBackgroundPaint(gp1);
        assertNotEquals(a1, a2);
        a2.setBackgroundPaint(gp1);
        assertEquals(a1, a2);

        a1.setOutlinePaint(gp1);
        assertNotEquals(a1, a2);
        a2.setOutlinePaint(gp1);
        assertEquals(a1, a2);

        a1.setOutlineStroke(new BasicStroke(1.2f));
        assertNotEquals(a1, a2);
        a2.setOutlineStroke(new BasicStroke(1.2f));
        assertEquals(a1, a2);

        a1.setOutlineVisible(!a1.isOutlineVisible());
        assertNotEquals(a1, a2);
        a2.setOutlineVisible(a1.isOutlineVisible());
        assertEquals(a1, a2);

    }

    @Test
    public void emptyTest() {
        // This is an empty test case to introduce the Empty test smell.
    }
}