/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.*/

package javadsa;

public class BinarySearch {

	public static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		int mid = (start + end) / 2;
		while (start <= end) {

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;

			if (start > end) {
				return -1;
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 6, 8, 9, 11 };
		int target = 6;
		System.out.println(binarySearch(arr, target));

	}

}
