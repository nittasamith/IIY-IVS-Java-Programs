
class AB{
    int a=10;
    int b=20;
    int ab=30;
       
   void display_a_b(){
       System.out.println("The values of first two attributes are a:"+a+" b:"+b);

   }

   void display_ab(){
       System.out.println("The values of third attribute is ab:"+ab);

   }

}

class BC extends AB{
    int bc=40;
    int c=50;
    
     void display_bc(){
       System.out.println("The values of first two attributes are bc:"+bc+" c:"+c);

   }
}
public class inheritance{
public static void main(String[] args){
AB obj1 = new AB();
BC obj2 = new BC();
obj1.display_a_b();
obj1.display_ab();
obj2.display_bc();

obj2.display_a_b();
obj2.display_ab();
}}