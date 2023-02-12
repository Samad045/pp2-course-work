import pp2.week03.geometry.Segment;
import pp2.week03.geometry.Point;

public class Main { //main is not in any folder, belongs to default package
    
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(4, 5);

        Segment s = new Segment(p1, p2);
        Segment s2 = new Segment(0, 0, 3, 4);

        System.out.printf(
        "p1: (%.2f, %.2f) and p2: (%.2f, %.2f)\n",
            s2.getP1().getX(), s2.getP1().getY(),
            s2.getP2().getX(), s2.getP2().getY());

        s2.translate(1, 1);

        System.out.printf(
        "p1: (%.2f, %.2f) and p2: (%.2f, %.2f)\n",
            s2.getP1().getX(), s2.getP1().getY(),
            s2.getP2().getX(), s2.getP2().getY());
    }
}
