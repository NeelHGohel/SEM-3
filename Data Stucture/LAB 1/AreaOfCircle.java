import java.util.*;
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,ans;
        System.out.println("Enter the radius of the circle");
        r=sc.nextDouble();
        ans=Math.PI*r*r;
        System.out.println("area of the circle is "+ans);
    }
}