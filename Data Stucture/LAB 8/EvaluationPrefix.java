import java.util.Scanner;
import java.util.Stack;

public class EvaluationPrefix {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prefix Expression:");
        String prefix = sc.next();
        
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char temp = prefix.charAt(i);
            
            if (Character.isDigit(temp)) {
                st.push(Integer.parseInt(String.valueOf(temp)));
            } else {
                int operand1 = st.pop();
                int operand2 = st.pop();
                int result = 0;
                
                switch (temp) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    case '^':
                        result = (int) Math.pow(operand1, operand2);
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        return;
                }
                st.push(result);
            }
        }
        
        int ans = st.pop();
        System.out.println("Answer is : " + ans);
    }
}
