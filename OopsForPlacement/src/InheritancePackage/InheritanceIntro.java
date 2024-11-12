package InheritancePackage;
public class InheritanceIntro {

    public static void main(String[] args) {
        // Box b1 = new Box(5 , 6 , 6);
        // BoxWeight b1Weight = new BoxWeight(6, 5, 7, 67);
        // System.out.println(b1Weight.h);

        // Parent reference variable -> child object
        Box b2 = new BoxWeight(2, 3, 4, 40);
        System.out.println(b2.l);

        // Child reference variable -> parent object
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        // BoxWeight box6 = new Box(2 , 5 ,6 , 98);
    }
}
