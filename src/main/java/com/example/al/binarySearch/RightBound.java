package com.example.al.binarySearch;

public class RightBound {
	public static void main(String[] args) {

		System.out.println(leftBound1(new int[]{1, 2, 2, 2, 3, 3, 4, 8}, 2));
		System.out.println(rightBound1(new int[]{1, 2, 2, 2, 3, 3, 4, 8}, 2));
		System.out.println(binarySearch(new int[]{1, 2, 2, 2, 3, 3, 4, 8}, 2));

	}

	static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] == target) {
				return mid;
			}
		}
		return -1;
	}


	static int leftBound1(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] == target) {
				right = mid - 1;
			}
		}

		if (left >= nums.length || nums[left] != target) {
			return -1;
		}
		return left;
	}

	static int rightBound1(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] == target) {
				left = mid + 1;
			}
		}

		if (right < 0 || nums[right] != target) {
			return -1;
		}
		return right;
	}

}
