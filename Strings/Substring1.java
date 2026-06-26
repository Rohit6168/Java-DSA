package Strings;

public class Substring1 {
    public static void main(String[] args) {
        String s = "hiiihellohihellohihihellohihellohelhelhelhellohihi";
        int count = 0;

        for (int i = 0; i <= s.length() - 5; i++) {
            if (s.substring(i, i + 5).equals("hello")) {
                count++;
            }
        }

        System.out.println(count);
        
    }
}
