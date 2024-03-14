import java.util.*;
class Symmetric{
	public static void main(String args[]){
	int i,j;
		int matrix[][];
		matrix = new int[10][10];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Size of the matrix");
		int n = scn.nextInt();
		System.out.println("Enter elements of matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				matrix[i][j]=scn.nextInt();
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(matrix[i][j]!=matrix[j][i]){
					System.out.println("The matrix is not symmetric");
					System.exit(0);
				}
			}
		}
		System.out.println("The matrix is symmetric");
	}
}
