package art;

import java.util.Scanner;

public class twod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][]=new int [row][col];
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
      print(arr);
	}
	public static void print(int arr[][]) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				System .out.print(arr[i][j]+" ");
			  }
			System .out.println( );

		}
      
	}

}
