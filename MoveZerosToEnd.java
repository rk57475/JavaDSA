package javadsa;

public class MoveZerosToEnd {
public static void main(String[] args) {
		
		int arr[] = {1,0,2,1,2,0,2,1,2,0,1,0};
		int start = 0;
		int end =  arr.length-1;
		while(start < end)
		{
			if(arr[end] != 0)
			{
				if(arr[start] == 0)
				{
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					start++;
				}
				else
				{
					start++;
				}
			}
			else
			{
				end--;
			}
		}
		for(int i : arr)
		{
			System.out.print(i+ " ");
		}
	}

}
