package day1215;

import java.io.IOException;
import java.util.Scanner;

public class WordGameApp {

	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		while (true) {
			System.out.println("끝말잇기 게임을 시작합니다...");
			System.out.print("게임에 참가하는 인원은 몇명입니까 >>");
			int num = getNum();

			// player 수 유효성 체크
			while (num <= 1) {
				System.out.println("1보다 큰수를 입력해 주세요 ");
				System.out.print("게임에 참가하는 인원은 몇명입니까 >>");
				num = getNum();
			}

			// player 객체 생성하고 초기화하는 player()함수
			Player[] player = player(num);
			
			// 끝말잇기 게임 시작
			run(player);

			// 게임을 다시 시작할지 종료할지 정하는 reGame() 함수
			if (!reGame()) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
	// 플레이어 수를 입력받아 객체 생성후 초기화하여 객체배열 player를 반환하는 함수
	static Player[] player(int num) {
		Player[] player = new Player[num];
		
		// 빈 객체 배열을 각각의 이름을 갖는 객체로 초기화
		for (int i = 0; i < player.length; i++) {
		System.out.print("참가자의 이름을 입력하세요 >> ");
		player[i] = new Player(sc.next());
					}
		return player;
	}
	
	static void run(Player player[]) {
		// 시작 제시어 초기화
		String prevword = "아버지";
		// 입력받을 문자 빈값으로 초기화
		String userword = "";
		System.out.printf("시작하는 단어는 %s 입니다. \n", prevword);
		// player 배열의 인덱스를 나타낼 변수 i 선언
		int i = 0;

		while (true) {
			// getName() 메서드를 사용하여 player name 반환
			System.out.printf("%s >> ", player[i].getName());
			// 콘솔창에 입력한 단어를 userword에 저장
			userword = sc.next();
			// userword를 player[i]번째 객체의 word 변수에 저장
			player[i].setWord(userword);

			// boolean 변수 result를 선언하여 player[i]가 입력한 단어가
			// 제대로 입력되었는지 판단하는 checkSuccess()메서드의 반환값을 저장.
			// 정상값 입력 : true, 잘못입력 : false
			boolean result = player[i].checkSuccess(prevword);

			// result == false 이면 잘못입력으로 player가 졌다는 메세지와 게임 종료
			if (!result) {
				System.out.printf("%s이 졌습니다.\n", player[i].getName());
				break;
			}
			// 다음 player가 단어를 입력하기 전에 다음 제시어로 저장
			prevword = player[i].getWordFromUser();

			// player 배열 객체의 갯수와 같을경우 마지막 플레이어이므로 다시 0번째
			// player로 돌아가도록 삼항연산자 사용하여 i값(index값) 초기화
			i = (i == player.length - 1) ? 0 : i + 1;
		}
	}

	// 숫자를 입력받기위한 getNum();
	static int getNum() {
		int num = 0; //
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') { // \n (줄바꿈) 이 아닐 때
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
		}
		return num;
	}

	static boolean reGame() {
		System.out.print("계속 하시겠습니다?(y/n) >> ");
		char isLoop = sc.next().charAt(0);

		// isLoop값이 'n' or 'y' 만을 받기 위한 유효성 검사
		while (!(isLoop == 'n' || isLoop == 'y')) {
			System.out.println("y또는 n만 입력하세요!");
			System.out.print("계속 하시겠습니다?(y/n) >> ");
			isLoop = sc.next().charAt(0);
		}

		// 재시작('y) true, 종료('n') false
		if (isLoop == 'n') {
			return false;
		} else {
			return true;
		}
	}
}
