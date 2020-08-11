package min;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        addString(listInt, 2020);
        addString(listInt, "Hello word");
        for (int i = 0; i<listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }
    }
    public static void addString(List listInt, Object str) {
        listInt.add(str);
    }
    // We can do it with custom method "addString". Because List<Integer> - just list.
    // We can add to List<Integer> different types, example Char, String, Double, Float...
}
