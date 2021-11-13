package javadsa;

public class FirstNdLastOccurence {

	static int first(int arr[], int target) {

		int start = 0, end = arr.length - 1;
		int first = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] == target) {
				first = mid;
				end = mid - 1;
			}

		}

		return first;
	}

	static int last(int arr[], int target) {

		int start = 0, end = arr.length - 1;
		int last = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				last = mid;
				start = mid + 1;
			}
		}

		return last;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 3, 3, 3, 6, 6, 6, 6, 7, 7, 7, 7 };
		int target = 3;
		int firstOccurenc = first(arr, target);
		int lastOccurenc = last(arr, target);
		System.out.println(firstOccurenc);
		System.out.println(lastOccurenc);

	}

}
