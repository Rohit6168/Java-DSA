package Array;

public class MaxSubArraySumPrefix {
    public static void maxSubArraySumPrefix(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] =new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                if(start==0){
                    currentSum=prefix[end];
                }else{
                    currentSum=prefix[end]-prefix[start-1];
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }


        }
        System.out.println("max subarray sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubArraySumPrefix(numbers);
    }
}
