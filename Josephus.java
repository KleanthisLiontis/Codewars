import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        LinkedList<T> linkedList = new LinkedList<>(items);
        List<T> returnMe = new ArrayList<>();

        int index = 0;
        while (!linkedList.isEmpty()) {
            index += k - 1;
            index %= linkedList.size();
            T removed = linkedList.remove(index);
            returnMe.add(removed);
            if(linkedList.size() == 1){return (List<T>) linkedList.get(0);

            }
        }
    }
}