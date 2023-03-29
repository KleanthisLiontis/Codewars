import java.lang.*;
public class BitCounting {

    public static int countBits(int n){

        String binaryS = Integer.toBinaryString(n);
        long ones = binaryS.chars().filter(ch -> ch == '1').count();

        return (int) ones;

    }
}