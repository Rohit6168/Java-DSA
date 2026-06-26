package Strings;


public class test{

    public static void max(int arr[]){
        int cs=arr[0];
        int maxSum=arr[0];

        for(int i=1;i<arr.length;i++){
            cs=Math.max(arr[i],cs+arr[i]);
            maxSum=Math.max(maxSum,cs);
        }
        System.out.println("maxsum is "+maxSum);
    }


    public static void main(String args[]){
       int arr[]={-2,3,-1,4,3,-7};
       max(arr);

    }
}

