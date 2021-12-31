package day04;

public class Ex02 {
	public static void main(String[] args) {
			
		for(int i =2; i <= 9; i++) { // 단
			for(int j = 1; j <=9; j++) { // 곱
				if(j >= 3)
				{	
					i = 10; // 일부로 i <= 9  조건식  false가 되는 임의의 값으로 설정
					break; // #1 위치로 탈출
				}	
				System.out.print((i * j) + " ");
			} //#1
			System.out.println(","); // 줄바꿈
		}
		System.out.println(); 

	}
}
