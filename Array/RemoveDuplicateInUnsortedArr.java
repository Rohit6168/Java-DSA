package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicateInUnsortedArr {
    public static void removeDuplicates(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 1, 2, 5 };
        removeDuplicates(arr);

        // LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // for (int num : arr) {
        //     set.add(num);
        // }

        // System.out.println(set);
    }
}
