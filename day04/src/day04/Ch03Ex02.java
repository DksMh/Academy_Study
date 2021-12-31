package day04;

import java.util.Scanner;

public class Ch03Ex02 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 단어를 입력 받는 프로그램 구현
		// "끝"이 입력될 때까지 단어를 계속 입력받는다
		// 입력된 단어들 중에서 가장 긴 단어를 출력한 프로그램을 while문을 이용해서 구현하라.
		// "끝"이 입력될 때까지 단어 입력 받기
		String newWord = ""; // 제일 짧은 단어 넣어주기
		System.out.println("단어를 연속해서 입력하라 (종료: 끝 입력) >> ");
		System.out.print("압력 >>");
		String word = scan.next();
		while(!word.equals("끝")) { // 끝이 아닐 때는 반복
			if(word.length() > newWord.length()) {
				newWord = word;
			}
			word = scan.next();
		}
		System.out.println("입력 완료!");
		System.out.println(newWord);
		
	}
	
	
	public static void main01(String[] args) {
		// 여러개의 정수를 입력한다. 끝내려면 -1을 입력받는다
		// -1이 입력되기 전까지 숫자를 계속 입력 받는 프로그램.
		// -1을 제외한 숫자들의 평균을 출력한다.
			// 총점, count 필요 -> avg = 총점 / count		
		int total = 0;
		int count = 0;
		double avg = 0.0;
		System.out.println("-1이 입력될 때까지 연속적으로 숫자 입력 받기");
		System.out.print("슷자를 입력하세요 >>");
		int num = scan.nextInt();
		while(num != -1) {
			System.out.print("슷자를 입력하세요 >>");
			count ++;
			total += num;
			num = scan.nextInt(); // -1이 아니면 계속 입력 받도록 만듬
		}
		System.out.println("입력 끝");
		
		avg = (double)total / (double)count; // 형 변환, avg가 double이니까 							
		System.out.printf("정수의 개수는 %d이며 평균은 %.1f입니다\n",count,avg);
	}

}
