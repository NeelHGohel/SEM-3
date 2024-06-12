import java.util.Scanner;

public class ScanArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter no.");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Entered element is "+a[i]);
        }
    }
}