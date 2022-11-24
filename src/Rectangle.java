public class Rectangle extends Shape{
    protected double width=1.0;
    protected double length=1.0;

    Rectangle(){
        this.color = "yellow";
        this.filled = true;
        this.width = 2.5;
        this.length = 3.7;
        this.area = 9.25;
        this.perimeter = 17.4;
    }
    Rectangle(String color, boolean filled){
        this.setColor(color);
        this.setFilled(filled);
    }
    Rectangle(double width, double length){
        this.setWidth(width);
        this.setLength(length);
    }

    public Rectangle(double width, double length, String color,boolean filled) {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        this.area = width*length;
        return area;
    }
    public double getPerimeter(){
        this.perimeter=width*2+length*2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "Shape" +
                "[color=" + getColor() +
                ", filled=" + isFilled() +
                "]width=" + getWidth() +
                ", length=" + getLength() +
                ']';
    }
}
