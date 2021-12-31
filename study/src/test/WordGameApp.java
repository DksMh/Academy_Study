package test;

import java.util.Scanner;
// 1. 처음에 플레이어 클래스 만들기
// 2. 플레이어 클래스 멤버 변수 및 메서드 정의하기
// 3. 이름 입력 - 반복문 사용
// 4. 게임 시작하고 단어 입력 - 무한루프(while) 탈출 조건 생각해서 break;
//	- while 문 안에서 해야할 것
//	단어비교 - 메서드 사용
// 	이전 단어 최신화
//	배열 인덱스가 초과되면 에러니까 다시 0부터 player수 -1이면 다시 0 처음에 비교? 마지막 비교? => 난 마지막비교


public class WordGameApp {
	static Scanner sc = new Scanner(System.in);
			
	public static void run() {
		
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참가하는 인원은 몇명입니까? >>> ");
		int num = sc.nextInt(); // 인원 받기
		Player[] player = new Player[num];
		
		// 사람 이름 넣기
		for(int i=0; i<num; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			player[i] = new Player(sc.next());
			System.out.println(player[i].name);
		}
		
//		for(int i = 0; i<num; i++) {
//			System.out.println("참가자의 이름을 입력하세요");
//			Player p1 = new Player(sc.next()); 
//			// 객체 p1 에 계속 값을 넣어 초기화됨 그래서 안됨
//		}
		String prevword = "아버지";
		System.out.printf("시작하는 단어는 %s입니다\n",prevword);
		// 단어 입력하기
		int i = 0;
		while(true) {
			System.out.printf("%s >> ", player[i].name); // 누가 적는지 봐여줘
			player[i].word = sc.next();
			
			// 정확하게 썼는지 확인하기 -> 게임 종료
			if(!player[i].checkSuccess(prevword)) { // if문은 참일 때 도니까 !을 넣어준거임
				System.out.printf("%s가 졌습니다.", player[i].name);
				break;
			}
			// 지우개 로 바뀌게 --> loop가 끝나기 전에 말한 거로
			prevword = player[i].word;
			
			// 사람 수 만큼 돌아야해서 i값 변경
			if(i>=player.length-1) { // 2일 때 변경되어야 함 3으로 하면 위로 올라가면 3으로 값이 없어짐
				i = 0; // i가 초기값 i가 ++되면 사람수보다 많아지니까 해주는것
			}else {
				i++;
			}
			
		}
		System.out.println("게임종료!");
	}
	public static void main(String[] args) {
		run();
	}
	
}
