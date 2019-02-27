import java.math.BigDecimal;

import java.util.Scanner;

public class OtoD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        BigDecimal a = new BigDecimal(str);
        //System.out.println(a.toString());
        BigDecimal n = BigDecimal.valueOf(2);
        int i;
        char[] s = str.toCharArray();
        for (i = 0; i < s.length; ++i) {
            if (s[i] == '.') {
                break;
            }
        }
        n = n.pow(i);
        BigDecimal result = BigDecimal.ZERO;
        for (i = 0; i < s.length; ++i) {
            if (s[i] != '.') {
                BigDecimal num = BigDecimal.valueOf(s[i] - '0');
                n = n.divide(BigDecimal.valueOf(2));
                result = result.add(num.multiply(n));
            }
        }
        System.out.println(result.toString());
    }
}
