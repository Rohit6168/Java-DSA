package Array;

import java.util.Arrays;

public class SecondLargestInArray {
    public static int secondLargest1(int arr[]) {

        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static int secondLargest(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 2, 14, 23, 6 };
        System.out.println(secondLargest(arr));
    }
}
