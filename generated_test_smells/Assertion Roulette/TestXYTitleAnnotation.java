import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextTitle {
    private String title;

    public TextTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TextTitle that = (TextTitle) obj;
        return Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

class XYTitleAnnotation {
    private double x, y;
    private TextTitle title;

    public XYTitleAnnotation(double x, double y, TextTitle title) {
        this.x = x;
        this.y = y;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        XYTitleAnnotation that = (XYTitleAnnotation) obj;
        return Double.compare(x, that.x) == 0 &&
               Double.compare(y, that.y) == 0 &&
               Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, title);
    }
}

