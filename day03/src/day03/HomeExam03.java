package day03;
import java.util.Scanner;

class Player { // Player 클래스 만들기
	private String name;	
	
	public String getName() { // 값을 얻는 get() 메서드 / private 변수 name에 접근해 값을 가져옴
        return name;
    }	
	public void setName(String name) { // 값을 지정하는 set()메서드 / private 변수에 접근해 값을 지정하는 public set() 메서드
        this.name = name;
    }
}

public class HomeExam03 {
	public static Scanner scan = new Scanner(System.in); // 사용자에게 정보 입력받기
	public static void main(String[] args) {
		// n명이 참가하는 끝말잇기 게임을 만들어보자.		
		System.out.println("끝말잇기 게임을 시작합니다..");
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int p_num = scan.nextInt(); // 참가하는 인원 적기		
		
		Player[] player = new Player[p_num]; // 참가자 수만큼 객체만들기
		
		for(int i= 0; i<player.length;i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name = scan.next(); // 이름 적기
			player[i] = new Player(); // 배열 원소 객체 생성 
			player[i].setName(name); // setName() 메서드를 활용해 private 변수에 접근가능
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		String word = "아버지";
		boolean j = true; // true 일땐 게임 반복, flase가 되면 게임 종료
		
		while(j) {
			for(int i= 0; i<player.length;i++) {
				System.out.print(player[i].getName()+">> "); // 참가자 이름을 가져옴(get) >> 참가자가 적은 단어
				String word2 = scan.next(); // 참가자가 지금 단어 적기 
				int lastIndex = word.length()-1; // 마지막 문제에 대한 인덱스 // -> 아버지
				char lastChar = word.charAt(lastIndex); // 마지막 문자 // EX) 지
				char firstChar = word2.charAt(0); // 첫번째 문자 // word2 참가자가 적은 단어
				
				if(firstChar==lastChar) { // 첫번째 문자 (지/ 우개) == 마지막 문자 (아버 /지)
                    word = word2;  
                }else {
                    System.out.println("이런, "+player[i].getName()+"가 졌습니다.");
                    j = false; // boolean을 이용해 게임종료시킴
                    break; // 반복문 while을 빠져나간다.
                }
				
			}
			
		}		
		
	}

}
