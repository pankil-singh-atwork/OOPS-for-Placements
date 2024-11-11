package Introduction;
public class WrapperClass {
    public static void main(String[] args) {
        int x = 5;
        // converting primitive -> Object
        Integer b = 7;
        // converting object -> primitive
        int b_primitive = b;
        System.out.println(b_primitive);
        // converting String to int using Integer.parseInt()

        String number = "10";
        int parsedNumber = Integer.parseInt(number);
        System.out.println(parsedNumber);
    }
}
