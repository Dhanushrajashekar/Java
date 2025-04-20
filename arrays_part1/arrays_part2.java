package arrays_part1;
import java.util.Scanner;
import java.math.*;


public class arrays_part2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float totalSum = 0;
		float totalAvg = 0;
		int mini = Integer.MAX_VALUE;    // Very large number
		int maximum = Integer.MIN_VALUE; // Very small number
		int countPass = 0;
		int countFail = 0;

		

		System.out.println("Enter number of students");
		int n = scan.nextInt(); 
		int[] studentMarks = new int[n];
		
		
		for(int i = 0; i<studentMarks.length; i++) {
			System.out.println("Enter the marks of " + (i+1) + "Student" );
			studentMarks[i] = scan.nextInt();
			
			 totalSum = totalSum + studentMarks[i];
			 totalAvg = totalSum / studentMarks.length;
			 mini = Math.min(mini, studentMarks[i]);
			 maximum = Math.max(maximum, studentMarks[i]);
			 
			 if (studentMarks[i] >= 40) {
				 System.out.println("Passed");
				 countPass =+ i;
			 }else if(studentMarks[i] < 40) {
				 System.out.println("Failed");
				 countFail += 1;
			 }
			 
			
			 
			
		}
		
		 System.out.println("TotalSum = " + totalSum);
		 System.out.println("TotalAvg = " + totalAvg);
		 System.out.println("Min = " + mini);
		 System.out.println("Max = " + maximum);
		 System.out.println("Total Passed = " + countPass);
		 System.out.println("Total Failed = " + countFail);

		
		
	}

}
