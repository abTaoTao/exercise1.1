import java.util.Scanner;
import java.math.BigInteger;

public class Fibicount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger[] fib = new BigInteger[999];
        fib[0] = fib[1] = BigInteger.valueOf(1);
        for (int i = 2; i < 999; ++i) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        int count = 0;
        for (int i = 0; i < 999; ++i) {
            if (fib[i].compareTo(a) >= 0 && fib[i].compareTo(b) <= 0) {
                ++count;
            } else {
                break;
            }
        }
        System.out.println(count);
        System.out.println("hello");
    }
}
