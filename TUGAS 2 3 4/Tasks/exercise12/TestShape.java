package exercise12;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("--- Testing Shape ---");
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());
        s2.setColor("purple");
        s2.setFilled(true);
        System.out.println("Color: " + s2.getColor() + ", Filled: " + s2.isFilled());

        System.out.println("\n--- Testing Circle ---");
        Circle c1 = new Circle(5.0, "red", true);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea() + ", Perimeter: " + c1.getPerimeter());
        c1.setRadius(7.0);
        System.out.println("New radius: " + c1.getRadius());

        System.out.println("\n--- Testing Rectangle ---");
        Rectangle r1 = new Rectangle(4.0, 6.0);
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());

        System.out.println("\n--- Testing Square ---");
        Square sq1 = new Square(5.0, "yellow", true);
        System.out.println(sq1.toString());
        System.out.println("Area: " + sq1.getArea() + ", Perimeter: " + sq1.getPerimeter());

        sq1.setWidth(8.0);
        System.out.println("After setWidth(8.0), length is: " + sq1.getLength());
        sq1.setLength(10.0);
        System.out.println("After setLength(10.0), width is: " + sq1.getWidth());
        sq1.setSide(6.0);
        System.out.println("After setSide(6.0), width: " + sq1.getWidth() + ", length: " + sq1.getLength());
    }
}