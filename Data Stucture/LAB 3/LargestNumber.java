import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter no.");
            a[i]=sc.nextInt();
        }
        int min = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
               static int minIndex = i;
            }
        }
        System.out.println(min);
        System.out.println(minIndex);
    }
}
