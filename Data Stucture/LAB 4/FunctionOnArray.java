import java.util.Scanner;

public class FunctionOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        double avg = sum/n;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        sc.close();
    }
}