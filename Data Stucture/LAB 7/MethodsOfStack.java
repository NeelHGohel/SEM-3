import java.util.Scanner;

public class MethodsOfStack {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n;
        Stack s1 = new Stack(n);
        
        System.out.println("Enter");
        System.out.println("1 for PUSH Element");
        System.out.println("2 for POP Element");
        System.out.println("3 for PEEP Element");
        System.out.println("4 for CHANGE Element");
        System.out.println("5 for DISPLAY Element");
        int temp  = sc1.nextInt();
        boolean flag = true;
        while (flag) {
            switch (temp) {
                case 1:
                    s1.push();
                    s1.Display();
                    break;
            
                case 2:
                    s1.pop();
                    s1.Display();
                    break;
                case 3:
                    s1.Peep();
                    s1.Display();
                    break;
                case 4:
                    s1.change();
                    s1.Display();
                    break;
                case 5:
                    s1.Display();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
        
    }
}
class Stack{

    int top=-1;
    int n;
    int S[];
    Scanner sc =  new Scanner(System.in);

   public Stack(int n){
        this.n =n;
        S = new int[n];
    }
    public void push(){
        System.out.println("Enter element you want to insert: ");
        int a = sc.nextInt();
        if(top>=n-1){
            System.out.println("Stack is OverFlow");
        }
        else{
            top++;
            S[top] = a;
        }
    }


    public int pop(){
        if (top==0) {
            System.out.println("Stack Is UnderFlow");
            return(0);
        }
        else{
            top--;
            return(S[top+1]);
        }
    }


    public int Peep(){
        System.out.println("Enter the Index: ");
        int i = sc.nextInt();

        if(top-i+1<=0){
            System.out.println("Stack UnderFlow");
            return(0);
        }
        else{
             return(S[top-i+1]);
        }
    }

    public int change(){
        System.out.println("Enter element: ");
        int x = sc.nextInt();
        System.out.println("Enter the Index: ");
        int i = sc.nextInt();

        if(top-i+1<=0){
            System.out.println("Stack UnderFlow");
            return(0);
        }
        else{
            (S[top-i+1]) = x;
            return(1);
        }

    }

    public void Display(){
        System.out.print("Your Stack is = ");
        for(int j = 0;j<n;j++){
            System.out.print(S[j]);
        }
    }
}