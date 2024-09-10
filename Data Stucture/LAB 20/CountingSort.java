import java.util.*;;

public class CountingSort {

    static int[] countSort(int a[], int n) {
        int m = a[0];
        for (int i = 1; i < n; i++){
            if (a[i] > m)
                m = a[i];
        } 
        int []c = new int[m + 1];
        int []b = new int[a.length];
        
        for(int j = 0 ; j < n ; j++)
            c[a[j]]++;

        for(int i = 1 ; i <= m ; i++)
            c[i] = c[i] + c[i-1];

        for(int j = n-1 ; j >= 0 ; j--){
            b[c[a[j]]-1] = a[j];
            c[a[j]]--;
        }

             return b;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Insert Element  ");
            a[i] = sc.nextInt();
        }

        int[] ans = countSort(a, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]  + " ");
        }
    }
}