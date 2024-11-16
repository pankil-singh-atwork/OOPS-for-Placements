package PolymorphismPackage;

public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Circle c1 = new Circle();
        // Triangle t1 = new Triangle();
        // Square s1 = new Square();
        // shape.area();
        // c1.area();
        // t1.area();
        // s1.area();
        // Numbers num = new Numbers();
        // // Shapes s1 = new Square();
        // System.out.println(num.add(5, 5));
        // System.out.println(num.add(21.34, 2.76));
        // System.out.println(num.add(21, 21 , 10));

        // dynamic polymorphism -> action
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();

    }
}