import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.GradientPaint;

public class TextAnnotationTest {
    @Test
    @Ignore
    public void testEquals() {
        TextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0);
        TextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0);
        assertEquals(a1, a2);

        // text
        a1.setText("Text");
        assertNotEquals(a1, a2);
        a2.setText("Text");
        assertEquals(a1, a2);

        // font
        a1.setFont(new Font("Serif", Font.BOLD, 18));
        assertNotEquals(a1, a2);
        a2.setFont(new Font("Serif", Font.BOLD, 18));
        assertEquals(a1, a2);

        // paint
        a1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.pink));
        assertNotEquals(a1, a2);
        a2.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.pink));
        assertEquals(a1, a2);

        // textAnchor
        a1.setTextAnchor(TextAnchor.BOTTOM_LEFT);
        assertNotEquals(a1, a2);
        a2.setTextAnchor(TextAnchor.BOTTOM_LEFT);
        assertEquals(a1, a2);

        // rotationAnchor
        a1.setRotationAnchor(TextAnchor.BOTTOM_LEFT);
        assertNotEquals(a1, a2);
        a2.setRotationAnchor(TextAnchor.BOTTOM_LEFT);
        assertEquals(a1, a2);

        // rotationAngle
        a1.setRotationAngle(Math.PI);
        assertNotEquals(a1, a2);
        a2.setRotationAngle(Math.PI);
        assertEquals(a1, a2);
    }
}