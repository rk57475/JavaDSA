/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. 
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.*/

package javadsa;

public class SumOfElementsReturnIndex {

	static int[] search(int arr[], int key) {
		int low = 0, high = arr.length - 1;
		int a[] = new int[2];
		while (low < high) {
			if (arr[low] + arr[high] == key) {
				a[0] = low + 1;
				a[1] = high + 1;
				break;

			} else if (arr[low] + arr[high] > key) {
				high--;
			} else if (arr[low] + arr[high] < key) {
				low++;
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 7, 8 };
		int key = 9;
		int b[] = search(arr, key);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}

}
