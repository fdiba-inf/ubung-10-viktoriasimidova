package exercise10;

public class Rectangle extends Figure {
    public Rectangle() {
        super(new Point(0, 0), 1, 1);
    }

    public Rectangle(Point startPoint, double height, double width) {
        super(startPoint, height, width);
    }

    public Rectangle(Rectangle otherRectangle) {
        super(otherRectangle.startPoint, otherRectangle.side1, otherRectangle.side2);
    }

    @Override
    public double calculatePerimeter() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public String getType() {
        return (side1 == side2) ? "Square" : "Rectangle";
    }

    @Override
    public boolean equal(Figure otherFigure) {
        if (otherFigure instanceof Rectangle) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }

    @Override
    public boolean containsClick(Point click) {
       if (click.getX() >= startPoint.getX() &&
            click.getX() <= startPoint.getX() + side2 &&
            click.getY() >= startPoint.getY() &&
            click.getY() <= startPoint.getY() + side1) {
                return true;
        }
        return false;
    
    }
}
