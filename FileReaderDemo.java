import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args){
    try{
        FileReader fr = new FileReader("StudentList.txt");

        System.out.println("Reading char by char");
        int i;

        while((i=fr.read()) !=-1){
            System.out.print((char)i);
        }
        fr.close();

        fr = new FileReader("StudentList.txt");

        System.out.println("Reading using array :\n");
        char[] charArray = new char[200];

        fr.read(charArray);
        System.out.print(charArray);

        fr.close();
        System.out.println("FileReader closed !");
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
