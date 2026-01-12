package Array;
public class TwiceInArray{
    public static int twiceinArraycheck(int num[]){
        
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return num[i];
                }
            }
          }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,3};

      System.out.println(twiceinArraycheck(num));
    }
}