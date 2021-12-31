package Day01_homework;

import java.util.Scanner;

public class Homework01 {

	public static void println(String s) {
		System.out.println(s);
	}
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 간단한 방법
//		int price = 240;
//		int money = 10000;
		
		// 사용자가 입력하는 방법
		System.out.print("물건 값을 입력하세요 : "); //560원 넣기
		int price = scan.nextInt();
		System.out.print("받은 돈을 입력하세요 : "); //560원 넣기
		int money = scan.nextInt();
		
		// 받을 돈 조건 // &&(AND)가 높으므로 ||는 ()해주기
		while(!(money>price && (money == 50000 || money == 10000 || money ==5000 || money ==1000|| money ==500|| money ==100|| money ==50))){  
			// 아니면을 보여줘야하니까 ! 앞에 붙여주기
			println("잘못된 입력입니다.");
			System.out.println("받은 돈 다시 입력 : ");
			money = scan.nextInt();
			
		}
		int carry = money - price;
		
		System.out.println("지불한 돈 => "+money);
		System.out.println("거스름 돈 => "+carry);
		int num = 2;
		switch(money){
		case 50000: case 5000: case 500: case 50: num = 5;  //이것만 5로 나누면 됨 나머지는 초기화 2로 하면되서 안해도 됨			
		}
		for(;money>10;) { // 10월까지만 쓰니까 >10
			money /= num; 
			println(money+"원 짜리 " +(carry/money)+"개");
			carry = carry % money;
			num = num == 2 ? 5 : 2; // 2이면 5넣고 아님 2넣어
		}
		
//		for(;money>10;) { // 10월까지만 쓰니까 >10
//			money /= 2; // 10000 / 2 = 5000
//			println("money =>" +money);
//			money /= 5; // 5000 / 5 = 1000
//			println("money =>" +money);
//		}
		
		
	}
	
	
	public static void main01(String[] args) {
		int price = 240;
		int money = 10000;
		int carry = money - price;
		
		System.out.println("거스름 돈 => "+carry); // 9760
		// ----------------------------------------------
		int ea5000 = carry / 5000; // 9760/5000 -> 1개
		println("5000원 짜리 "+ea5000+"개"); // 5 ~ 7줄짜리로 println 쓸 수 있음
		
		carry = carry % 5000; // 9760%5000 -> 1 -----4760 (나머지)
		println("남은 돈 => "+carry);
		// ----------------------------------------------
		int ea1000 = carry/1000;
		println("1000원 짜리 "+ea1000+"개"); 
		
		carry = carry % 1000;
		println("남은 돈 => "+carry);
		// ----------------------------------------------
		int ea500 = carry/500;
		println("500원 짜리 "+ea500+"개"); 
		
		carry = carry % 500;
		println("남은 돈 => "+carry);
		// ----------------------------------------------
		int ea100 = carry/100;
		println("100원 짜리 "+ea100+"개"); 
		
		carry = carry % 100;
		println("남은 돈 => "+carry);
		// ----------------------------------------------
		int ea50 = carry/50;
		println("50원 짜리 "+ea50+"개"); 
		
		carry = carry % 50;
		println("남은 돈 => "+carry);
		// ----------------------------------------------
		int ea10 = carry/10;
		println("10원 짜리 "+ea10+"개"); 
		
		carry = carry % 10;
		println("남은 돈 => "+carry);
		
		
	}

}
