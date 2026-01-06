package Array;

public class ConsecutiveZeros {
    public static int zero(int nums[]){
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    count++;
                }else{
                    break;
                }
                maxCount=Math.max(maxCount, count);

            }
        }
        return maxCount;
    }

    public static int zero1(int nums[]){
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count=0;
            }else{
                count++;
            }
            maxCount=Math.max(maxCount, count);

        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[]={0,1,1,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0};
        System.out.println(zero1(nums));
    }
}
