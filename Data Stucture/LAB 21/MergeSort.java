import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element  ");
            a[i] = sc.nextInt();
        }
        Mergesort(a, 0, n - 1);

        System.out.println("Sorting complete");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

    public static void Mergesort(int a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            Mergesort(a, low, mid);
            Mergesort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++){
            left[i] = a[low + i];
        }
        for (int j = 0; j < n2; j++){
            right[j] = a[mid + 1 + j];
        }
            
        
        // Merge the temporary arrays back into a[]
        int i = 0, j = 0;
        int k = low;
        
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of left[], if any
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of right[], if any
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
