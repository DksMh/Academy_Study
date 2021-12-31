package day10Exam01;

import static java.lang.System.out;

import java.util.Scanner;

public class Exam01_1 {
	
	public static void main(String[] args) {
		// 가위바위보 게임입니다. 가위,바위, 보 중에서 입력하세요
		// 철수 >> 가위
		// 영희 >> 보
		// 철수가 이겼습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위,바위, 보 중에서 입력하세요");
		System.out.print("철수>> ");
		String p1 = sc.next();
		System.out.print("영희>> ");
		String p2 = sc.next();
		
		
		if(p1.equals("가위") && p2.equals("바위")) {
			System.out.println("영희가 이겼습니다.");
		}
		else if(p1.equals("바위") && p2.equals("보")) {
			System.out.println("영희가 이겼습니다.");
		}
		else if(p1.equals("보") && p2.equals("가위")) {
			System.out.println("영희가 이겼습니다.");
		}
		else if(p1.equals(p2)) {
			System.out.println("서로 비겼습니다.");
		}else {
			System.out.println("철수가 이겼습니다.");
		}
		
		sc.close();
		
	}

}
