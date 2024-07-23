
import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Infix Expression : ");
        String infix = sc.nextLine();
        Prefix(infix);
        sc.close();
    }

    public static void Prefix(String str) {
        StringBuilder input1 = new StringBuilder();
        int n = str.length();
        String infix = "";
        for (int i = n - 1; i >= 0; i--) {
            char a = str.charAt(i);
            if (a == '(') {
                infix = infix + ')';
            } else if (a == ')') {
                infix = infix + '(';
            } else {
                infix = infix + a;
            }
        }

        infix += ')';
        Stack<Character> s = new Stack<>();
        s.push('(');
        char c, temp;
        String polish = "";
        int r = 0;
        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);
            while (G(s.peek()) > F(c)) {
                temp = s.pop();
                polish = polish + temp;
                r = r + rank(temp);
                if (r < 1) {
                    break;
                }
            }
            if (G(s.peek()) != F(c)) {
                s.push(c);
            } else {
                s.pop();
            }
        }
        System.out.println(polish);
        System.out.println(r);
        if (!s.isEmpty() || r != 1) {
            System.out.println("Invalid");
        } else {
            input1.append(polish);
            input1.reverse();
            System.out.println(input1);
        }
    }

    public static int G(char a) {
        if (a == '+' || a == '-') {
            return 2;
        } else if (a == '*' || a == '-') {
            return 4;
        } else if (a == '^') {
            return 5;
        } else if (a == '(') {
            return 0;
        } else {
            return 8;
        }
    }

    public static int F(char a) {
        if (a == '+' || a == '-') {
            return 1;
        } else if (a == '*' || a == '-') {
            return 3;
        } else if (a == '^') {
            return 6;
        } else if (a == '(') {
            return 9;
        } else if (a == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    public static int rank(char a) {
        if (a == '+' || a == '-' || a == '*' || a == '/' || a == '^') {
            return -1;
        }
        return 1;
    }
}