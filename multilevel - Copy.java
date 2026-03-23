class AB{
    int a=2;
    void display_a(){
    System.out.println("The value of class AB attribute a is :"+a);
}
}
class BC extends AB{
    int b=3;
    void display_b(){
    System.out.println("The value of class BC attribute b is :"+b);
}
}
class CD extends BC{
    int c=20;
    void display_c(){
    System.out.println("The value of class CD attribute c is :"+c);
}
}
public class multilevel{
    public static void main(String[] args){
     AB ob1 = new AB();
     BC ob2 = new BC();
     CD ob3 = new CD();
     
    ob1.display_a();
    ob2.display_b();
    ob3.display_c();
    ob3.display_b();
    ob3.display_a();
    ob2.display_a();
}}


   