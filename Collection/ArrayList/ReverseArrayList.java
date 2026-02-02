package Collection.ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);
        System.out.print("Reversed List: ");
        
        // Print in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    
}


