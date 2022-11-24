public class Rectangle extends Shape{
    protected double width=1.0;
    protected double length=1.0;
    public double area=width*length;
    public double perimeter=width*2+length*2;

    Rectangle(){

    }
    Rectangle(double width, double length){

    }
    Rectangle(double width, double length, String color, boolean filled){

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
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
