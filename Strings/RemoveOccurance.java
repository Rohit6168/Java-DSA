package Strings;

import java.util.Scanner;

public class RemoveOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        System.out.println("Enter the char to remove");
        char ch=sc.next().charAt(0);
    

        String result=str.replace(String.valueOf(ch),"");
        System.out.println(result);

    }
}
