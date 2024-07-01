
import java.util.*;

public class ReplaceTwoElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter 2 number to replace : ");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int aPos=0,bPos=0;

        for(int i=0; i<n; i++){
            if(arr[i]==a){
                aPos=i;
            }
            if(arr[i]==b){
                bPos = i;
            }
        }
        int temp = arr[bPos];
        arr[bPos] = arr[aPos];
        arr[aPos] = temp;

        System.out.println("new array is: ");
        for(int i=0 ; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("postion of 1st element is "+ (bPos+1));
        System.out.println("postion of 2nd element is "+ (aPos+1));
    }
}