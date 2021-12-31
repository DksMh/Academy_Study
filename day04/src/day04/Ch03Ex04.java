package day04;
import static java.lang.System.out;
import java.util.Scanner;


public class Ch03Ex04 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 과제2: 시작단, 종료단 기능과 함께 나오시오.
		// main03 참조
		int startDan = 2;
		int endDan = 9;
	
		System.out.printf("시작단 입력>>");
		startDan = scan.nextInt();
		System.out.printf("종료단 입력>>");
		endDan = scan.nextInt();		
		if(startDan>endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}	
		
		for (int dan = startDan; dan <= endDan; dan +=3) {  // == int dan = startDan; dan < endDan; dan +=3
			for (int title = 0; title < 3 && dan+title<=endDan; title++) { // == for (int title = 0; title < 3; title++)
				if (dan + title <= endDan) // == dan + title < endDan+1
					System.out.printf("---%d---\t", dan + title);
			}
			System.out.println();
			
			for (int cnt = 1; cnt <= 9; cnt++) {
				for (int i = 0; i < 3 && dan+i<=endDan; i++) { // == (int i = 0; i < 3; i++
					if (dan + i <= endDan) { // ==dan + i < endDan + 1
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				System.out.println();

			}
			System.out.println();
		}
	}
	public static void main05(String[] args) {
		
		// 과제1: 3행 3열로 구구단 출력
		for(int dan=2; dan<10; dan+=3) { // 3단찍고 밑으로 내려감		
			// 구구단 제목
			for (int title = 0; title < 3; title++) {
				if (dan + title != 10)
					System.out.printf("---%d---\t\t", dan + title);
			}
			System.out.println();
			
			// 구구단
			for(int cnt = 1; cnt<10; cnt++) { // 옆으로 계속 찍는 거 행 콘솔은 옆으로 찍힙니다 그 점을 유의
				for(int i = 0; i<3; i++) { 
					if(dan+i!= 10) {
					System.out.printf("%d * %d = %d\t", dan+i, cnt, (dan+i)*cnt);
					}
				}
				System.out.println();
			}
		}
			
	}
		
	
	public static void main04(String[] args) {
		// 3행 3열로 몇단인지 알수 있게 만들기
		for(int dan =2; dan<=9; dan+=3) { // dan+=3 3개씩 뛰어넘어 234/345/567 안나오고 // 234/567 나오게
			for(int i = 0; i<3; i++) {
				if(dan+i != 10) { // 10단 안나오게 만들기
					out.printf("***%d***\t",dan+i);
				}
				
			}			
			System.out.println();
		}
		
	}
	
//	static 타입 getDan(시작단 입력>> 은 문자열 데이터 이걸 호출 / 변수는 식별자라(자기가 원하는거)) {}
	static int getDan(String message) {
		out.printf(message);
		int dan = scan.nextInt();
		// 유효성 검사
		while(dan<2 || dan>9) {
			out.println("입력범위를 초과했습니다.");
			out.printf(message);
			dan = scan.nextInt();
		}
		return dan; // return되는 건 int라 0도 되고 100도 되고 1.1은 double이라 안되는데 (int)1.1은 됨
	}
	public static void main03(String[] args) {
		int startDan = 2;
		int endDan = 9;
		
		// 시작단이 종료단보다 큰 숫자여도 정상 출력 되도록 완성하시오 
			// startDan이나 endDan 중 하나를 받아줄 다른 변수가 필요하다 그릇 3개가 필요하단 소리
		startDan = getDan("시작단 입력 >>"); 
		endDan = getDan("시작단 입력 >>");
		// 시작단이 종료단 보다 큰 숫자여도 정상 출력되도록 완성하시오
		if(startDan>endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}		
		// 혼자 한거
		out.printf("시작단 입력 >>"); 
		startDan = scan.nextInt();
		out.print("종료단 입력 >>");
		endDan = scan.nextInt();		
		int midDan = 0;
		if(startDan>endDan) {
			midDan = startDan;
			startDan = endDan;
			endDan = midDan;
		}	
		for(int dan=startDan; dan<=endDan; dan++) {
			out.printf("*****%d*****\n",dan);
			for(int cnt = 1; cnt<=9; cnt++) {
				out.printf("%d * %d = %d\n", dan, cnt, dan*cnt);
			}
		}
		
	}
	
	public static void main02(String[] args) {
		// 2중 for문 실행 전에 제목이 한줄로 출력되도록 한다
		for(int title=2; title<=9; title++) { // 제목 먼저 출력
			System.out.printf("***%d***\t\t",title);
		}
		System.out.println();
		for(int cnt = 1; cnt<=9; cnt+= 1) { // 서로 바꿔서
			for(int dan = 2; dan<=9; dan+=1) {
				out.printf("%d * %d = %d\t", dan, cnt, dan*cnt); // 2*1 3*1 .... 9*1 // println으로 줄바꿈
			}													 // 2*2 3*2 .... 9*2
			System.out.println();
		}
	}
	public static void main01(String[] args) {
		// 구구단 출력 프로그램.
		// 2단 ~ 9단까지 출력하는 프로그램 구현 
		
		for(int dan = 2; dan<=9; dan++) {
			System.out.printf("----%d단----\n",dan);
			for(int cnt = 1; cnt<=9; cnt++) {
				out.printf("%d * %d = %d\n", dan, cnt, dan*cnt);
			}
		}
		
//		for(int i = 2; i<10; i++) {  // 옆으로 주르륵
//			System.out.println(i+"단");
//			for(int j = 1; j<10; j++) { 
//				System.out.print(i+"*"+j+"="+(i*j)+" ");
//			}
//			System.out.println();
//		}
	
//		for(int i = 2; i<10; i++) { // 밑으로 주르륵
//			System.out.printf("----%d단----\n",i);
//			for(int j = 1; j<10; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}

	}

}
