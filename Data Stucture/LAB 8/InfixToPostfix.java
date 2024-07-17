import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String infix = sc.next();
        Postfix(infix);

    }
        public static void Postfix(String infix){
            infix += ')';
            Stack<Character> S = new Stack<>();
            String polish = "";
            int rank= 0 , top=1;
            S.push('(');
            char next ,temp;
            for (int i = 0; i < infix.length(); i++) {
                next = infix.charAt(i);
                    if (top<1) {
                        System.out.println("Invalid");
                        return;
                    }
                    while(G(S.peek())>F(next)){
                        temp = S.pop();
                        polish = polish + temp;
                        rank = rank + rank(temp);

                        if(rank<1){
                            System.out.println("Rank -1");
                            return;
                        }
                    }

                    if(G(S.peek()) != F(next)){
                        S.push(next);
                    }
                    else{
                        S.pop();
                    }
                }
                System.out.println(polish);

            if(top != 0 || rank != 1){
                // System.out.println("Invalid String");
            }
            else{
                System.out.println("Valid String");
            }

        }
    
        public static  int F(char a){
            if(a== '+' || a== '-'){
                return 1; 
            }
            else if(a== '*' || a== '/'){
                return 3;
            }
            else if(a== '^'){
                return 6;
            }
            else if(a== '('){
                return 9;
            }
            else if(a== ')'){
                return 0;
            }
            return 7;
        }

        public static  int G(char a){
            if(a== '+' || a== '-'){
                return 2; 
            }
            else if(a== '*' || a== '/'){
                return 4;
            }
            else if(a== '^'){
                return 5;
            }
            else if(a== '('){
                return 0;
            }
            return 8;
        }

        public static int rank(char a){
            if(a== '+' || a== '-' || a== '*' || a== '/' ){
                return -1;
            }
            return 1;
        }
    }