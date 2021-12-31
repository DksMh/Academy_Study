package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex06 {

	public static void main_note(String[] args) {
		// 1차원 배열
		// 배열이란?
		
		// 자바의 배열선언 중괄호 {} 사용.
		// 배열은 타입이 배열 타입
		// 배열 오브젝트이다.
		
		// 스트링 배열 타입 - 특정타입에 브라켓츠를 붙이면 배열 타입된다.
		String[] a;
		
		// 인트 배열 타입
		int[] b;
		// char 2바이트이지만 모든 배열의 참조변수는 정수를 저장하는 4바이트이다.
		// 참조값은 모두 정수이다.
		// 배열도 오브젝트이므로 변수는 참조변수가 된다.
		char[] c; 

	}
	public static void main00(String[] args) {
		// 배열을 선언과 동시에 초기화 하기
		// 배열의 리터럴
		int[] arr = {10,20,30,40}; 
		// arr-> 점수 배열형 (스택) --> 힙에 4바이트가 만들어짐
		// arr == arr[0] // 0번지의 주소
		
		// 배열 출력
		System.out.println(Arrays.toString(arr));
		
		// 반복문을 이용해서 배열 출력
		// 배열의 첫번째 요소의 첨자는 0이고 
		// 배열의 마지막 요소의 첨자는 배열 크기-1이다
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("arr[arr.length-1] ====> "+arr[arr.length-1]);
		
	}
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 날짜 연습용이 아닌 배열 연습용 예제
		int[] days;
		// 배열 선언 후에 배열을 대입하기 - new 연산자를 사용해야한다.
		days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("1년은 %d개월입니다.\n",days.length);
		
		System.out.print("월 입력 >>");
		int month = scan.nextInt();
		int total = 0;
		
		// 입력된 월의 날짜가 몇일까지인지 출력하라.
		// 1년 365일입니다. (days의 모든 날짜를 total에 누적해서 출력한다.)
		// day[1] ==== 2월의 날짜수
//		days[month-1] => 입력받은 월의 날짜
		System.out.printf("%d월은 %d일까지 입니다.\n", month, days[month-1] );
		for(int i=0; i<days.length; i++) {
			total = total+days[i];
		}
		System.out.printf("1년은 %d일입니다\n",total);
		
		// 날짜 입력
		System.out.print("일 입력 >>");
		int day= scan.nextInt();
		// 과제1 : 날짜 입력 유효성 체크 구현
		
		// 과제2 : 1월 1일부터 입력받은 월/일까지 몇일이 자났습니다.
		total = day; // 입력받은 일로 넣는게 수월함. 4월 5일이면 4일이 지나고 1~3은 싹 더해주면 되니까
		for(int i = 0; i<month-1; i++) {
			total += days[i];
		}
		System.out.printf("1월 1일부터 %d월 %d일까지는 %d일이 지났다.\n", month,day,total);
		
		// 과제2 : 0월 0일부터 1년의 남은 날짜는 00일입니다.
		// 365-total 빼기 금지
		total =0;
		
		// 과제3 : 입력 월/일의 100일 후의 날짜 출력
		
		// 과제4 : 확장해보기 - 100일 후의 날짜를 200일 300일 특정 날수 적용되게 하세요.
		
		
		// 함수의 인자로 배열을 생성과 동시에 전달할때 사용.
//		main00(new String[] {"aa","bb","ccc"});
		
	}
	
	

}
