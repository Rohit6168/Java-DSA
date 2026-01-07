package Array;

public class MaxSubArraysum {
    public static void maxSubArraySum(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int last=j;
                currentSum=0;
                for(int k=start;k<=last;k++){
                    currentSum+=numbers[k];
                }
                System.out.println(currentSum);

                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("max subarray sum id: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        maxSubArraySum(numbers);
    }
}
