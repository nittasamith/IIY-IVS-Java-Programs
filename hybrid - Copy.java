class AB{
    int a=2;
    void display_a(){
    System.out.println("The value of class AB attribute a is :"+a);
}
}
class BC{
    int b=10;
    void display_b(){
    System.out.println("The value of class BC attribute b is :"+b);
}
}
class CD extends AB,BC{
    int c=30;
    void display_c(){
    System.out.println("The value of class CD attribute c is :"+c);
}
}
public class hybrid{
    public static void main(String[] args){
      AB obj1 = new AB();
      BC obj2 = new BC();
      CD obj3 = new CD();
      obj3.display_a();
      obj3.display_a();
      obj3.display_a();
      obj1.display_a();
      obj2.display_b();
}}