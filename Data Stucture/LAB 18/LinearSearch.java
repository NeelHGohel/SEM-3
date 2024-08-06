import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Insert Element");
            a[i] = sc.nextInt();
        }

        System.out.println("----------------------------");
        System.out.println("Enter Element want to search");
        int key = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println("Element found at index = " + i);
                return;
            }
        }
        System.out.println("Element not found");

    }
}