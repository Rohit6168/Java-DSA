package Array;

import java.util.Arrays;

public class SecondLargestInArray {
    public static int secondLargest1(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int secondLargest2(int[] arr) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }else{
            max1=arr[1];
            max2=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int arr[]={7,8,9,2,14,23,6};
        System.out.println(secondLargest2(arr));
    }
}
