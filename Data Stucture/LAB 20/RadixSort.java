
import java.util.*;

class RadixSort {

    static int getMax(int a[], int n) {
        int m = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        return m;
    }

    static void countSort(int a[], int n, int place) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(a[i] / place) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(a[i] / place) % 10] - 1] = a[i];
            count[(a[i] / place) % 10]--;
        }

        for (i = 0; i < n; i++)
        a[i] = output[i];
    }

    static void radixsort(int a[], int n) {

        int m = getMax(a, n);

        for (int place = 1; m / place > 0; place *= 10)
            countSort(a, n, place);
    }

    static void print(int a[], int n) {
        System.out.println("Sorted");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element  ");
            a[i] = sc.nextInt();
        }

        radixsort(a, n);
        print(a, n);
    }
}





// import java.util.Scanner;

// public class RadixSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Size Of Array");
//         int n = sc.nextInt();
//         int[] a = new int[n];

//         for (int i = 0; i < a.length; i++) {
//             System.out.print("Insert Element  ");
//             a[i] = sc.nextInt();
//         }  
//     }
//     void radixSort(int a[] , int n){
//         int m = Math.max(a, n);

//         for(int place = 1 ; m/place > 0 ; place *= 10){
//             countSort(a, n, place);
//         }
//     }
//     public static void countSort(int a[] , int n , int place){
//             int output[] = new int[n];
//             int i ;
//             int count[] = new int[10];

//             for( i = 0 ; i < 10 ; i++){
//                 count[i] = 0;
//             }

//             for(i = 0 ; i < n ; i++){
//                 count[(a[i]/place) % 10]++;
//             }

//             for(i = 1 ; i < 10 ; i++){
//                 count[i] += count[i-1];
//             }

//             for(i = n - 1 ; i >= 0 ; i--){
//                 output[count[(a[i]/place)%10]-1] = a[i];
//                 count[(a[i]/ place)%10]--;
//             }

//             for(i = 0 ; i < n; i++){
//                 a[i] = output[i];
//             }
//     }
// }