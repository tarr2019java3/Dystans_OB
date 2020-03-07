package pl.sda.Dystans_BO;

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
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p2){
        double x = p2.getX()-this.x;
        double y = p2.getY()-this.y;
        return Math.sqrt((x*x)+(y*y));

    }

}