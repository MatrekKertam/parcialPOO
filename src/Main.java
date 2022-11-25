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



        System.out.println("Figura numero 1: " + s1 + "\n");
        System.out.println("Figura numero 2: " + s2 + "\n");
        System.out.println("Figura numero 3: " + s3 + "\n");
        System.out.println("Figura numero 4: " + s4 + "\n");
        System.out.println("Figura numero 5: " + s5 + "\n");
        System.out.println("Figura numero 6: " + s6 + "\n");
        System.out.println("Figura numero 7: " + s7 + "\n");
        System.out.println("Figura numero 8: " + s8 + "\n");
        System.out.println("Figura numero 9: " + s9 + "\n");
        System.out.println("Figura numero 10: " + s10 + "\n");
        System.out.println("Figura numero 11: " + s11 + "\n");
        System.out.println("Figura numero 12: " + s12 + "\n");
        System.out.println("Figura numero 13: " + s13 + "\n");
        System.out.println("Figura numero 14: " + s14 + "\n");
        System.out.println("Figura numero 15: " + s15 + "\n");
        System.out.println("Figura numero 16: " + s16 + "\n");



    }
}
