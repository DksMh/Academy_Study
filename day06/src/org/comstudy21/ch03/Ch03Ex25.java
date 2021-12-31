package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ch03Ex25 {
	static Scanner scan = new Scanner(System.in);
	
	static int[][] arr = new int[5][5];
	
	private static void printArr(int[][] arr) {
		// 행렬로 출력한다.
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] == 0? "\t": arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	public static void main00(String[] args) {
		// 행(가로줄)우선
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = num++;
			}
		}
		
		printArr(arr);
		
 	}
	public static void main02(String[] args) {
		// 열(세로줄)증가
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25	
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[j][i] = num++;
			}
		}
		
		printArr(arr);
	}
	public static void main03(String[] args) {
		// 열(세로줄)증가
		// 1 
		// 2 3
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<i+1; j++) {
				arr[i][j] = num++;
			}
		}
		
		printArr(arr);
	}
	public static void main03_1(String[] args) {
		// 열(세로줄)증가
		// 		       1 
		// 		     2 3
		//	       4 5 6
		// 	    7 8 9 10
		//11 12 13 14 15
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j=4-i; j<arr.length; j++) {
				arr[i][j] = num++;
			}
		}
		
		printArr(arr);
	}
	public static void main04(String[] args) {

		// 1  2  3  4  5 
		//    6  7  8  9
		//      10 11 12 -> 3
		//   13 14 15 16
		//17 18 19 20 21
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			int start = i<=2?i:4-i;
			for(int j=start; j<arr.length; j++) { // 0 1 2 1 0
				arr[i][j] = num++;
			}
		}		
		printArr(arr);
		
	}
	public static void main(String[] args) {
		// ------ 과제 --------
		// 1  2  3  4  5 
		//    6  7  8 
		//       9
		//   10  11 12
		// 13 14 15 16 17
		
		int num = 1;
//		for(int i=0; i<arr.length; i++) {
//	        int start = i<=2?i:4-i;
//	        int end = i<=2?4-i:i;
//	         for(int j=start; j<=end; j++) {
//	            arr[i][j] = num++;
//	         }
//	     }
		for(int i=0; i<arr.length; i++) {
			int start = i<=2?i:4-i;
			int end = i<=2?5-i:i+1;
			for(int j=start; j<end; j++) {
				arr[i][j] = num++;
			}
		}
			
		
		// ------ 보너스 게임 ------
		
		// 1  2  3  4  5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9
		
		
		printArr(arr);
	}
	
}
