class Person{
    
    String name;
    private int age;
    
    public void Setter(String n,int a){
       name = n;
       age = a;
      }

    public void Getter(){
      System.out.println("Person name is : "+name);
      System.out.println("Person age is :"+age);  
      }
}

public class PrivateDemo{
    public static void main(String[] args){
        Person p = new Person();
        p.Setter("Manohar",19);
     
        p.Getter();
       
        System.out.println("Person name directly access : "+p.name);
        System.out.println("Person age directly access p.age - error because age has private access in Person");
}
}