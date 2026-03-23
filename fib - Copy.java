import java.util.Scanner;

public class fib{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number Range :");
int n = sc.nextInt();
int a=0,b=1;
int sum_=0;
while(a<=n){
if(a%2==0){
System.out.println(a + " ");
sum_+= a;
}
int c = a+b;
a=b;
b=c;
}
System.out.println("Sum of all even fib series is "+sum_);
}

}