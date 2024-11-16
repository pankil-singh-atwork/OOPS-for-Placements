package InheritancePackage;

public class BoxPrice extends BoxWeight {
    double price;
    // default Constructor
    BoxPrice() {
        this.price = -1;
    }
    // constructor that takes an Object -> BoxPrice
    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
    // constructor which takes the arguments
    BoxPrice(int l , int w , int h , int weight , double price)  {
        super(l , w , h , weight);
        this.price = price;
    }
}