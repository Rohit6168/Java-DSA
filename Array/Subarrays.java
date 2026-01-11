package Array;

public class Subarrays {
    public static void subarrays(int numbers[]){
        int totalSubarrays=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int last =j;
                for(int k=start;k<=last;k++){
                    System.out.print(numbers[k]+" ");
                }
            
                totalSubarrays++;
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("total subarrays are: "+totalSubarrays);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        subarrays(numbers);
    }
}
