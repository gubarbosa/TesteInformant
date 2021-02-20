package UniqueArrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class Arrays {
    public String[][] array = new String[][];

    public Arrays() {
    }

    public void getUniqueArrayPossibilities() {
        Set<String[]> set = new LinkedHashSet<>();
        for (String[] valor: array) {
            set.add(valor);
        }
        System.out.println(set);
    }
}
