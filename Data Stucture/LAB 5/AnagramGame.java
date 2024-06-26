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

        if (temp.length() != temp1.length()) {
            System.out.println("Not anagram");
            return;

        } else {
            char a[] = temp.toCharArray();
            char b[] = temp1.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            // System.out.println(a);
            int c = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    c++;
                }
            }
            if (c == 0) {
                System.out.println("anagram is " + a);
            } else {
                System.out.println("Not anagram");
            }
        }
    }
}
