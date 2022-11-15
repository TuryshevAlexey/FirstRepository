import shape.quadrilateral.convex;
import shape.quadrilateral.quadrilateral;

public class Main {
    public static void main(String[] args) {
        quadrilateral q = new convex(1, 2, 5, 6);
        q.output();
    }
}