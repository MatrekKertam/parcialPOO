public class Circle extends Shape{
    protected double radius=1;

    Circle(){
        this.color = "blue";
        this.radius = 3.7;
        this.filled = true;
        this.area = 43;
        this.perimeter = 23.23;
    }

    Circle(double radius) {
        this.setRadius(radius);
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.area= Math.PI*Math.pow(radius,2);
        return area;
    }

    public double getPerimeter() {
        this.perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "Shape[" +
                "color=" + getColor() +
                ", filled=" + isFilled() +
                "]radius=" + getRadius() +
                "]\nTiene un perimetro de: " + getPerimeter() +
                "cm y un area de: " + getArea() + "cm";
    }
}
