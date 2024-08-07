import java.util.Scanner;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        BinarySearchWithRecursion b1 = new BinarySearchWithRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Element want to search");
        int key = sc.nextInt();
        int result = b1.BinarySearch(a, 0, n-1, key);
        System.out.println("Elemnt found at index = "+result);
        
    }
    public int BinarySearch(int a[], int left , int right , int key){
        while(left<=right){
            int middle = (left+right) / 2;

            if(a[middle] == key){
                return middle;
            }

            else if (key<a[middle]){
                return BinarySearch(a, left, middle-1, key);
            }
            else{
                return BinarySearch(a, middle+1, right, key);
            }
        }
        return -1;
    }
}
