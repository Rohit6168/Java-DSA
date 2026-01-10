package Array;

public class RotateAnArray {
    public static void rotateOne(int arr[]){        //O(k*n)
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    public static void rotate(int arr[],int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }

        for(int i=1;i<=k;i++){
            rotateOne(arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        rotate(arr, 5 );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        

    }
}
