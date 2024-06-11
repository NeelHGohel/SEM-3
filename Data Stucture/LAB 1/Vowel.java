import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charecter");
        char ch = sc.nextLine().charAt(0);
        if (ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("Entered Char is vowel");

        }
        else{
            System.out.println("It is a Consonants");
        }
    }
}
