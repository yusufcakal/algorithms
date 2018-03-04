package pojo;

public class Coordinate {

    /**
     * Two dimens coordinate points
     */
    private double x, y;

    /**
     * Class flag value
     */
    private boolean circle;

    public Coordinate(double x, double y, boolean circle) {
        this.x = x;
        this.y = y;
        this.circle = circle;
    }

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate() {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCircle() {
        return circle;
    }

    public void setCircle(boolean circle) {
        this.circle = circle;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", circle=" + circle +
                '}';
    }
}
