package Array;

public class SortedOrNot {
    public static boolean check(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={2,4,26,7,8,9,12};
        System.out.println(check(nums));
    }
}
