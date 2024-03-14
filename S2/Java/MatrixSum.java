import java.util.*;
class MatrixSum{
	public static void main(String args[]){
		int i,j;
		int matrix1[][];
		int matrix2[][];
		int matrix_sum[][];
		matrix1 = new int[10][10];
		matrix2 = new int[10][10];
		matrix_sum = new int[10][10];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Size of the matrix");
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println("Enter elements of matrix 1");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				matrix1[i][j]=scn.nextInt();
			}
		}
		System.out.println("Enter elements of matrix 2");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				matrix2[i][j]=scn.nextInt();
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				matrix_sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Matrix 1 is : ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Matrix 2 is : ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Sum of matrices is : ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(matrix_sum[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
