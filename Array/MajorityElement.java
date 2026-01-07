package Array;
// Given an array nums of size n, return the majority element.

import java.util.HashMap;
import java.util.Map;

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

public class MajorityElement {
    public static int majority1(int arr[]) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static int majority(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 2, 2 };
        System.out.println(majority(arr));

    }
}
