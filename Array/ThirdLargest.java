package Array;
import java.util.Arrays;
public class ThirdLargest {

    public static int thirdLargest(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);

      
        return nums[n-3];
    }

    public static int thirdLargest1(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE,
        third = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args) {
        int nums[]={4,7,9,12,33,2,5};
        System.out.println(thirdLargest(nums));
    }
}
