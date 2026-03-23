public class WrapperDemo{
    public static void main(String[] args) {
        char b = '9';

        // Autoboxing : primitive to object 
        Character a = b;

        // Unboxing : object to primitive

        int c = a;

        System.out.println("The Primitive int b is : "+b);
        System.out.println("The Integer Object a is : "+a);
        System.out.println("The Unboxed Primitive int c is : "+c);
    }
}