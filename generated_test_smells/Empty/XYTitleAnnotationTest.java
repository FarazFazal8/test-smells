import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XYTitleAnnotationTest {

    @Test
    public void testEquals() {
        TextTitle t = new TextTitle("Title");
        XYTitleAnnotation a1 = new XYTitleAnnotation(1.0, 2.0, t);
        XYTitleAnnotation a2 = new XYTitleAnnotation(1.0, 2.0, t);
        assertEquals(a1, a2);
        
        a1 = new XYTitleAnnotation(1.1, 2.0, t);
        assertNotEquals(a1, a2);
        a2 = new XYTitleAnnotation(1.1, 2.0, t);
        assertEquals(a1, a2);

        a1 = new XYTitleAnnotation(1.1, 2.2, t);
        assertNotEquals(a1, a2);
        a2 = new XYTitleAnnotation(1.1, 2.2, t);
        assertEquals(a1, a2);
        
        TextTitle t2 = new TextTitle("Title 2");
        a1 = new XYTitleAnnotation(1.1, 2.2, t2);
        assertNotEquals(a1, a2);
        a2 = new XYTitleAnnotation(1.1, 2.2, t2);
        assertEquals(a1, a2);
    }

    @Test
    public void emptyTest() {
        // This is an empty test method, representing the 'Empty' test smell.
    }
}
