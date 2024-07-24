import java.util.Scanner;

public class SimpleQueue {
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
                    q.Enqueue(y);
                    q.Display();
                    break;
                case 2:
                    q.Dequeue();
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
    int[] Q;

    public MethodsOfQueue(int n) {
        this.r = -1;
        this.f = -1;
        this.n = n;
        Q = new int[n];
    }

    public void Enqueue(int y) {
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

    public int Dequeue() {
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
