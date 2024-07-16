import java.util.Scanner;
import java.util.Stack;

public class StringBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println(check(s));
        sc.close();
    }
    public static int check( String s) {
        
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        for (char c : ch) { // for each loop
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.empty())
                    return 1;
                char ch1 = st.pop();
                if (ch1 == ')' && ch1 != '(' || ch1 == ']' && ch1 != '[' || ch1 == '}' && ch1 != '{') {
                    return 0;
                }
            }
        }
        return 1;
    }
}