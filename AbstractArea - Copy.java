abstract class shape{
    abstract void area();
}

class rectangle extends shape{
    int l;
    int b;
    rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    void area(){
        System.out.println("Area of rectangle is :"+l*b);
    }
}

class circle extends shape{
    int r;
    circle(int r){
        this.r = r;
    }
    void area(){
        System.out.println("Area of circle is :"+(3.14*r*r));
    }
}



public class AbstractArea{
    public static void main(String[] args){
    shape s;
    s = new rectangle(5,10);
    s.area();
    s = new circle(2);
    s.area();
}
}
