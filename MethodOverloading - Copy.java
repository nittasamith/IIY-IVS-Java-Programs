import java.text.DecimalFormat;


public class MethodOverloading{

    static DecimalFormat d = new DecimalFormat("0.00");

    static void Area(int a){
        System.out.println("Area of Circle : "+3.14*a*a);}

    static void Area(int a,int b){
       System.out.println("Area of Rectangle :"+ a*b);}
   
    static void Area(float a, float b){
       System.out.println("Area of Triangle :" +d.format( 0.5*a*b));}

public static void main(String[] args){
   Area(2);
   Area(2,4);
   Area(3.2f,2.4f);
}
}