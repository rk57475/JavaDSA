package javadsa;

public class SortZerosNdOnes {

	public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,1,1,1,1};
		
		int i=0,j=arr.length-1;
		
		while(i<=j) {
			if(arr[i]==1) {
				int tmp =arr[i];
				arr[i]= arr[j];
				arr[j] = tmp;
				--j;
			}
			else i++;
		}
		
		for (int i1 = 0; i1 < arr.length; i1++)
		    System.out.print(arr[i1] + " ");
	}
}
