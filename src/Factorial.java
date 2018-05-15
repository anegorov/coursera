import java.math.BigInteger;

public class Factorial {
    public static void fct() {
        int n = 4;
        BigInteger val2;
        BigInteger f = new BigInteger("1");

        System.out.println(f);
        System.out.println("---");

        for (int i = 1; i <= n; i++){
            val2 = BigInteger.valueOf(i);
            f = f.multiply(val2);
            System.out.println(f);
        }
    }
}
