import java.util.*;
class SortString{
	public static void main(String args[]){
		int i,j;
		String temp;
		String arr[] = new String[10];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = scn.nextInt();
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++)
			arr[i] = scn.next();
		System.out.println("The array is : ");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				if((arr[i].compareTo(arr[j])) > 0){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nSorted array is : ");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}
