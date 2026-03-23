class MathUtils{

     public int Square(int a){
         return a*a;
}
    public long power(int b, int e) {
    long result = 1;

    for (int i = 1; i <= e; i++) {
        result = result * b;
    }

    return result;
} 
}

public class PublicDemo{
    
     public static void main(String[] args){
         MathUtils obj = new MathUtils();

         System.out.println("Square is : "+obj.Square(5));
         System.out.println("Power is : "+obj.power(2,4));
}
}