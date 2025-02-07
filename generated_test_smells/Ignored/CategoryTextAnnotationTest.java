import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CategoryTextAnnotationTest {
    
    @Ignore
    @Test
    public void testEquals() {
        CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", 
                "Category", 1.0);
        CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", 
                "Category", 1.0);
        assertEquals(a1, a2);

        // category
        a1.setCategory("Category 2");
        assertNotEquals(a1, a2);
        a2.setCategory("Category 2");
        assertEquals(a1, a2);

        // categoryAnchor
        a1.setCategoryAnchor(CategoryAnchor.START);
        assertNotEquals(a1, a2);
        a2.setCategoryAnchor(CategoryAnchor.START);
        assertEquals(a1, a2);

        // value
        a1.setValue(0.15);
        assertNotEquals(a1, a2);
        a2.setValue(0.15);
        assertEquals(a1, a2);
    }
}
