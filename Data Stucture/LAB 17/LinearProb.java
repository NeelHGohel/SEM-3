import java.util.*;

public class LinearProb {

    static int[] hash = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        System.out.println(Arrays.toString(arr));
        Store(arr);
        System.out.println(Arrays.toString(hash));

    }
        
    public static  void Store(int arr[]) {
       int index;
        for (int i = 0; i < arr.length; i++) {
            index = hash(arr[i]);
            hash[index] = arr[i];
        }
    }

    public static int hash(int n) {
        int index = (n % 18) + 2;
        if (hash[index] != 0) {
            while (hash[index] != 0) {
                index = (index + 1) % 20;
            }
        }
        return index;
    }

}
