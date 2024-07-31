import java.util.Scanner;

public class DoubleEndedQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of queue : ");
        int n1 = sc.nextInt();
        MethodsOfQueue q = new MethodsOfQueue(n1);
        boolean flag = true;
        while (flag) {
            System.out.println("\n"+"Enter" + "\n"
                    + "1 for Insert_Rear" + "\n"
                    + "2 for Delete_Front" + "\n"
                    + "3 for Insert_Front" + "\n"
                    + "4 for Delete_Rear" + "\n"
                    + "5 for Display" + "\n"
                    + "6 for Stop");

            int temp = sc.nextInt();

            switch (temp) {
                case 1:
                    System.out.println("Enter an element : ");
                    int y = sc.nextInt();
                    q.Insert_Rear(y);
                    q.Display();
                    break;
                case 2:
                    q.Delete_Front();
                    q.Display();
                    break;
                case 3:
                    System.out.println("Enter an element : ");
                    int z = sc.nextInt();
                    q.Insert_Front(z);
                    q.Display();
                    break;
                case 4:
                    q.Delete_Rear();
                    q.Display();
                    break;
                case 5:
                    q.Display();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choise");
            }
        }
    }
}
class MethodsOfQueue {

    int r, f, n;
    int[] Q;

    public MethodsOfQueue(int n) {
        this.r = -1;
        this.f = -1;
        this.n = n;
        Q = new int[n];
    }
    public void Insert_Rear(int y){
        if (r >= n - 1) {
            System.out.println("Queue OverFlow");
            return;
        }
        r++;
        Q[r] = y;

        if (f == -1) {
            f = 0;
            return;
        }
    }
    public int Delete_Front(){
        if (f == -1) {
            System.out.println("Queue UnderFlow");
            return -1;
        }
        int y = Q[f];

        if (f == r) {
            f = r = -1;
        } else {
            f++;
        }
        return y;
    }
    public void Insert_Front(int z){
        if(f==-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(f==-1){
            f = r = 0;
        }
        else{
            f--;
        }
        Q[f] = z;
        return;
    }
    public int Delete_Rear(){
        if(r==-1){
            System.out.println("Queue Underflow");
            return -1;
        }
        int y = Q[r];
        if(r==f){
            r = f = -1;
        }
        else{
            r--;
        }
        return y;
    }
    public void Display() {

        if (f == -1 || r == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = f; i <= r; i++) {
            System.out.print(Q[i] + "**");
        }
        System.out.println();
    }
}
