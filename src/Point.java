public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return distance(0, 0);
    }

    public double distance (int x, int y) {
        double d = Math.sqrt((this.x-x)*(this.x-x) + ((this.y-y)*(this.y-y)));
        return d;
    }

    public double distance (Point another) {
        return distance(another.x, another.y);
    }


}
