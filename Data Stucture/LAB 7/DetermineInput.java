import java.util.Scanner;
import java.util.Stack;

public class DetermineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> stack1 = new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'){ 
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)=='b'){ 
                stack1.push(str.charAt(i));
            }
            else { 
                System.out.println("Invalid String");
                return;
            }
        }
        if(stack.size() == stack1.size()) 
        {
            System.out.println("Both Number of a and b is equal");
        }
        else
        {
            System.out.println("Both Number of a and b is not equal");
        }
    }
}