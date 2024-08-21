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
        QuickSort(a,0,n-1);

        System.out.println("Sorting complete");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
    public static  void QuickSort(int a[],int lb,int ub){
        boolean flag = true;
        int i = 0 , j = 0 , key = 0;
        if(lb<ub){
            i = lb;
            j = ub+1;
            key = a[lb];
        }
        while(flag){
            i++;
            while(a[i] < key){
                i++;
            }
            j--;

            while(a[j] > key){
                j--;
            }

            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            else{
                flag = false;
            }
        }

    }
}
