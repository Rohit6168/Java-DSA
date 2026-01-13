package Strings;

public class PalindromeCheck {

    public static boolean ispalindrome(String str){     //approach 1
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) !=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {   //approach 2
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isPalindrome(str));
    }

}
