package Collection.ArrayList;

public class FirstnonRepeatChar {

    public static char returnChar(String str){
        for(int i=0;i<str.length();i++){
            boolean found=false;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    found=true;
                    break;
                }
    
            }
             if(!found){
                    return str.charAt(i);
                }
        
        }
        return '$';
        
    }
    public static void main(String[] args) {
        String str="engineering";
        System.out.println(returnChar(str));
    }
}
