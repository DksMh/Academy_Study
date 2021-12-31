package day13_levelup;

import static java.lang.System.out;

import java.util.Scanner;

public class LevelUpEx01 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//	*********	-> 0 (0-9(5/4)-0)
		//	**** ****	-> 1 (4-1-4) 
		//	***   ***	-> 2 (3-3-3)
		//	**     **	-> 3 (2-5-2)
		//	*       *	-> 4 (1-7-1) ---> 분기점
		//	**     **	-> 5 (2-5-2)
		//	***   ***	-> 6 (3-3-3)
		//	**** ****	-> 7 (4-1-4)
		//	*********	-> 8 (0-9-0)
//		int em = 0;
//	      for (int i = 0; i < 9; i++) {
//	         for (int j = 0; j < 9; j++) {
//	            // 4열을 기준으로 em만큼 떨어진 범위를 &&연산으로 지정하여
//	            // 그 범위만큼 공백을 출력하고 그외에는 별을 출력
//	            System.out.print((j > (4 - em)) && (j < (4 + em)) ? " " : "*"); // j > (4 - 1)) && (j < (4 + 1) ==> j > 3 && j < 5 // j = 4; 그럼 4번째에 공백을 찍기 
//	         }
//	         System.out.println();
//	         // i가 보다 작을땐 em이 0부터 1씩 증가하고 4초과일때 1씩 감소하도록 정의
//	         em = i < 4 ? em + 1 : em - 1;
//	      }
//		int end = 5;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<9; j++) {
//				System.out.print(j<end || j>8-end?"*":" "); // == 9-(end+1) -> 3-4-5-6-7
//				System.out.print(j>=end && j<9-end?" ":"*"); // 공백을 줄여주는 방법 5-4-3-2-1 / 4-5-6-7-8
//			}
//			System.out.println();
//			end = i<4 ? end-1:end+1;
//		}	
		
		// 입력하는 거 
		int size;
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
		// 유효성 검사 : 5이상 15이하 값만 허용, 홀수만 입력 받을것.
		while(size%2==0 || (size < 5 || size >15)) {
			try {
				if(size < 5 || size >15){
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
				scan.next();// k\n
				size = 0;
				continue;
			}
		}
		
		int end = size/2 + 1; 
		for(int i=0; i<size; i++) { 
			for(int j=0; j<size; j++) { 
				System.out.print(j>=end && j<size-end? " " : "*");
			}
			System.out.println();
			end = i<size/2 ? end-1:end+1;
		}
		

		
	}
	
	public static void main_t3(String[] args) {
		//	*********	-> 0-9(5/4)-0)
		//   *******	-> 1-7(4/3)-1)
		//    *****		-> 2-5(3/2)-2)
		//	   ***		-> 3-3(2/1)-3)
		//		*		-> 4-1(1/0)-4)
		//	   ***		-> 3-3(2/1)-3)
		//    *****		-> 2-5(3/2)-2)
		//   *******	-> 1-7(4/3)-1)
		//	*********	-> 0-9(5/4)-0)	
		
		// 혼자 한 방법
		int end =0;
		int end1=5;
		for(int i=0; i<9; i++) {
			for(int j=0; j<end; j++) {
				System.out.print("^");
			}
			for(int a=0; a<(2*end1)-1; a++) { // 9-i
				System.out.print("*");
			}
			System.out.println();
			end = i<4? end+1: end-1;
			end1 = i<4? end1-1: end1+1;
		}
		
	}
	
	public static void main_t3_1(String[] args) {
		//	*********	-> 0-9(5/4)-0)
		//   *******	-> 1-7(4/3)-1)
		//    *****		-> 2-5(3/2)-2)
		//	   ***		-> 3-3(2/1)-3)
		//		*		-> 4-1(1/0)-4)
		//		*		-> 4-1(1/0)-4)
		//	   ***		-> 3-3(2/1)-3)
		//    *****		-> 2-5(3/2)-2)
		//   *******	-> 1-7(4/3)-1)
		//	*********	-> 0-9(5/4)-0)		
		
		// 혼자 한 방법
		for(int i=0;i<5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("-");
			}
			for(int j=0; j<2*(5-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<5; i++)  {
			for(int j=0; j<4-i; j++) {
				System.out.print("-");
			}
			for(int j=0; j<2*(i+1)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}


	public static void main_t2(String[] args) {
		//		*		-> 1 (4-1-4)
		//	   ***		-> 3 (3-3(2/1)-3)
		//    *****		-> 5 (2-5(3/2)-2)
		//   *******	-> 7 (1-7(4/3)-1)
		//	*********	-> 9 (0-9(5/4)-0)
		//   *******	-> 7 (1-7(4/3)-1)
		//    *****		-> 5 (2-5(3/2)-2)
		//	   ***		-> 3 (3-3(2/1)-3)
		//		*		-> 1 (4-1(1/0)-4)
		
		// 선생님 방법 A)		
		int end = 1;
		for(int i =0; i<9; i++) {
//			System.out.println(end);
			for(int j =0; j<5-end; j++) { // j<5-2 = 3 --> 0,1,2
				System.out.print(" ");
			}
			for(int j =0; j<end*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			end = i<4? end+1:end-1;  // 1 = i<4? 2: 0;
		}
		// 선생님 방법 B)		
//		int end = 4;
//		for(int i =0; i<9; i++) {
//			for(int j =0; j<9-end; j++) {
//				System.out.print(j<end ? "^":"*");
//			}
//			System.out.println();
//			end = i<4? end-1:end+1;
//		}
		
		// 혼자 한 방법
//		int end = 4;
//		int end1 = 1;
//		for(int i =0; i<9; i++) {
//			for(int j =0; j<end; j++) {
//				System.out.print(" ");
//			}
//			for(int a = 0; a<(2*end1)-1; a++) { // a<i+1
//				System.out.print("*");
//			}
//			System.out.println();
//			end = i<4 ? end-1: end+1 ;
//			end1 = i<4 ? end1+1: end1-1;
//		}
		
		
	}
	public static void maint_2(String[] args) {
		//	*********	-> 9 (0-9(5/4)-0) -0
		//   *******	-> 7 (1-7-1) -1
		//    *****		-> 5 (2-5-2) -2
		//	   ***		-> 3 (3-3-3) -3
		//		*		-> 1 (4-1-4) -4
		
		// 선생님 방법 - A)
		for(int i=0; i<5; i++) { //행
			for(int j =0;j<i; j++) { //열
				System.out.print("^");
			}
			for(int j = 0; j<9-i*2; j++) { // j<9 로 별 9개 만들고 거기서 뺼 수를 계산함
				System.out.print("*");
			}
			System.out.println();
		}
		// 선생님 방법 - B)
		for(int i=0; i<5; i++) { 
			for(int j =0; j<9-i; j++) { // 9-i 공백 뒷부분 먼저 만들어 줌
				System.out.print(j<i?" ":"*"); // 여기서 앞부분도 지워주기
			}
			System.out.println();
		}		
		
		// 혼자 함
		for(int i=0; i<5; i++) {
			// 공백만들기 + 별찍기
			for(int j = 0; j<i+2*(5-i)-1;j++) {
				System.out.print(j<i ? "-":"*");
			}
			System.out.println();
		}
		// 풀어서 찍기		
		for(int i=0; i<5; i++) {
			// 공백만들기
			for(int j=0; j<i; j++) {
				System.out.print("-");
			}
			for(int a=0; a<2*(5-i)-1;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
	public static void main_t1(String[] args) {
		//		*		-> 0 (4-1-4)
		//	   ***		-> 1 (3-3-3)
		//    *****		-> 2 (2-5-2)
		//   *******	-> 3 (1-7-1)
		//	*********	-> 4 (0-9-0)		
		// 반을 나눠서 삼각형 + 삼각형으로 만들기
		for(int i = 0; i<5; i++) {
			//공백출력 + 별찍기 합치기
			for(int j = 0; j<4-i+i*2+1; j++) {
				System.out.print(j<4-i ?" ":"*");
			}
			
			System.out.println();
		}
		// 풀어서 한 방법
		for(int i = 0; i<5; i++) {
			//공백출력
			for(int j = 0; j<4-i; j++) {
				System.out.print(" ");
			}
			// 별찍기 // 삼각형 2개 만들기 + 1개식 빠지니까 위 //*-> 0 (4-1-4) 그래서 +1
			for(int a =0; a<i*2+1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main_t(String[] args) { //main_target
		// 별출력 프로그램 - 별 또는 공백이 반복 한번에 한개씩 출력
		// 5 행 
		//		*		-> 0 (4-1-4)
		//	   ***		-> 1 (3-3-3)
		//    *****		-> 2 (2-5-2)
		//   *******	-> 3 (1-7-1)
		//	*********	-> 4 (0-9-0)
		
		
		//	*********	-> 9 (0-9-0)
		//   *******	-> 7 (1-7-1)
		//    *****		-> 5 (2-5-2)
		//	   ***		-> 3 (3-3-3)
		//		*		-> 1 (4-1-4)
		
		
		
		//		*		-> 1 (4-1-4)
		//	   ***		-> 3 (3-3-3)
		//    *****		-> 5 (2-5-2)
		//   *******	-> 7 (1-7-1)
		//	*********	-> 9 (0-9-0)
		//   *******	-> 7 (1-7-1)
		//    *****		-> 5 (2-5-2)
		//	   ***		-> 3 (3-3-3)
		//		*		-> 1 (4-1-4)
		
		
				
		//	*********	-> 9 (0-9-0)
		//   *******	-> 7 (1-7-1)
		//    *****		-> 5 (2-5-2)
		//	   ***		-> 3 (3-3-3)
		//		*		-> 1 (4-1-4)
		//		*		-> 1 (4-1-4)
		//	   ***		-> 3 (3-3-3)
		//    *****		-> 5 (2-5-2)
		//   *******	-> 7 (1-7-1)
		//	*********	-> 9 (0-9-0)
		
		
		//	*********	-> 9 (0-9-0)
		//	**** ****	-> 9 (0-9-0)
		//	***   ***	-> 9 (0-9-0)
		//	**     **	-> 9 (0-9-0)
		//	*       *	-> 9 (0-9-0)
		//	**     **	-> 9 (0-9-0)
		//	***   ***	-> 9 (0-9-0)
		//	**** ****	-> 9 (0-9-0)
		//	*********	-> 9 (0-9-0)
		
		
		
	}
	
	public static void main01(String[] args) {
		//	*		: 0 - 1
		//	**		: 1 - 2
		//  ***		: 2 - 3
		//  ****	: 3 - 4
		//	*****	: 4 - 5
		for(int i =0; i<5; i++) {
			for(int j=0; j<i+1;j++) { // j가 i를 기준으로 얼마나 돌아가는가
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =0; i<5; i++) {
			for(int j=0; j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		} // 16~21과 동일
		for(int i=1; i<=25; i++) {
			System.out.print("*");
			if(i%5 == 0) {
				System.out.println();
			}
		}
		
	}
	public static void main02(String[] args) {
		// *****	: 0 - 5 (5-i)
		// ****		: 1 - 4 
		// ***		: 2 - 3
		// **		: 3 - 2
		// *		: 4 - 1
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 동일하게 나옴
//		for(int i =0; i<5; i++) {
//			for(int j = 5; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	public static void main03(String[] args) {
		//	*		: 0 - 1
		//	**		: 1 - 2
		//  ***		: 2 - 3
		//  ****	: 3 - 4
		//	*****	: 4 - 5
		//  ****	: 3 - 4 (5)
		//  ***		: 2 - 3 (6)
		//  **		: 1 - 2 (7)
		//  *		: 0 - 1 (8)
		int end = 1;
		for(int i =0; i<9; i++) {
//			System.out.println(end);
			for(int j =0;j<end; j++) {
				System.out.print("*");
			}
			System.out.println();
			end = i<4 ? end+1: end-1; // 1-1(별)이 찍히고 2-2 3-3 4-4 5-5 / 
		}
		
		// 쉬운 방법
//		for(int i =0; i<5; i++) {
//			for(int j=0; j<i+1;j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}   
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	public static void main04(String[] args) {
		// ^^^^*
		// ^^^**
		// ^^***
		// ^****
		// *****
		for(int i = 0; i<5; i++) {
			for(int j= 0;j<5;j++) {
				System.out.print(j<4-i?" ":"*");
			}		
			System.out.println();
		}
		
//		for(int i = 0; i<5; i++) {
//			for(int j= 0;j<4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j= 0;j<i+1;j++) {
//				System.out.print("*");
//			}			
//			System.out.println();
//		}
	}
	public static void main05(String[] args) {
		// ***** 0(i)-5(별)-0(공백 = j)
		// ^**** 1-4-1
		// ^^*** 2-3-2
		// ^^^** 3-2-3
		// ^^^^* 4-1-4
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}
	}
	public static void main06(String[] args) {
		// ^^^^* 4-1-4 (0) - 4(공백)
		// ^^^** 3-2-3 (1) - 3(공백)
		// ^^*** 2-3-2 (2) - 2(공백)
		// ^**** 1-4-1 (3) - 1(공백)
		// ***** 0-5-0 (4) - 0(공백)
		// ^**** 1-4-1 (5) - 1(공백)
		// ^^*** 2-3-2 (6) - 2(공백)
		// ^^^** 3-2-3 (7) - 3(공백)
		// ^^^^* 4-1-4 (8) - 4(공백)
		int end = 4;
		for(int i = 0; i<9; i++) {
//			System.out.println(end);
			for(int j=0; j<5;j++) {
				System.out.print(j<end?" ":"*");
			}
			System.out.println();
			end = i<4 ? end-1 : end+1; //end-1 -> 4-3-2-1-0으로 만들어야하니까
		}
	}
	
}
