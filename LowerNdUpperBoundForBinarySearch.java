package javadsa;

public class LowerNdUpperBoundForBinarySearch {
	
	static int lower_bound(int arr[], int target) {
		int low = 0, high = arr.length-1;
		
		while(low<high) {
			int mid = low + (high-low)/2 ;
			
			if(target<=arr[mid])
				high = mid;
			else low = mid+1;
			}
		if(arr[low]!=target) return -1;
		
		return low;
	}
	
	static int upper_bound(int arr[], int target) {
		int low = 0, high = arr.length-1;
		
		while(low<high) {
			int mid  = low + (high-low)/2;
			
			if(target>=arr[mid])
				low = mid+1;
			else high = mid;
		}
		
		return low;
	}
	
	static int binary_search(int arr[], int target) {
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			
			if(arr[mid] == target) return mid;
			
			else if(target<arr[mid])
				high = mid-1;
			
			else low = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,2,2,4,4,4,6,8,10,11,13,13,14};
			
		int target = 13;
		
		System.out.println(upper_bound(arr, target));
		//System.out.println(lower_bound(arr, target));
	}
	
}