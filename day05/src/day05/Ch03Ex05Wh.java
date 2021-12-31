package day05;

import static java.lang.System.out;

import java.util.Scanner;

public class Ch03Ex05Wh {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// -1을 입력하면 그만~ 아니면 계속 반복.
		//	크기 >> 5
		//	*****
		//	**  *
		//	* * *
		//	*  **
		//	*****
		//
		//	*****
		//	** **
		//	*   *
		//	** **
		//	*****
		// 입력하는 거 		
		
		int size = 0;
		while (true) {
			try {
				System.out.print("크기입력(홀수만)>>> ");
				size = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력 하세요!");
				scan.next();
				continue;
			}
		}
		
		while (size % 2 == 0 || (size < 5 || size > 15)) {
			try {
				if (size < 5 || size > 15) {
					System.out.println("5이상 15이하 값만 입력하세요!");
					System.out.print("크기입력(홀수만)>>> ");
					size = scan.nextInt();
					continue;
				}
				System.out.println("홀수만 입력 하세요!");
				System.out.print("크기입력(홀수만)>>> ");
				size = scan.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력 하세요!");
				scan.next();
				size = 0;
				continue;
			}
		}
		while(true) {
			if(!(size == -1)) {
				// 별찍는 부분
				for(int i=0;i<size;i++) { // 행
					for(int j=0;j<size;j++) { // 열
						if(i==0||i==(size-1)||j==0||j==(size-1)) {  // 1행, 5행은 별이 5개 / 1열, 5열도 별이 5개
							System.out.print("*");
						}else if(i==j) { // 2,3,4(행/열)은 별이 3개
							System.out.print("*");
						}else { // 1-2 (5-3) 
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
				int cnt=size/2+1;
				for(int i=0;i<size;i++) { 
					for(int j=0;j<size;j++) { 
						System.out.print(j>=cnt && j<size-cnt?" ":"*"); 
					}
					System.out.println();
					cnt = i<size/2 ? cnt-1:cnt+1; 
				}
				System.out.print("크기입력(홀수만, -1 입력시 종료합니다.)>>> ");
				size = scan.nextInt();
				continue;
			} else {
				System.out.println("-1을 입력하여 종료합니다");
				break;
			}
		}
//		int cnt=0;
//		for(int i=0;i<5;i++) { 
//			for(int j=0;j<5;j++) { 
//				System.out.print((j > (2 - cnt)) && (j < (2 + cnt)) ? " " : "*");
//			}
//			System.out.println();
//			cnt = i<2 ? cnt+1:cnt-1; 
//		}
		
		// 입력없이 n만들기 
//		for(int i=0;i<5;i++) { // 행
//			for(int j=0;j<5;j++) { // 열
//				if(i==0||i==4||j==0||j==4) {  // 1행, 5행은 별이 5개 / 1열, 5열도 별이 5개
//					System.out.print("*");
//				}else if(i==j) { // 2,3,4(행/열)은 별이 3개
//					System.out.print("*");
//				}else { // 1-2 (5-3) 
//					System.out.print(" ");
//				}
//			}
//		System.out.println();
//		}
//		
		
		
//		입력없이 안쪽 다이아몬드 만들기 
//		int cnt=0;
//		for(int i=0;i<5;i++) { 
//			for(int j=0;j<5;j++) { 
//				System.out.print((j > (2 - cnt)) && (j < (2 + cnt)) ? " " : "*");
//			}
//			System.out.println();
//			cnt = i<2 ? cnt+1:cnt-1; 
//		}
		
		
		
		
		// 크기 >> 7
		// *******
		// **    *
		// * *   *
		// *  *  *
		// *   * *
		// *    **
		// *******
		
		// *******
		// * * * *
		// **   **
		// *     *
		// **   **
		// * * * *
		// *******
		
		// 배열과 반복을 연습하는 주말과제
	}
	
}
