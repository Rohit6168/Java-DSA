package Array;

import java.util.Scanner;

public class array {
    public static void thirdLargest(int arr[]){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        if(arr[0]>arr[1] && arr[0]>arr[2]){
            max1=arr[0];
        }else if(arr[1]>arr[2]){
            max2=arr[1];
        }else{
            max3=arr[2];
        }
        System.out.println(max3);

        
    }
    public static void main(String[] args) {
       int arr[]={7,8,9,2,14,23,6};
        thirdLargest(arr);
    }


}
