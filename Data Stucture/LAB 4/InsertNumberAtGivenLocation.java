import java.util.Scanner;

public class InsertNumberAtGivenLocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element at index:"+i+" ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Position or Index of the element where you want to add new element ");
        int x = sc.nextInt();

        System.out.print("Enter that Element of index" +x+ "which you want to add " );
        int temp = sc.nextInt();
        

        
        int b[] = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            if (i == x) {

                b[i] = temp;
            } 
            else{
                b[i]=a[i];
            }
        }
        System.out.println("The new array after inserting that element");
        for (int i =0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}