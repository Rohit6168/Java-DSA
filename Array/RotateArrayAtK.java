package Array;

public class RotateArrayAtK {
    public static void rotate(int nums[],int k){
        int n=nums.length;
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    public static void reverse(int nums[],int start,int last){
        while(start<last){
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;

            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rotate(arr, k );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
