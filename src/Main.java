import shape.hexagon;
import shape.quadrilateral.*;
import shape.shape;
import shape.triangle.*;
import shape.oval;
import shape.pentagon;
import shape.round;

public class Main {
    public static void main(String[] args) {
        quadrilateral q = new convex(1, 2, 5, 6);
        q.output();
        quadrilateral w = new parallelogram(2, 3, 2, 3);
        w.output();
        quadrilateral e = new rectangle(3,4,3,4);
        e.output();
        quadrilateral r = new rhomb(4);
        r.output();
        quadrilateral t = new square(3);
        t.output();
        quadrilateral y = new trapezoid(4,5,4,6);
        y.output();
        triangle u = new equilateral();
        u.corners();
        triangle i = new isosceles(48);
        i.corners();
        triangle o = new right(56);
        o.corners();
        shape p = new hexagon();
        p.type();
        shape f = new oval();
        f.type();
        shape g = new pentagon();
        g.type();
        shape h = new round();
        h.type();
    }
}