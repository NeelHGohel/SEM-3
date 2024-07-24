import java.util.Scanner;

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of queue : ");
        int n1 = sc.nextInt();
        MethodsOfQueue q = new MethodsOfQueue(n1);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter" + "\n"
                    + "1 for Enqueue" + "\n"
                    + "2 for dequeue" + "\n"
                    + "3 for diplay" + "\n"
                    + "4 for stop");

            int temp = sc.nextInt();

            switch (temp) {
                case 1:
                    System.out.println("Enter an element : ");
                    int y = sc.nextInt();
                    q.EnqueueInCircular(y);
                    q.Display();
                    break;
                case 2:
                    q.DeleteInCircular();
                    q.Display();
                    break;
                case 3:
                    q.Display();
                    break;
                case 4:
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
    int[] CQ;

    public MethodsOfQueue(int n) {
        this.r = -1;
        this.f = -1;
        this.n = n;
        CQ = new int[n];
    }

    public void EnqueueInCircular(int y) {
        if (r == n) {
            r = 1;
        } else {
            r++;
        }
        if (f == r) {
            System.out.println("Circular Queue OverFlow");
            return;
        }
        CQ[r] = y;

        if (f == -1) {
            f = 1;
            return;
        }
    }

    public int DeleteInCircular() {
        if (f == -1) {
            System.out.println("Circular Queue Underflow");
            return -1;
        }
        int y = CQ[f];

        if (f == r) {
            f = r = 0;
            return y;
        }
        if (f == n - 1) {
            f = 1;
        } else {
            f++;
        }
        return y;
    }

    public void Display() {

    }
}
