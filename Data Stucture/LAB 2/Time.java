import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Seconds");
        int s = sc.nextInt();

        int h=s/3600;
        int r=s%3600;
        int m=r/60;
        int R=r%60;
        s=R;

        System.out.println(h+":"+m+":"+s);
    }
}
