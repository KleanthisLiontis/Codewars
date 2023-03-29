import java.lang.Math;
public class MathSqrt {
    public static long findNextSquare(long sq) {
        long nxt =0;
        double sqrt = Math.sqrt(sq);
        if(sqrt == Math.floor(sqrt)) {
            for (long i = 2; i < sq; i++) {
                nxt = 2 ^ i;
                if (nxt > sq) {
                   break;
                }
            }
        }else {
            return -1;
        }
        return nxt;
    }
}