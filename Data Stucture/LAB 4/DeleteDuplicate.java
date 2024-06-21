import java.lang.reflect.Array;
import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element at index:"+i+" ");
            a[i] = sc.nextInt();
        }
        // int temp;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i + 1; j < a.length; j++) {
        //         if (a[i] > a[j]) {
        //             temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        // }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        int size = a.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    for(int k=j;k<size-1;k++){
                        a[k] = a[k+1];
                    }
                    size--;
                    j--;
                }
                
            }
        }
        System.out.println("The new array after deleting duplicate element");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
