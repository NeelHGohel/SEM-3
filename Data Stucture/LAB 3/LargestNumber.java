
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int minindex=0,maxindex=0;

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]>arr[maxindex]){
                maxindex = i;
            }
            if(arr[i]<arr[minindex]){
                minindex = i;
            }
        }
        System.out.println("Min element is at"+(minindex+1));
        System.out.println("Max element is at"+(maxindex+1));

    }
}