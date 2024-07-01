
import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = sc.nextInt();
        int num;
        for(int i=0; i<n; i++){
            num=1;
            for(int j=0; j<(n-i); j++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num= num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}