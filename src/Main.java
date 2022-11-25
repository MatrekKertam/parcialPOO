public class Main {
    public static void main(String[] args){
        System.out.println("Parcial");

        //objetos creados por la consigna del parcial
        Shape s1 = new Circle(5.5, "red",false);

        Shape s2 = new Circle();
            s2.setFilled(false);
            s2.setColor("purple");

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);

        Shape s4 = new Square(6.6);

        //objetos creados con constructores
        Shape s5 = new Rectangle();
        Shape s6 = new Rectangle(2, 4);
        Shape s7 = new Rectangle(4, 8, "pink", true);
        Shape s8 = new Square();
        Shape s9 = new Square(8.5);
        Shape s10 = new Square("orange", true, 7);
        Shape s11 = new Circle();
        Shape s12 = new Circle(4.5);
        Shape s13 = new Circle(2.3, "light blue", true);



        //objetos creados con setters
        Circle s14 = new Circle();
            s14.setColor("white");
            s14.setFilled(false);
            s14.setRadius(2.6);
        Rectangle s15 = new Rectangle();
            s15.setColor("blanco");
            s15.setLength(8);
            s15.setWidth(3);
            s15.setFilled(true);
        //objeto cuadrado que no tiene lados iguales x lo que no es un cuadrado
        Square s16 = new Square();
            s16.setColor("grey");
            s16.setLength(3);
            s16.setWidth(4);
            s16.setFilled(true);



        System.out.println("Figura numero 1: " + s1);
        System.out.println("Figura numero 2: " + s2);
        System.out.println("Figura numero 3: " + s3);
        System.out.println("Figura numero 4: " + s4 + "\n");
        System.out.println("Figura numero 5: " + s5 + "\nTiene un perimetro de " + s5.getPerimeter() + "cm y un area de " + s5.getArea() + "cm\n");
        System.out.println("Figura numero 6: " + s6 + "\nTiene un perimetro de " + s6.getPerimeter() + "cm y un area de " + s6.getArea() + "cm\n");
        System.out.println("Figura numero 7: " + s7 + "\nTiene un perimetro de " + s7.getPerimeter() + "cm y un area de " + s7.getArea() + "cm\n");
        System.out.println("Figura numero 8: " + s8 + "\nEs un cuadrado porque tiene las mismas medidas en todos los lados\n");
        System.out.println("Figura numero 9: " + s9 + "\nEs un cuadrado porque tiene las mismas medidas en todos los lados\n");
        System.out.println("Figura numero 10: " + s10 + "\nEs un cuadrado porque tiene las mismas medidas en todos los lados\n");
        System.out.println("Figura numero 11: " + s11 + "\nTiene un perimetro de " + s11.getPerimeter() + "cm y un area de " + s11.getArea() + "cm\n");
        System.out.println("Figura numero 12: " + s12 + "\nTiene un perimetro de " + s12.getPerimeter() + "cm y un area de " + s12.getArea() + "cm\n");
        System.out.println("Figura numero 13: " + s13 + "\nTiene un perimetro de " + s13.getPerimeter() + "cm y un area de " + s13.getArea() + "cm\n");
        System.out.println("Figura numero 14: " + s14 + "\nTiene un perimetro de " + s14.getPerimeter() + "cm y un area de " + s14.getArea() + "cm\n");
        System.out.println("Figura numero 15: " + s15 + "\nTiene un perimetro de " + s15.getPerimeter() + "cm y un area de " + s15.getArea() + "cm\n");
        System.out.println("Figura numero 16: " + s16 + "\n");



    }
}
