package Array;

// Given an array arr[] and an integer k, the task is to reverse every subarray formed by consecutive K elements.

// Examples: 

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3 
// Output: 3, 2, 1, 6, 5, 4, 9, 8, 7

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 5 
// Output: 5, 4, 3, 2, 1, 8, 7, 6

// Input: arr[] = [1, 2, 3, 4, 5, 6], k = 1 
// Output: 1, 2, 3, 4, 5, 6

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 10 
// Output: 8, 7, 6, 5, 4, 3, 2, 1
// package Array;

public class ReverseArrayIngroups {
    public static void reverse(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i+=k){
            int start=i;
            int last=Math.min(i+k-1, n-1);

            while(start<last){
                int temp=arr[start];
                arr[start]=arr[last];
                arr[last]=temp;

                start++;
                last--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int k = 5;
        reverse(arr, k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
