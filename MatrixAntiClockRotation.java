package javadsa;

public class MatrixAntiClockRotation {
	
	static void MatrixRotation(int arr[][]) {
		int min_row = 0;
		int max_row = arr.length - 1;
		int min_col = 0;
		int max_col = arr.length-1;
		int size = arr.length * arr[0].length;
		int count = 0;
		while(count < size)
		{
			//left wall
			for(int i = min_row, j = min_col; i <= max_row && count < size ; i++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			min_col++;
			//bottom wall
			for(int i = min_col, j = max_row; i <= max_col && count < size; i++)
			{
				System.out.println(arr[j][i]);
				count++;
			}
			max_row--;
			//right wall
			for(int i = max_row, j = max_col; i >= min_row && count < size; i--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			max_col--;
			//top wall
			for(int i = min_row, j = max_col; j >= min_col && count < size; j--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			min_row++;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{2, 3,  4, 5},
					   {6, 7,  8, 9},
					   {10,11,12,13},
					   {14,15,16,17}};
	
		MatrixAntiClockRotation.MatrixRotation(arr);
		
	}
}