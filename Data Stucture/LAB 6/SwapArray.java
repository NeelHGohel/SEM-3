import java.util.Scanner;

public class SwapArray {

    public static void main(String[] args) {
        Swap s1 = new Swap();
        s1.swapArray();
    }
}
class Swap{
    void swapArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int n1 = sc.nextInt();
        System.out.println("Enter size of 2nd array");
        int n2 = sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];

        

        for(int i=0;i<a.length;i++){
            System.out.print("Enter element "+i+" ");
            a[i]=sc.nextInt();
        }
        System.out.println("============================");

        for(int i=0;i<b.length;i++){
            System.out.print("Enter element "+i+" ");
            b[i]=sc.nextInt();

        }
        int []temp = new int[n1];
        for(int i=0;i<a.length;i++){
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp [i]; 
        }
        System.out.println("New Array After swaping");
        System.out.println("1st arry");
        for(int i=0;i<a.length;i++){
            
            System.out.print(a[i]+" ");
            
        }
        System.out.println();
        // System.out.println("============================");
        System.out.println("2nd arry");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
            

        }
    }
}