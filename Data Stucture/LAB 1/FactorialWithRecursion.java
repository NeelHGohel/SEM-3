import java.util.Scanner;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial of "+n+" is "+ans);
    }
       public static int fact(int n)
        {
            if(n==1){
                return 1;
            }
            else{
                return n * fact(n-1);
            }
    }
}
