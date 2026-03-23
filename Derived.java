
import pack1.Base;

public class Derived extends Base{
    public static void main(String[] args){
        Derived obj = new Derived();
        System.out.println("protected value is :"+obj.x);
}
}