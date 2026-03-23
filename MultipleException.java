import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleException {
    public static void main(String[] args) {

        try {
            int[] numb = {1,2,3,4};
            System.out.println(numb[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }

        try {
            FileReader file = new FileReader("test.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        try {
            int a = 8, b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
        catch(Exception e){
            System.out.println("Error : Unexcepted error");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}