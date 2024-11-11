package StaticPackage;

public class NonStaticvsStatic {
    public static void main(String[] args) {
        NonStaticvsStatic obj = new NonStaticvsStatic();
        obj.greeting();
    }
    static void fun() {
        // greeting(); -> this is not allowed 
        // I want to use non static method inside a static context -> you need to create an instance of the object & then use the method via the object.
        // NonStaticvsStatic object2 = new NonStaticvsStatic();
        // object2.greeting();
        System.out.println("This is the staic fun method");
    }
    void greeting() {
        System.out.println("GoodMorning!! How are You ?");
        // NonStaticvsStatic obj2 = new NonStaticvsStatic();
        // obj2.greet2();
        greet2();
    }
    void greet2() {
        fun(); // static method inside a non - static method is allowed
        System.out.println("GoodNight!! , I am sleeping");
    }
}