
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String[] key = new String[5];
        int[] value = new int[5];

        for (int i = 0; i < 5; i++) {
            key[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            map.put(key[i], value[i]);
        }
    }

}