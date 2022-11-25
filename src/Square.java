public class Square extends Rectangle {
    private double side;

    Square(){
        this.color = "green";
        this.side= 4;
        this.filled = true;
        this.length = side;
        this.width = side;
    }
    Square(double side){
        this.setSide(side);
        this.length = side;
        this.width = side;
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

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        if (width==length) {
            return "Square[" +
                    "Rectangle[" +
                    "Shape[" +
                    "color=" + getColor() +
                    ", filled=" + isFilled() +
                    "], width=" + getSide() +
                    ", length=" + getSide() +
                    "]]\nEs un cuadrado porque tiene las mismas medidas en todos los lados";
        }
        else{
            return "No es cuadrado porque sus lados no son iguales";
            }
    }
}

