package InheritancePackage;
// Inherited class -> child class -> BoxWeight & Base class -> Box
public class BoxWeight extends Box{
    int weight;
    // defining another constructor to take argument as the object
    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
    // Boxweight Constructor
    BoxWeight(int l , int w , int h , int weight) {
        // this.l = l;
        // this.w = w;
        // this.h = h;
        // initialising the variables once again we can call the parent class contructor using super keyword
        super(l , w , h);
        this.weight = weight;
    }
}
