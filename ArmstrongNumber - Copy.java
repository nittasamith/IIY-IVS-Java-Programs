import java.util.Scanner;

public class ArmstrongNumber{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number to check :");
     int n = sc.nextInt();
     int temp = n;
     int sum_=0;
     int digits = String.valueOf(n).length();
     while(temp!=0){
       int lastDig = temp%10;
       sum_ += Math.pow(lastDig,digits);
       temp /= 10;
    }
    if(sum_==n){
    System.out.println("The given number is a Armstrong Number");
}
    else{
    System.out.println("The given number is not a Armstrong number");
}


}

}