import java.io.*;
import java.util.*;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        char[] r1 = str1.toCharArray();
        Arrays.sort(r1);
        str1 = Arrays.toString(r1);
        char[] r2 = str2.toCharArray();
        Arrays.sort(r2);

//            HashSet<Character> s1 = new HashSet<>();
//            HashSet<Character> s2 = new HashSet<>();
        int i = 0;
        int j = 0;

        while (i < r1.length && j < r2.length) {
            if (r1[i] == r2[j]) {
                j += 1;
            }
            i += 1;
        }
        return j == r2.length;
    }
}