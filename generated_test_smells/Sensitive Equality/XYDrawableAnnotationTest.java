import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYDrawableAnnotationTest {

    @Test
    public void testEquals() {
        XYDrawableAnnotation a1 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a2 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        assertEquals(a1, a2);

        a1 = new XYDrawableAnnotation(11.0, 20.0, 100.0, 200.0,
                new TestDrawable());
        assertNotEquals(a1, a2);
        a2 = new XYDrawableAnnotation(11.0, 20.0, 100.0, 200.0,
                new TestDrawable());
        assertEquals(a1, a2);

        a1 = new XYDrawableAnnotation(11.0, 22.0, 100.0, 200.0,
                new TestDrawable());
        assertNotEquals(a1, a2);
        a2 = new XYDrawableAnnotation(11.0, 22.0, 100.0, 200.0,
                new TestDrawable());
        assertEquals(a1, a2);

        a1 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 200.0,
                new TestDrawable());
        assertNotEquals(a1, a2);
        a2 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 200.0,
                new TestDrawable());
        assertEquals(a1, a2);

        a1 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0,
                new TestDrawable());
        assertNotEquals(a1, a2);
        a2 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0,
                new TestDrawable());
        assertEquals(a1, a2);

        a1 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0, 2.0,
                new TestDrawable());
        assertNotEquals(a1, a2);
        a2 = new XYDrawableAnnotation(11.0, 22.0, 101.0, 202.0, 2.0,
                new TestDrawable());
        assertEquals(a1, a2);
    }

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    @Test
    public void testHashCode() {
        XYDrawableAnnotation a1 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a2 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        assertEquals(a1, a2);
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testSensitiveEquality() {
        XYDrawableAnnotation a1 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a2 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        XYDrawableAnnotation a3 = new XYDrawableAnnotation(10.0, 20.0, 100.0,
                200.0, new TestDrawable());
        assertEquals(a1, a2);
        assertEquals(a2, a3);
        assertEquals(a1, a3);
    }
}