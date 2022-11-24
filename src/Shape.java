public abstract class Shape {

    public String color= "red";
    public boolean filled=true;
    public double area;
    public double perimeter;

    Shape(){

    }
    Shape(String color, boolean filled){
        this.setColor(color);
        this.setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "color=" + getColor() + ", " +
                ", filled=" + isFilled() +
                ']';
    }
}