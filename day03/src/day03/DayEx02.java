package day03;

import java.io.IOException;
import java.util.Scanner;

public class DayEx02 {
	static Scanner scan = new Scanner(System.in);
	
	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while((ch=System.in.read())!='\n') {
				if(ch>='0' && ch<='9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) { }
		return num;
	}
	
	public static int compare(int a, int b) {
		if(a==b) {
			return 0;
		} else if(a<b) {
			return 1;
		} else {
			return -1;
		}
	}
	
	static void status(int cnt) {
		// 맞추고 나온건가? cnt가 다 되어서 나온건가?
		// cnt가 0이 아니면 맞추고 나온것 0이면 그냥 실격!
		if(cnt == 0) {
			System.out.println("기회를 모두 소진 했다. 실격!");
		} else {
			System.out.println("빙고!");
		}
	}
	
	static int getUserNum(int min, int max) {
		System.out.printf("사용자 입력(%d~%d사이) >>", min, max);
		int userNum = getNum();
		while(userNum<min || userNum>max) { // 1보다 작거나 100보다 큰 경우
			System.out.println("입력 범위를 벗어 났습니다!");
			System.out.printf("다시 입력(%d~%d사이) >>", min, max);
			userNum = getNum();
		}
		return userNum;
	}
	
	public static void game() {
		// 컴퓨터가 1~100사이의 랜덤한 숫자(난수) 선택 선택
		// 사용자가 5회 안에 맞추기
		int min=1, max=100;
		int cnt = 5; // 횟수 제한
		int sysNum = (int)(min + Math.random()*max); // 컴퓨터가 정한 랜덤 숫자
		System.out.println("시스템이 난수를 선택 했습니다.("+sysNum+")");
		
		while(cnt>0) {
			// 사용자가 입력 받아서 비교하기
			System.out.println("남은 시도 횟수 : " + cnt);
			int userNum = getUserNum(min, max);
			int result = compare(sysNum, userNum);
			if(result == 0) { // 랜덤 숫자 == 사용자 입력 숫자
				break;
			}
			if(result==1) {  // 랜덤 숫자 < 사용자 입력 숫자
				// 너무 큰숫자 -> max의 범위 변경
				System.out.println("너무 큰 숫자입니다!");
				max = userNum  -1;
			} else {  // 랜덤 숫자 > 사용자 입력 숫자
				System.out.println("너무 작은 숫자입니다!");
				min = userNum  +1;
			}
			cnt--; // 횟수가 점점 사라지는 거 확인 
		} 
		status(cnt); // static void status(int cnt) 로 가서 횟수에 따른 println 내용
	}

	public static void main(String[] args) {
		// 높다 낮다 게임(카드 맞추기)
		// 재시도 가능하게 구현
		// --- 입력 된 숫자가 맞나? 틀리나? 판별
		// --- 맞으면 빙고, 틀리면 작다/크다를 출력
		while(true) { // 게임 반복
			System.out.println("--- 게임 시작 ---");
			game();
			System.out.print("계속 하시겠습니까?(y/n) >> ");
			char isLoop = scan.next().charAt(0);
			while(!(isLoop == 'n' || isLoop == 'y'|| isLoop == 'Y' || isLoop == 'N')) { // n,y,N,Y가 적히지 않은 경우
				System.out.println("y또는 n만 입력하세요!");
				System.out.print("계속 하시겠습니까?(y/n) >> ");
				isLoop = scan.next().charAt(0);
			}
			if(isLoop == 'n'|| isLoop == 'N') { // n,N이 적힌 경우
				break;
			}
		}
		System.out.println("수고했습니다!!!"); // 게임 종료할 때 나오는 내용
	}
}