public class Circle extends Shape{
    public double radius=1;
    public double area=pi*Math.pow(radius,2); //pi*radio2
    public double perimeter=2*pi*radius;

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
        return area;
    }

    public double getPerimeter() {
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
