import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        

        System.out.println("Enter Temperature in Fahrenhit");
        float F = sc.nextFloat();

        System.out.println("Enter Temperature in Celcius");
        float C = sc.nextFloat();


        float FC;
        float CF;

        FC = (F-32)*5/9;
        CF = C*9/5+32;

        System.out.println("Given fahenhit " +F +" in Celcius = "+FC);
        System.out.println("Given Celcius " +C +" in fahenhit = "+CF);
    }
}
