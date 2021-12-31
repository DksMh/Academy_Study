package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex6_Wh {
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
		while(!(1<=day && (day <= days[month-1]))) { 
			System.out.println("해당 월에 잘못된 일을 적었습니다.");
			System.out.print("다시 일 입력>>> ");
			day = scan.nextInt();			
		}
		
		// 과제2 : 1월 1일부터 입력받은 월/일까지 몇일이 자났습니다.
		total = day; // 입력받은 일로 넣는게 수월함. 4월 5일이면 4일이 지나고 1~3은 싹 더해주면 되니까
		for(int i = 0; i<month-1; i++) {
			total += days[i];
		}
		System.out.printf("1월 1일부터 %d월 %d일까지는 %d일이 지났다.\n", month,day,total);
		
		// 과제2 : 0월 0일부터 1년의 남은 날짜는 00일입니다.
		// 365-total 빼기 금지
		// 예시 : 11/30~12/31=> 31
		int day2 = days[month-1] - day; // 30 - 30 = 0;
		for(int i = month; i < 12; i++) { // month = 11
			day2 = days[i]+day2; // days[11]=> 31 + 0;
		}
		System.out.printf("%d월 %d일 부터 1년의 남은 날은 %d일입니다\n", month, day, day2);
		
		// 과제3 : 입력한 월/일의 100일 후의 날짜 출력
		// 예시 1월 2일을 넣으면 100일 후는 4/12		
		int day3 = day;
		int month3 = month;
		
		for(int i=0; i<100; i++) { // 0~99
			day3 += 1; // 날이 100번 더해진다. -> 그럼 월이 바뀐다. 			
			if(day3>=days[month-1]) { // 31>=31  // -> 월도 +1을 해야한다. + day도 다시 1일 되어야한다(1/31->2/1)
				month3 += 1;
				day3 = 1;
				if(month3>12) { // 그런데 month3이 마지막 12월이 넘어가면
					month3 = 1;  // 다시 1월로 바뀌어야한다.
				}
			}
		}		
		System.out.printf("%d월 %d일의 100일 후의 날짜는 %d월 %d일입니다\n", month, day, month3, day3);
		System.out.println();
		
		// 과제4 : 확장해보기 - 100일 후의 날짜를 200일 300일 특정 날수 적용되게 하세요.
		// 예시 1월 2일 200일 후 07월21일
		System.out.print("몇 일 후까지를 알고 싶나요? >>");
		int cnt = scan.nextInt();
		int day4  = day;
		int month4 = month;
		for(int i = 0; i < cnt; i++) {
			day4 += 1;
			if(day4 > days[month4-1]){ // 32 > 31
				month4++;
				day4 = 1;
				if(month4>12) {
					month4 =1;
				}
			}
		}
		System.out.printf("%d월 %d일부터 %d일 후는 %d월 %d일 입니다.\n",month, day, cnt, month4, day4);		
		
		
	}
}
