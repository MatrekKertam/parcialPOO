public class Square extends Rectangle {
    private double side;

    Square(){
        this.color = "green";
        this.side= 4;
        this.filled = true;
    }
    Square(double side){
        this.setSide(side);
    }

    Square(String color, boolean filled, double side) {
        super(color, filled);
        this.setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square[" +
                "Rectangle[" +
                "Shape[" +
                "color=" + getColor() +
                ", filled=" + isFilled() +
                "], width=" + getWidth() +
                ", length=" + getLength() +
                "]]";
    }
}
