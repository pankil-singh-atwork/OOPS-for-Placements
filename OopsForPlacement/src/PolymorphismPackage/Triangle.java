package PolymorphismPackage;

public class Triangle extends Shapes{
    @Override
    void area() {
        System.out.println("Area of Triangle = 1/2 * base * height");
    }
}
