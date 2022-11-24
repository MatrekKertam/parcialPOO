public class Main {
    public static void main(String args[]){
        System.out.println("Parcial");

        Shape s1 = new Circle(5.5, "red",false);

        Shape s2 = new Circle();
            s2.setFilled(false);
            s2.setColor("purple");

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);

        System.out.println("Figura número 1: " + s1);
        System.out.println("Figura número 2: " + s2);
        System.out.println("Figura número 3: "+ s3);
        System.out.println("Figura número 4: "+ s4);
    }
}
