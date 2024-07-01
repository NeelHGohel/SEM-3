
import java.util.*;

public class NamesInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n =sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){

                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}