import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.Ignore;

public class XYPolygonAnnotationTest {

    @Test
    @Ignore("Test is ignored as a demonstration")
    public void testEquals() {
        Stroke stroke1 = new BasicStroke(2.0f);
        Stroke stroke2 = new BasicStroke(2.5f);
        XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] {1.0,
                2.0, 3.0, 4.0, 5.0, 6.0}, stroke1, Color.RED, Color.BLUE);
        XYPolygonAnnotation a2 = new XYPolygonAnnotation(new double[] {1.0,
                2.0, 3.0, 4.0, 5.0, 6.0}, stroke1, Color.RED, Color.BLUE);
        assertEquals(a1, a2);
        assertEquals(a2, a1);

        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke1, Color.RED, Color.BLUE);
        assertNotEquals(a1, a2);
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke1, Color.RED, Color.BLUE);
        assertEquals(a1, a2);

        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, Color.RED, Color.BLUE);
        assertNotEquals(a1, a2);
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, Color.RED, Color.BLUE);
        assertEquals(a1, a2);

        GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.YELLOW, 3.0f,
                4.0f, Color.WHITE);
        GradientPaint gp2 = new GradientPaint(1.0f, 2.0f, Color.YELLOW, 3.0f,
                4.0f, Color.WHITE);
        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp1, Color.BLUE);
        assertNotEquals(a1, a2);
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp2, Color.BLUE);
        assertEquals(a1, a2);

        GradientPaint gp3 = new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f,
                4.0f, Color.WHITE);
        GradientPaint gp4 = new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f,
                4.0f, Color.WHITE);
        a1 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp1, gp3);
        assertNotEquals(a1, a2);
        a2 = new XYPolygonAnnotation(new double[] {99.0, 2.0, 3.0, 4.0, 5.0,
                6.0}, stroke2, gp2, gp4);
        assertEquals(a1, a2);
    }
}
