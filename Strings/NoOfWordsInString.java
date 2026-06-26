package Strings;

public class NoOfWordsInString {
    public static int countWords(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str="Hello my name is rohit";
        System.out.println(countWords(str));
    }
}
