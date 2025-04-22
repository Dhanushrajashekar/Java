package arrays_part1;
import java.util.Scanner;

public class StudentMarksArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number of Students");
		int rows = scan.nextInt();
		System.out.println("Number of Subjects");
		int cols = scan.nextInt();
		
		int totalMarks = 0;
		float totalAvg = 0;
		
		int[][] studentsRecords = new int[rows][cols];
		
		for(int i= 0; i<rows ;i++) {      /*Takes the input of student marks from user*/
			for(int j=0; j<cols; j++) {
				System.out.println("Enter the marks for " + i + " Student");
				studentsRecords[i][j] = scan.nextInt();
			}
		}
		
		int i;
		for( i=0 ; i<rows ;i++) {
			for(int j = 0; j<cols; j++) {   /*Prints out all the input in matrix format*/
				System.out.print(studentsRecords[i][j] + " ");
				totalMarks = totalMarks + studentsRecords[i][j];
				totalAvg = totalMarks / cols;
			}
			System.out.println();
			
			System.out.println("Student TotalMarks " + i + " " + totalMarks);
			System.out.println("Student TotalAvg " + i + " " + totalAvg);


		}

	}		
 }