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
public class Day10Ex01 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int money = 0;
		int price = 240;
		out.printf("물건 값이 %d원입니다.\n",240);
		out.print("현금 입력 : ");
		money = scan.nextInt();
		
		// 반복문
		money = money - price;
		int[] cash = {5000,1000,500,100,50,10};
		
		for(int i = 0;i<cash.length;i++)
		{
			out.println(cash[i]+" 원권 : "+money/cash[i] +"개 ");
			money %= cash[i]; 
			// money =  money / cash[i] 의 나머지를 넣어 마지막까지 나올 수 있게 만든다.
		}
		
	}

}
