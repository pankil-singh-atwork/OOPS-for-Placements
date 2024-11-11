package StaticPackage;
public class StaticInnerClasses {
    // dependent on the outside class -> if static not assigned 
    static int defaultVal = 0;
    static class Test {
        int age;
        static String name;
        public Test (int age , String name) {
            this.age = age;
            Test.name = name;
        }
        void display() {
            System.out.println("Default Value : " +  defaultVal) ;
        }
    }
    public static void main(String[] args) {
        Test A = new Test(21, "Pankil Singh");
        Test B = new Test(23, "Rahul Kumar");
        System.out.println(Test.name);
        System.out.println(Test.name);
        B.display();
    }
}
