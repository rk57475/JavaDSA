package javadsa;

import java.util.Scanner;

public class MergeSort15Nov {
		
	static void divide(int []arr, int start,int end) {
		if(start<end) {
			int mid = start+(end-start)/2;
			
			divide(arr,start,mid);
			divide(arr,mid+1,end);
			
			merge(arr,start,mid,end);
		}
	}
	
	static void merge(int []arr,int low ,int mid,int high) {
		int Larr1len = mid-low+1;
		int Rarr2len = high-mid;
		
		int Larry[] = new int[Larr1len];
		int Rarry[] = new int[Rarr2len];
		
		for(int i=0; i<Larr1len; i++) {
			Larry[i] = arr[low+i];
		}
		for(int i=0; i<Rarr2len; i++) {
			Rarry[i] = arr[mid+i+1];
		}
		int i = 0, j = 0;
		int k = low;
		while(i<Larr1len && j<Rarr2len) {
			
			if(Larry[i]<=Rarry[j]) {
				arr[k] = Larry[i];
				i++;
			}
			else {
				arr[k] = Rarry[j];
				j++;
			}
			k++;
		}
		while(i<Larr1len) {
			arr[k] = Larry[i];
			k++;
			i++;
		}
		while(j<Rarr2len) {
			arr[k] = Rarry[j];
			j++;
			k++;
		}
		
	}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); 
	        int n=sc.nextInt();    
	        int[] arr = new int[n]; 
	        for(int i=0; i<n; i++)  {  
	            arr[i]=sc.nextInt();
	        }
	        
	       
			  
	       divide(arr, 0, arr.length - 1);
	        
	        for(Integer val: arr) {
	        	System.out.print(val +" ");
	        }
	  
		}
}
