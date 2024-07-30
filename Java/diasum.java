import java.lang.*;
import java.util.*;
public class diasum {
	public static void main(String args[]) {
		System.out.println("Enter values for a matrix");
		int mat1[][] = new int[3][3];
		int mat2[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print("Enter Number");
				mat1[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Now enter values for matrix2");

		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print("Enter Number:");
				mat2[i][j] = sc.nextInt();
				
			}
			System.out.println();
		}

		//now we gonna print them

		System.out.println("Matrix 1");

		for(int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print(mat1[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println("Matrix 2");
		
		
		for(int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print(mat2[i][j]+ " ");
			}
			System.out.println();
		} 


		int a = sum(mat1,mat2);



		System.out.println("Sum of the both diagnol of the matrices is : "+a);

	}
	public static int sum(int mat1[][] , int mat2[][]){
		
        int sum=0;
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat1.length;j++){
				if(i==j){
					sum+=mat1[i][j]+mat2[i][j];

				}
				else if (i+j == mat1.length - 1 ) {
					sum+= mat1[i][j]+mat2[i][j];
				}
			}
		}
		return sum;
	}
}
