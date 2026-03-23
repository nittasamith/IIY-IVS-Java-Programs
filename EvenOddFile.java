import java.io.FileWriter;
import java.io.IOException;

public class EvenOddFile{
    public static void main(String[] args) throws IOException{

        FileWriter even = new FileWriter("Even.txt");
        FileWriter odd = new FileWriter("Odd.txt");

        for(int i =0;i<=20;i++){
            if(i%2==0){
                even.write(i+"\n");
            }
            else{
                odd.write(i+"\n");
            }
        }
        even.close();
        odd.close();
        System.out.println("Numbers Written in Files");
    }
}