import java.util.Scanner;

public class DeleteNumberAtGivenLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element at index:"+i+" ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Position or Index of the element where you want to delete the element ");
        int x = sc.nextInt();

        int b[]=new int[n-1];

        for(int i=0;i<a.length;i++){
            if(i<x){
                b[i]=a[i];
            }
            else if(i==x){
                b[i]=a[i+1];
            }
        }
        System.out.println("The new array after deleting that element");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
