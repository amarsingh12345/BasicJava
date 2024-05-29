package com.leetcode.practice;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(getTarget(new int[]{23, 33, 44, 55, 67, 78, 98}, 67));
    }

    public static int getTarget(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = left + (right - left / 2);
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
