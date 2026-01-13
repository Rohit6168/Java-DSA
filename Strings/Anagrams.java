package Strings;

import java.util.Arrays;

public class Anagrams {
    public static boolean checkAnagrams(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length() !=s2.length()){
            return false;
        }

        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
    public static void main(String[] args) {
        String s1="care";
        String s2="race";

        if(checkAnagrams(s1, s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("not anagrams");
        }

    }
    
}
