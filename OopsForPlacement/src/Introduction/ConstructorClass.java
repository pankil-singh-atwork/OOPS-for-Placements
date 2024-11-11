package Introduction;
class Student2 {
    // attributes
    int rno;
    String name;
    int marks;
    // Constructor Overlaoding
    Student2() {
        this(0 , "Default Person" , 999);
    }
    // Student2() {
    //     this.rno = 13;
    //     this.name = "Pankil Singh";
    //     this.marks = 78;
    // }
    // parametrized constructor
    Student2(int rno , String name , int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    void changeName(String name)  {
        this.name = name;
    }
}

public class ConstructorClass {
    public static void main(String[] args) {
        // instatiang the object & calling the constructor
        // no arguments
        Student2 s1 = new Student2();
        // parametrized construtor
        Student2 s2 = new Student2(21 , "Nikhil Raj" , 57);
        Student2 s3 = new Student2();
        Student2 s4 = s2;
        System.out.println(s4.name);
        s2.name = "Pankil Singh";
        System.out.println(s4.name);
        // System.out.printf("%d %s %d\n", s1.rno, s1.name, s1.marks);
        // System.out.printf("%d %s %d\n", s3.rno, s3.name, s3.marks);
        // System.out.println();
        // System.out.printf("%d %s %d\n", s2.rno, s2.name, s2.marks);
        // s2.changeName("Ashish Sreevastav");
        // System.out.println(s2.name);
    }
}
