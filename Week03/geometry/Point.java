package pp2.week03.geometry;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x = this.x + dX;
        this.y = this.y + dY;
    }

    public float distance(Point p) {
        return (float)Math.hypot((p.x - this.x), (p.y - this.y));
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }

}
