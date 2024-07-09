import java.util.Stack;
import java.util.Scanner;

public  class RecognizeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("Enter a String");
        String s = sc.next();

        for(int i=0 ; i<s.length();i++){
            st.push(s.charAt(i));

        }
        for(int i=0;i<s.length();i++){
            if (st.pop() != s.charAt(i)) {
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println("Valid");
    }
}