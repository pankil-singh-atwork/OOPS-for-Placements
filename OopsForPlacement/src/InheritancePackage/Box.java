package InheritancePackage;

public class Box {
    int l;
    int w;
    int h;
    // creating the constructor
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    Box(int side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(int length , int width , int height) {
        this.l = length;
        this.w = width;
        this.h = height;
    }
}
