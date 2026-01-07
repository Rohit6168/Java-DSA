// Given an array arr[] consisting of only 0's and 1's, the task is to find the count of a maximum number of consecutive 1's or 0's present in the array.

// Examples : 

// Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
// Output: 4
// Explanation: The maximum number of consecutive 1's in the array is 4 from index 8-11.

// Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
// Output: 2
// Explanation: The maximum number of consecutive 0's in the array is 2 from index 0-1.

// Input: arr[] = {0, 0, 0, 0}
// Output: 4
// Explanation: The maximum number of consecutive 0's in the array is 4.



package Array;

public class MaxConsecutiveOnesOrZeros {

    public static int max(int nums[]){
        if(nums.length==0) return 0;

        int maxCount=Integer.MIN_VALUE;
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }else{
                maxCount=Math.max(maxCount,count);
                count =1;
            }
        }
        return Math.max(maxCount, count);
    }
    public static void main(String[] args) {
        int nums[]={0,1,1,0,0,0,0,0,1,0,1,1,1,1,0};
        System.out.println(max(nums));
    }
}
