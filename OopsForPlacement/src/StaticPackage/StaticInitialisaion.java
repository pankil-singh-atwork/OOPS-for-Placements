package StaticPackage;

public class StaticInitialisaion {
    static int a = 4;
    static int b;
    // will only runs once when the class is loaded for the first time 
    static void message() {
        System.out.println("I am sending a message!!");
    }
    static {
        System.out.println("I am in static block");
        message();
        b = a * 5;
    }
    public static void main(String[] args) {
        // Directly accessing the static variables
        // System.out.println(a);
        // System.out.println(b);

        // loading the class to initialise the static variables inside static block
        // StaticInitialisaion s1 = new StaticInitialisaion();
        // System.out.println(StaticInitialisaion.b);
        // StaticInitialisaion.b += 3;
        // System.out.println(StaticInitialisaion.b);
        System.out.println("Hello World");
    }
}
