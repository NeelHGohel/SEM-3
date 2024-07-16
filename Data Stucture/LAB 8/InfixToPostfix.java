import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        


    }
}
class Postfix{
    public void Postfix(){
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("Enter a String");
        String infix = sc.next();
        String polish = "";
        int rank= 0 , top=1;
        st.push('(');
        char next;
        for (int i = 0; i < infix.length(); i++) {
            next = infix.charAt(i);
            while (next != '(') {
                if (top<1) {
                    System.out.println("Invalid");
                    
                }
            }
        }
    }

    public void InputPrescedence(){
        
        
    }
}