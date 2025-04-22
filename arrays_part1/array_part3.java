package arrays_part1;
import java.util.Scanner;

public class array_part3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rows");
		int rows = scan.nextInt();
		System.out.println("How many cols");
		int cols = scan.nextInt();
		
		int[][] arrayname = new int[rows][cols];
		
		for(int i = 0; i < rows ; i++) {
			for(int j = 0; j < cols ; j++) {
				System.out.println("Enter the value for rows " + i + " and cols" + j);
				arrayname[i][j] = scan.nextInt();
			}
		}
		
		
		for(int i = 0; i < rows ; i++) {
			for(int j = 0; j < cols ; j++) {
			 System.out.print(arrayname [i][j] + " ");		
			}
			System.out.println();
		
		
	}
	}

}
