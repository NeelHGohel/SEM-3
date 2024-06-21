import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array a ");
        int n1 = sc.nextInt();
        System.out.print("Enter size of array b ");
        int n2 = sc.nextInt();
        int []a = new int[n1];
        int []b = new int[n2];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element at index:"+i+" ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter element at index:"+i+" ");
            b[i] = sc.nextInt();
        }

        int []c = new int[n1+n2];
        for(int i=0;i<n1;i++){
            c[i]=a[i];
        }
        for(int i=n1;i<(n1+n2);i++){
            c[i]=b[i-n1];
        }
        System.out.println("The new array after merge element");
        for (int i = 0; i < (n1+n2); i++) {
            System.out.println(c[i]);
        }
        sc.close();
    }
}
