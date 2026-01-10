package Array;

public class ReverseArray {

    public static void reversearr(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }

    }

    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;

        while (start<end) {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];

            start++;
            end--;
            
        }

    }
    public static void main(String[] args) {
        int arr[]={24,4,6,8,10,12,14,16};
        reversearr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
