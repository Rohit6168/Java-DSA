package Array;

public class RemoveDuplicatesInSortedArr {
    public static int sorted(int arr[]){
        int rd=0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,8,9,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int rd =sorted(arr);

        for (int i = 0; i<=rd; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}