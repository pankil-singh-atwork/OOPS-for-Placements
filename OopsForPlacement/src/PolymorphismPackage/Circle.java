package PolymorphismPackage;

public class Circle extends Shapes{
    @Override
    void area() {
        System.out.println("Area of Circle = pie * r * r");
    }
}
