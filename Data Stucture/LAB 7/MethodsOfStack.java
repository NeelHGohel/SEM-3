import java.util.Scanner;

public class MethodsOfStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size: ");
        int n = sc.nextInt();

        Stack s = new Stack(n);

        int x = 1;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter" + "\n" +
                    "1 for push" + "\n" +
                    "2 for pop" + "\n" +
                    "3 for peep" + "\n" +
                    "4 for change" + "\n" +
                    "5 for display" + "\n" +
                    "6 for break");

            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Enter a element : ");
                    int element = sc.nextInt();
                    s.push(element);
                    s.Display();
                    break;

                case 2:
                    int d = s.pop();
                    s.Display();
                    break;

                case 3:
                    System.out.println("Enter index :");
                    int i = sc.nextInt();
                    int y = s.peep(i);
                    s.Display();
                    System.out.println("Element is = " + y);
                    break;

                case 4:
                    System.out.println("Enter index : ");
                    int j = sc.nextInt();
                    System.out.println("Enter element : ");
                    int m = sc.nextInt();
                    s.change(j, m);
                    s.Display();
                    break;

                case 5:
                    s.Display();
                    break;

                case 6:
                    flag = false;
                    break;
            }
        }
        sc.close();
    }
}

class Stack {

    int[] S;
    int top;

    public Stack(int n) {
        S = new int[n];
        top = -1;
    }

    public void push(int element) {

        if (top >= S.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;

        S[top] = element;
        System.out.println("Element pushed");
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Overflow");
            return -1;
        }

        top--;

        return S[top + 1];
    }

    public int peep(int i) {

        if (top - i + 1 < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return S[top - i + 1];
    }

    public void change(int i, int element) {

        if (top - i + 1 < 0) {
            System.out.println("Stack Underflow");
            return;
        }

        S[top - i + 1] = element;
        System.out.println("Element changed");
    }

    public void Display() {
        System.out.println();
        for (int i = top; i >= 0; i--) {
            System.out.print(S[i] + " ");
        }
        System.out.println();
    }
}