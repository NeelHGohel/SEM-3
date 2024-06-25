
import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][2];
        int[][] b = new int[2][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print("Enter number in first array:  ");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter number in second array:  ");
                b[i][j] = sc.nextInt();
            }
        }

        int[][] c = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<2; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}