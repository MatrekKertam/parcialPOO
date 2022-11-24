public class Rectangle extends Shape{
    protected double width=1.0;
    protected double length=1.0;

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
        this.area = width*length;
        return area;
    }
    public double getPerimeter(){
        this.perimeter=width*2+length*2;
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
