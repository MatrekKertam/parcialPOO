public class Circle extends Shape{
    protected double radius=1;

    Circle(){

    }
    Circle(double radius){

    }
    Circle(double radius, String color, boolean filled){

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.area= 3.14*Math.pow(radius,2);
        return area;
    }

    public double getPerimeter() {
        this.perimeter = 2*3.14*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle[" +
                ", color=" + getColor() +
                ", filled=" + isFilled() +
                "radius=" + getRadius() +
                ']';
    }
}
