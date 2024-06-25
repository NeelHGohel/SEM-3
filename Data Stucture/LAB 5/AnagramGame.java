import java.util.*;
import java.lang.*;;

public class AnagramGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string");
            str[i] = sc.next();
        }
        int ram = (int) (Math.random() * n);

        System.out.println("Enter a word");
        String temp = sc.next();

        String temp1 = str[ram];
        char a[] = temp.toCharArray();
        char b[] = temp1.toCharArray();
        if (temp.length() == temp1.length()) {

            Arrays.sort(a);
            Arrays.sort(b);
            // System.out.println(a);

            if (a.equals(b)) {
                System.out.println("Yes");
            }
        } else {

            System.out.println("Not");

        }
    }
}
