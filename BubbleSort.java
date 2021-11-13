package javadsa;

public class BubbleSort{
	void bubbleShort(int arr[]) {
		boolean flag = false;
		for(int i=0; i<arr.length-1; i++) {
			flag = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					flag = true;
				}
			}
			if(flag==false) break;
		}
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		int arr[] = {10,5,4,15,12};
		BubbleSort ob = new BubbleSort();
		ob.bubbleShort(arr);
		
	}
	
}