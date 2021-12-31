package org.comstudy21.exam01;

import java.util.Random;
import java.util.Scanner;

public class HomeExam02 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main14(String[] args) {
		// 14.다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
//		그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. 
//		"그만"을 입력받으면 종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력)
//		과목 이름 >> Jaba
//		없는 과목입니다.
//		과목 이름 >> Java
//		Java의 점수는 95
//		과목 이름 >> 안드로이드
//		안드로이드의 점수는 55
//		과목 이름 >> 그만
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String name = "";
		int i = 0;
		while(true) {
			System.out.print("과목 이름 >> ");
			name = scan.next();
			if(name.equals("그만")) {
				break;
			}
			for(i =0; i<course.length; i++) {
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(course[i]+"의 점수는 "+n);
					break;
				}
				if(i==course.length-1) {
					System.out.println("없는 과목입니다.");
					
				}
			}
		}
		
		
	}
	public static void main13(String[] args) {
		// 13. 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 출력
		// 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
		// 3 박수 짝 ... 33 박수 짝짝
		int j = 1;
		for(j =1; j<100; j++) {
			if((j/10==3 || j/10==6 || j/10==9) && (j%10==3 || j%10==6 ||j%10==9)) // 33 -> 몫도 3 나머지도 3
		           System.out.println(j + " 박수짝짝");            
		    else if((j/10==3 || j/10==6 || j/10==9) || (j%10==3 || j%10==6 ||j%10==9)) // 23 -> 몫은 2거나 나머지는 3
		           System.out.println(j+" 박수짝");
		}
		 scan.close();
		
	}
	public static void main12(String[] args) {
		// 12. 다음과 같이 작동하는 Add.java를 작성하라. 
		// 명령행 인자 중에서 정수 만을 골라 합을 구하라.
		// 다음 화면은 Add.class 파일을 c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 
		// 원본 Add.class 파일은 이클립스 프로젝트 폴더 밑에 bin 폴더에 있다.
		
		
	}
	public static void main11(String[] args) {
		// 11. 명령행 인자는 모두 상수만 사용되며 정수들의 평균을 출력
		int sum = 0;
		int i = 0;
		// int i = Integer.parseInt("10"); // 문자열 -> 정수 변환 / 힌트
		for(i =0; i<args.length; i++) { // HomeWork04처럼 풀기, String[] args에서 받아옴, powershell로 보이기
			sum += Integer.parseInt(args[i]); // 문자열을 정수로 변환할 때 코드 이요			
		}
		System.out.println(sum/3);
	}
	
	public static void main10(String[] args) {
		// 10. 4 X 4의 2차원 배열을 만들고 1~10까지의 범위의 정수를 랜덤하게 생성
		// 임의의 위치에 삽입하시오. 동일한 정수 상관없음
		// 나머지 6개의 숫자는 모두 0이다. 만들어진 2채원 배열을 화면에 출력
		
	}
	
	public static void main09(String[] args) {
		// 9. 4 X 4의 2차원 배열을 만들고 1~10까지의 범위의 정수를 랜덤하게 생성
		// 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력
		int[][] num= new int[4][4];
		int i = 0;
		int j = 0;
		for(i =0; i<num.length; i++) {
			for(j = 0; j<num[i].length;j++) {
				int r = (int)(Math.random()*10 +1); // 1~10까지 랜덤하게 골라줍니다.
				num[i][j] =r; // num 배열에 랜덤 정수를 넣어줍니다.
			}
		}
		for(i =0; i<num.length; i++) {
			for(j = 0; j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static void main08(String[] args) {
		// 8. 정수를 몇개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수)
		// 정수 배열 생성하고, 1~100까지 범위의 정수 랜덤하게 삽입
		// 배열에는 같은 수 없도록 하고 배열 출력
		
		
	}
	
	public static void main07(String[] args) {
		// 7. 정수 10개 저장하는 배열 만들고 1~10까지 랜덤하게 배열 저장, 배열 숫자 평균구하기
		int[] num = new int[10];
		int sum = 0;
		int i = 0;
		for(i = 0; i<num.length; i++) {
			int r = (int)(Math.random()*10 +1); // 1~10까지 랜덤하게 골라줍니다.
			num[i] =r; // num 배열에 랜덤 정수를 넣어줍니다.
		}
		System.out.print("랜덤한 정수들 : ");
		for(i = 0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		for(i = 0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println();
		double avg = (double)sum/num.length; // 평균 = 다 더한 값/10
		System.out.println("평균은 "+avg);
		
	}
	public static void main06(String[] args) {
		// 6. 
		int[] unit={50000, 10000, 1000,500,100,50,10,1}; //환산할 돈의 종류
		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();  // 금액 입력
		int i = 0; // 변수
		for(i =0;i<unit.length;i++) { // unit 배열이 들어감
			if(money/unit[i] == 0) { // unit 안에 있는 것
				continue;
			}
			System.out.println(unit[i]+"원 짜리 : "+money/unit[i]+"개");
			money %= unit[i]; // 나머지값을 money에 다시 넣어줌
		}
		
	}
	public static void main05(String[] args) {
		// 5. 양의 정수 10개 입력받아 배열에 저장하고, 
		// 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라. 
		// 양의 정수 10개를 입력하시오 >> 1 5 99 22 345 154 2346 55 32 85
		// 3의 배수는 99 345 2346
		int [] arr = new int [10];
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();   // 정수 10개 받는 곳          
        }
		System.out.print("3의 배수는 >> ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i]+" ");
			}
        }
               
	}
	
	public static void main04(String[] args) {
		// 4. Scanner를 이용하여 소문자 알파벳을 하나 입력받고 
		// 다음과 같이 출력하는 프로그램을 작성하라. 다음은 e를 입력받았을 경우이다.
//		소문자 알파벳 하나를 입력하시오 >> e 
//		abcde 
//		abcd
//		abc
//		ab
//		a
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		String s = scan.next();
		char c = s.charAt(0);
		for(int i = 0; i<c-45; i++) {
			for(char j =0; j<(int)c-i; j++) {
				System.out.print(j); 
			}
			System.out.println(); 
		}
		
	}
	public static void main03(String[] args) {
		// 3. Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라. 
		// 다음은 5를 입력받았을 경우이다
		System.out.print("정수를 입력하시오 >> ");
		int num = scan.nextInt();
				
		for(int i=0; i<num; i++) { 
			for(int j=0; j<num-i; j++) { 
				System.out.print("*"); 
				} 
			System.out.println(); 
		}  
	
	}
	
	public static void main02(String[] args) {
		// 2. 다음 2차원 배열 n을 출력하는 프로그램을 작성하라
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}} ;
		for(int i=0; i<n.length; i++) { 
			for(int j=0; j<n[i].length; j++) { 
				System.out.print(n[i][j]+" "); 
			} 
			System.out.println(); 
		}
	}
	
	
	public static void main01(String[] args) {
		// 1. 다음 프로그램에 대해 물음에 답하라
		int sum=0, i=0; 
		while (i<100){ 
			sum=sum+i; 
			i+=2; 
		} 
		System.out.println(sum);
//		
		// (1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
		// 100보다 작은 짝수의 합, 2450
		
//		(2) 위의 코드를 main()메소드로 만들고 WhileTest 클래스로 완성하라.
//		public class WhileTest { 
//			public static void main(String[] args) { 
//				int sum=0, i=0; 
//				while(i<100) { 
//					sum=sum+i; 
//					i+=2; 
//				} 
//				System.out.println(sum); 
//				} 
//		}
		
//		(3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성하라.
//		for(i=0; i<100; i+=2) {
//			sum +=i;
//		}
//		System.out.println(sum);
		
//		(4) do-while 문을 이용하여 동일하게 실행되는 DowhileTest 클래스를 작성하라.
//		do{ 
//			sum=sum+i; 
//			i+=2; 
//		}while(i<100);
//		System.out.println(sum);
		
	}

}
