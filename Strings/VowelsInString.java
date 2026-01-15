package Strings;

import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String str =sc.nextLine();
        str = str.toLowerCase();

        int vowels=0;
        int cosonent=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if (Character.isLetter(ch)){// Only count letters
                if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else{
                cosonent++;
                }
            }
        }
        System.out.println("total vowels are: "+vowels);
        System.out.println("total consonents are: "+cosonent);


    }
    
}
