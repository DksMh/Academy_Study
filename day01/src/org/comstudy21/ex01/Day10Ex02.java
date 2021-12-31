package org.comstudy21.ex01;

import java.util.Scanner;
import static java.lang.System.out;
//다음과 같이 출력되도록 구현하세요(반복문 사용가능)
	// 10000원을 입력받았다면
	// 5000원권 1개
	// 1000원권 4개
	// 500원권 1개
	// 100원권 2개
	// 50원권 1개
	// 10원권 1개
public class Day10Ex02 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int money = 0;
		int price = 240;
		out.printf("물건 값이 %d원입니다.\n",240);
		out.print("현금 입력 : ");
		money = scan.nextInt();
		
		// 반복문
//		int ch = 0;
//		int[] cash = {5000, 1000, 500, 100, 50, 10};	
//		
//		for (int i = 0; i < cash.length; i++) {
//			if (i == 0) {
//				money -= price;
//			}
//			ch = money / cash[i]; 
//			System.out.println(cash[i] + "원권 " + ch + " 개 필요합니다.");
//			money = money % cash[i];
//		}
		
		// 반복문 B)	
		money = money - price;

		int[] cash = {5000,1000,500,100,50,10};
		
		for(int i = 0;i<cash.length;i++)
		{
			out.println(cash[i]+" 원권 : "+money/cash[i] +"개 ");
			money %= cash[i]; // money =  money / cash[i] 의 나머지를 넣어 마지막까지 나올 수 있게 만든다.
		}
//		
		// 반복문 C)
//		money = money - price; // 10000 = 10000 - 240
//		int[] cash = {5000, 1000, 500, 100, 50, 10};	
//		for(int i = 0; i<cash.length; i++) {
//			if(money >= cash[i]) {
//				System.out.printf("%d원 %d개 \n",cash[i],money/cash[i]);
//				money %= cash[i];
//			}
//		}
//		
		// 반복문 D)
//		int change = money - price;
//		int[] arr = {5000, 1000, 500, 100, 50, 10};
//		for (int i = 0; i < arr.length; i++) {
//			if (change / arr[i] > 0) {
//				System.out.println(arr[i] + "원권 " + change / arr[i] + "개");
//				change %= arr[i]; // money - price(10000-240) % 5000 = 나머지가 계속 나와야 10원까지 갈 수 있음
//			}
//		}
			
		// 반복문을 사용하지 않은 혼자 해본 코드
//		int m_5000 = (money-240)/5000;
//		System.out.println("5000원권 : "+m_5000+"개");
//		int m_1000 = (money-240-5000)/1000;
//		System.out.println("1000원권 : "+m_1000+"개");
//		int m_500 = ((money-240-5000)%1000)/500;
//		System.out.println("500원권 : "+m_500+"개");
//		int m_100 = (((money-240-5000)%1000)%500)/100;
//		System.out.println("100원권 : "+m_100+"개");
//		int m_50 = ((((money-240-5000)%1000)%500)%100)/50;
//		System.out.println("50원권 : "+m_50+"개");
//		int m_10 = (((((money-240-5000)%1000)%500)%100)%50)/10;
//		System.out.println("10원권 : "+m_10+"개");
//		
		// 그냥 한 거
//		if(money==10000) {
//			out.println("5000원 : 1");
//			out.println("1000원 : 4");
//			out.println("500원 : 1");
//			out.println("100원 : 2");
//			out.println("50원 : 1");
//			out.println("10원 : 1");
//		}else {
//			out.println("만원을 다시 넣어주세요");
//		}
		
		
	}

}

		