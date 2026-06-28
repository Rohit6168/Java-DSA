package Array;

import java.util.Arrays;

public class ThirdLargest {

    public static int thirdLargest(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } 
            else if (arr[i] > thirdLargest &&
                    arr[i] != largest &&
                    arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 7, 9, 12, 33, 2, 5 };
        System.out.println(thirdLargest(nums));
    }
}
