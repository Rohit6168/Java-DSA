package Array;

public class LargestInAnArray {

    public static int largestInArray(int numbers[]){
        int largest =Integer.MIN_VALUE;

        int smallest =Integer.MAX_VALUE;

        for(int i =0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest =numbers[i];
            }
            if(numbers[i]<smallest){         //smallest no in an array
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value in array is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,16,7,3,9};
        System.out.println("largest no in array is : "+largestInArray(numbers));
    }
}
