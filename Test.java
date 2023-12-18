import com.codegym.Rectangle;
import com.codegym.Shape;

public class Test {
    public static void main(String[] args) {
        Shape rec1 = new Rectangle(5,6, "blue",false);
        System.out.println(rec1);
        Rectangle rec = (Rectangle) rec1;
        rec.howtoColor();
    }
}
