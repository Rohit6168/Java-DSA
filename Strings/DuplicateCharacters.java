package Strings;

import java.util.*;

public class DuplicateCharacters {
  public static void printDuplicateCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print duplicates with count
        System.out.println("Duplicate characters and their counts:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        printDuplicateCharacters(str);
    }
}
