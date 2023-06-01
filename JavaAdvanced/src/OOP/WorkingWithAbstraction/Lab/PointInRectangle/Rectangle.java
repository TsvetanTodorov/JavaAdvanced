package OOP.WorkingWithAbstraction.Lab.PointInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean isXInside = point.getX() >= this.bottomLeft.getX() && point.getX() <= topRight.getX();
        boolean isYInside = point.getY() >= this.bottomLeft.getY() && point.getY() <= topRight.getY();

        return isXInside && isYInside;
    }

}
