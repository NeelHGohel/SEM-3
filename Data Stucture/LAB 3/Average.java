import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        float ans = 0;
        for(int i=1;i<=a;i++){
            ans += i;
        }
        ans = ans/a;
        System.out.println(ans);
    }
}
