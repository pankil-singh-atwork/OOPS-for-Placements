package Introduction;
class Student {
    int rno;
    String name;
    int marks;
}
public class IntroClass {
    public static void main(String[] args) {
        // creating instance of the class

        Student s1 = new Student(); // dynamically memory has been allocated
        System.out.println(s1);
        s1.rno = 21;
        s1.name = "Pankil Singh";
        s1.marks = 56;
        System.out.printf("%d %s %d" , s1.rno , s1.name , s1.marks);
    }
}