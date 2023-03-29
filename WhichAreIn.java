import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        List<String> a3 = null;
        List<String> a1 = Arrays.asList(array1);
        List<String> a2 = Arrays.asList(array2);

        for(String i : a1){
            if(a2.contains(i)){
                a3.add(i);
            }
        }
        Collections.sort(a3,String.CASE_INSENSITIVE_ORDER);
        return a3.toArray(new String[0]);
    }
}
