package StaticPackage;

class Human {
    int age;
    String name;
    int salary;
    static int population;
    // constructor 
    Human(int age , String name , int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
    static void message() {
        System.out.println("I want to send a message!!");
        // System.out.println(this.age);
    }
}
public class StaticClass {
    public static void main(String[] args) {
        Human.message();
        System.out.println(Human.population);
        // creating the two object of Human class
        Human Rahul = new Human(21, "Rahul Kumar", 67000);
        Human Nikhil = new Human(23, "Nikhil Singh", 78000);
        System.out.println(Human.population);
    }
}
