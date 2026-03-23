import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter studentlist = new FileWriter("StudentList.txt");
        Scanner sc = new Scanner(System.in);

        String name;
        int id;
        int marks;

        for (int i = 1; i <=4 ; i++) {

            System.out.println("Enter details for Student " + i);

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("ID: ");
            id = sc.nextInt();

            System.out.print("Marks: ");
            marks = sc.nextInt();
            sc.nextLine(); 

            studentlist.write("Student " + i + "\n");
            studentlist.write("Name: " + name + "\n");
            studentlist.write("ID: " + id + "\n");
            studentlist.write("Marks: " + marks + "\n");
            studentlist.write("-------------------------\n");
        }

        studentlist.close();
        sc.close();

        System.out.println("Data Written in File Successfully!");
    }
}