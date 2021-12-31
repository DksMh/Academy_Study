package org.comstudy21.exam01;
import java.util.Random;
import java.util.Scanner;

public class HomeExam01 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		while 반복문(이중 반복문), if문, Scanner로 실전응용 연습		
		while(true) { // 1번째 while // Random 함수가 계속 안에서 빙빙 돌게 만듭니다.
			Random r = new Random();
			int k = r.nextInt(100);  // 0 ~ 99 까지 임의의 정수 생성
			int i = 1; // i번째를 확인하기 위해 설정해준 것, 1을 초기값으로 했습니다.
			System.out.println("0~99까지 수를 결정하였습니다. 게임을 시작합니다.");
			while(true) { // 2번째 while // 게임 나가기에서 num을 사용하기 전까지는 계속 반복합니다.
				System.out.print(i + " >> "); // i번째 넣는 유저값(num)을 >> 뒤에 나오도록 만듭니다.
				int num = scan.nextInt(); // 사용자가 넣은 숫자
				while(num!=k) { // 3번째 while // 정답이 아닌 상황
					if(num<k) { // num(유저 답)이 정답보다 작은 경우
						System.out.println("더 높게");
						i++;}
					else if(num>k) { //num(유저 답)이 정답보다 큰 경우
                        System.out.println("더 작게");
                        i++;}
					else {} 
					break; // 정답이 아닌 상황을 나가는 break;
				}
				if(num==k) { //사용자가 정답을 맞췄다면
                    System.out.println("찾았어요!");
                    System.out.println("다시하시겠습니까? (y/n) >>");
					if(scan.next().equals("y")) {
						break;
					} else if(scan.next().equals("n")) {
						System.out.println("종료합니다.");
					}
				}
			
			}
		} 
	}

}
