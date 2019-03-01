import java.util.Scanner;
import java.math.BigInteger;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        BigInteger[][] matrix1 = new BigInteger[a][b];
        BigInteger[][] matrix2 = new BigInteger[a][b];
        BigInteger[][] matrix3 = new BigInteger[a][b];
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                String s = scan.next();
                matrix1[i][j] = new BigInteger(s);
            }
        }
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                String s = scan.next();
                matrix2[i][j] = new BigInteger(s);
            }
        }
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                matrix3[i][j] = BigInteger.valueOf(0);
            }
        }
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                for (int k = 0; k < a; ++k) {
                    matrix3[i][j] = matrix3[i][j]
                            .add(matrix1[i][k].multiply(matrix2[k][j]));
                }
            }
        }
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                System.out.printf("%s ", matrix3[i][j].toString());
            }
            System.out.println(" ");
        }
    }
}

