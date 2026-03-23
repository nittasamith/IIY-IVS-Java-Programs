interface A{

   default void display(){
      System.out.println("Interface Display A");
}
}

interface B{
   default void display(){
       System.out.println("Interface Display B");

}
}

class C implements A,B{

    @Override
    public void display(){
        A.super.display();
        B.super.display();
        System.out.println("Class C Display");     
}
}

public class MultipleInheritance{
    public static void main(String[] args){
        C obj = new C();
        obj.display();
}
}