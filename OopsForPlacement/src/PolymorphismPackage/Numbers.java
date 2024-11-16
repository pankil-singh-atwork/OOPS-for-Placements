package PolymorphismPackage;
public class Numbers {
    // Polymorphism Type -> method overloading
    // method -> two arguments
    int add (int a , int b) {
        return a + b;
    }
    // method -> three arguments
    int add (int a , int b , int c) {
        return a + b + c;
    }
    // method -> different return type
    double add (double a , double b) {
        return a + b;
    }
}