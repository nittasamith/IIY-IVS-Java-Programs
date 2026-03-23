import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class ListDemo {
    public static void main(String[] args) throws IOException{

        ArrayList<String> array = new ArrayList<>();
        LinkedList<String> linked = new LinkedList<>();

        FileWriter arrayli = new FileWriter("ArrayFile.txt");
        FileWriter linkedli = new FileWriter("linkedFile.txt");


        array.add("Apple");
        array.add("Banana");
        array.add("Joo");
        
        linked.add("Car");
        linked.add("Bike");

        System.out.println("ArrayList :"+array);
        System.out.println("LinkedList :"+linked);

        arrayli.write("\nArrayList elements are :"+array);
        linkedli.write("\nLinkedList elements are"+linked);

        arrayli.close();
        linkedli.close();
    }
    
}
