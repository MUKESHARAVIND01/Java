package interview;
import java.util.Scanner;
public class multiDiaArr {

	public static void main(String[] args) {
		int row=3,col=3;
		int arr[][]=new int[row][col];	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
		// creating multi diamensoinal array
		for(int i=0;i<row;i++) // this for row
		{
			for(int j=0;j<col;j++) // this for column
			{
				 arr[i][j]=scan.nextInt();	 // get input from user
			}
			System.out.println();
		}
		
		// printing array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
