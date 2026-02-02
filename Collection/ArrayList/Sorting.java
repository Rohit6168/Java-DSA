package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        System.out.println("Original List: " + list);

        // Sort in ascending order
        Collections.sort(list);
        System.out.println("Sorted in Ascending Order: " + list);

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + list);
    }
}
