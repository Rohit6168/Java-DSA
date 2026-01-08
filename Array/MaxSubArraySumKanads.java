package Array;

public class MaxSubArraySumKanads{
    public static void maxSubArraySumKadane(int numbers[]) {
        int cs = numbers[0];  // Start with first element
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            maxSum = Math.max(maxSum, cs);
        }

        System.out.println("Max subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArraySumKadane(numbers);
    }
}
