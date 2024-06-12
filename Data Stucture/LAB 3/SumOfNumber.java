import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int ans = 0;
        for(int i=a;i<=b;i++){
            ans += i;
        }
        System.out.println("Answer is "+ans);
    }
}
