import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element  ");
            a[i] = sc.nextInt();
        }
        int k=0; 
        while(k<n){
            int key = a[k];
            int j = k-1;

            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
            k++;
        }    
    
        System.out.println("Complete");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
