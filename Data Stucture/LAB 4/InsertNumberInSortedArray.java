import java.util.Scanner;

public class InsertNumberInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element at index:"+i+" ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter that Element of index which you want to add " );
        int temp = sc.nextInt();

        int b[] = new int[n + 1];
        int i=0;
        while (a[i]<temp) {
            b[i]=a[i];
            i++;
        }
        b[i]=temp;
        while (i<b.length-1) {
            b[i+1]=a[i];
            i++;
        }
        System.out.println("The new array after inserting that element");
        for (i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
