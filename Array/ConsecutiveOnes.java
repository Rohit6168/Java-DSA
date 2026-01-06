package Array;

public class ConsecutiveOnes {
    public static int maxOnes(int nums[]){      //O(n^2)
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }else{
                    break;
                }
                maxCount=Math.max(maxCount, count);

            }
        }
        return maxCount;

    }
    public static int maxOnes1(int nums[]){     //O(n)
        int maxCount=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=0;
            }else{
                count++;
            }
            maxCount=Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[]={0,1,1,0,0,0,0,0,1,0,1,1,1,1,0};
        System.out.println(maxOnes1(nums));
    }
}
