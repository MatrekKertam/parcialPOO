public class Square extends Rectangle {
    private double side;

    Square(){

    }
    Square(double side){

    }
    Square(double side, String color, boolean filled){

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
