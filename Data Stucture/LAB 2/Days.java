import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Days");
        int d = sc.nextInt();
        int y=d/365;
        int Y=d%365;
        int w=Y/7;
        int W=Y%7;
        d=W;
//yWd
        System.out.println(y+" Year "+w+" Weeks "+d+" Days");
    }
}
