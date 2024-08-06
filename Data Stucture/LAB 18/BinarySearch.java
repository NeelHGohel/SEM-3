import java.util.Scanner;

public class BinarySearch {
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

        int left = 0 , right = n-1;
        int middle=0;
        while(left<=right){
            middle = (int)Math.floor((left+right)/2);

            if(a[middle] == key){
                System.out.println("Elemnt found at index = "+middle);
                return;
            }
            else if(key<a[middle]){
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }
        System.out.println("Element not found");
    }
}
