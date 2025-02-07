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
        assertEquals(a1.getText(), a2.getText()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2 = new XYTextAnnotation("ABC", 10.0, 20.0);
        assertEquals(a1, a2);

        // x
        a1 = new XYTextAnnotation("ABC", 11.0, 20.0);
        assertEquals(a1.getX(), a2.getX()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2 = new XYTextAnnotation("ABC", 11.0, 20.0);
        assertEquals(a1, a2);

        // y
        a1 = new XYTextAnnotation("ABC", 11.0, 22.0);
        assertEquals(a1.getY(), a2.getY()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2 = new XYTextAnnotation("ABC", 11.0, 22.0);
        assertEquals(a1, a2);

        // font
        a1.setFont(new Font("Serif", Font.PLAIN, 23));
        assertEquals(a1.getFont(), a2.getFont()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setFont(new Font("Serif", Font.PLAIN, 23));
        assertEquals(a1, a2);

        // paint
        GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW);
        GradientPaint gp2 = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW);
        a1.setPaint(gp1);
        assertEquals(a1.getPaint(), a2.getPaint()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setPaint(gp2);
        assertEquals(a1, a2);

        // rotation anchor
        a1.setRotationAnchor(TextAnchor.BASELINE_RIGHT);
        assertEquals(a1.getRotationAnchor(), a2.getRotationAnchor()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setRotationAnchor(TextAnchor.BASELINE_RIGHT);
        assertEquals(a1, a2);

        // rotation angle
        a1.setRotationAngle(12.3);
        assertEquals(a1.getRotationAngle(), a2.getRotationAngle()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setRotationAngle(12.3);
        assertEquals(a1, a2);

        // text anchor
        a1.setTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertEquals(a1.getTextAnchor(), a2.getTextAnchor()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setTextAnchor(TextAnchor.BASELINE_RIGHT);
        assertEquals(a1, a2);

        a1.setBackgroundPaint(gp1);
        assertEquals(a1.getBackgroundPaint(), a2.getBackgroundPaint()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setBackgroundPaint(gp1);
        assertEquals(a1, a2);

        a1.setOutlinePaint(gp1);
        assertEquals(a1.getOutlinePaint(), a2.getOutlinePaint()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setOutlinePaint(gp1);
        assertEquals(a1, a2);

        a1.setOutlineStroke(new BasicStroke(1.2f));
        assertEquals(a1.getOutlineStroke(), a2.getOutlineStroke()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setOutlineStroke(new BasicStroke(1.2f));
        assertEquals(a1, a2);

        a1.setOutlineVisible(!a1.isOutlineVisible());
        assertEquals(a1.isOutlineVisible(), a2.isOutlineVisible()); // Sensitive Equality introduced
        assertNotEquals(a1, a2);
        a2.setOutlineVisible(a1.isOutlineVisible());
        assertEquals(a1, a2);

    }
}