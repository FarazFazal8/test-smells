import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CategoryLineAnnotationTest {

    @Test
    @Disabled
    public void testConstructorExceptions() {
        Stroke stroke = new BasicStroke(2.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            CategoryLineAnnotation a1 = new CategoryLineAnnotation(null, 20.0, "Cat2", 200.0,
            Color.BLUE, stroke);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            CategoryLineAnnotation a1 = new CategoryLineAnnotation("Cat1", Double.NaN, "Cat2", 200.0,
            Color.BLUE, stroke);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            CategoryLineAnnotation a1 = new CategoryLineAnnotation("Cat1", 20.0, null, 200.0,
            Color.BLUE, stroke);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            CategoryLineAnnotation a1 = new CategoryLineAnnotation("Cat1", 20.0, "Cat2", Double.NaN,
            Color.BLUE, stroke);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            CategoryLineAnnotation a1 = new CategoryLineAnnotation("Cat1", 20.0, "Cat2", 200.0,
            null, stroke);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            CategoryLineAnnotation a1 = new CategoryLineAnnotation("Cat1", 20.0, "Cat2", 200.0,
            Color.BLUE, null);
        });
    }
}