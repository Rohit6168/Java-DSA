package Strings;

public class ReverseString {
    public static String reverse(String str){   //using StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }
    public static String reverse1(String str) {   // without using StringBuilder
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str ="rohit";
        System.out.println(reverse(str));

    }
}
