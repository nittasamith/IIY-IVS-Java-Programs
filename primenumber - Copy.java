import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range of Prime Numbers :");
        int n = sc.nextInt();
        System.out.println("Prime Number from 1 to "+ n +" are :");
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.print(i+" ");
            }
        } 
    }
}