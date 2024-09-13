import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element: ");
            a[i] = sc.nextInt();
        }
        heapSort(a, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void heapify(int[] a, int n, int i) {
        int maxIndex = i;
        int leftchild = 2 * i + 1;
        int rightchild = 2 * i + 2;

        if (leftchild < n && a[leftchild] > a[maxIndex]) {
            maxIndex = leftchild;
        }

        if (rightchild < n && a[rightchild] > a[maxIndex]) {
            maxIndex = rightchild;
        }

        if (i != maxIndex) {
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;

            heapify(a, n, maxIndex);
        }
    }

    public static void heapSort(int[] a, int n) {
        buildMaxHeap(a, n);

        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
    }

    public static void buildMaxHeap(int[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
    }
}
