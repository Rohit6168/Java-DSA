package Array;

public class SumOfArrayPlusOne {
    public static int sumByOne(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+nums[nums.length-1];
            sum=nums[i]+1;

        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(sumByOne(nums));
    }
}
