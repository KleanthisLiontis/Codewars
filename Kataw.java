import java.math.BigInteger;

public class Kataw {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if (n1.toString().equals("0") && n2.toString().equals("0")) {
            return 1;
        } else {
            BigInteger returnMe = n1.pow(Integer.parseInt(n2.toString()));
            byte[] bit = returnMe.toByteArray();
            return bit[bit.length - 1];
        }
    }
}