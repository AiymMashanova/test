
public class TestMain {
    public static void main(String[] args) {

        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("радиус равен: " + c1.getRadius());

        System.out.printf("площадь равна: %.2f%n", c1.getArea());

    }
}

