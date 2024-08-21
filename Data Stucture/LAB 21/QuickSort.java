import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element  ");
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, n - 1);

        System.out.println("Sorting complete");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

    public static void quickSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int keyIndex = partition(a, lb, ub);
            quickSort(a, lb, keyIndex - 1);
            quickSort(a, keyIndex + 1, ub);
        }
    }

    public static int partition(int[] a, int lb, int ub) {
        int key = a[lb];
        int i = lb;
        int j = ub;

        while (i < j) {
            while (i <= ub && a[i] <= key) {
                i++;
            }

            while (a[j] > key) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[lb];
        a[lb] = a[j];
        a[j] = temp;
        return j;
    }
}
