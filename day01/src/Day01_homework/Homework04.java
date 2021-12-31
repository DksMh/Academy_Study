package Day01_homework;

import java.util.Scanner;

public class Homework04 {

	public static void println(String s) {
		System.out.println(s);
	}
	public static final Scanner scan = new Scanner(System.in);
	public static final String 가위 = "가위"; // 상수로 만들기
	public static final String 바위 = "바위";
	public static final String 보 = "보";	
	
	public static String getUserWord(String user) {
		// 가위바위보 게임
		String var = ""; // 지역변수는 초기화를 해줘야한다. 
		do{
			System.out.println("가위,바위,보 중에 입력하세요");
			System.out.printf("%s >> ", user);
			var = scan.next();
		}while(!(var.equals(가위) || var.equals(바위) || var.equals(보)));
		return var;
	} // end of getUserWord
	
	public static void game(String user1Name, String user2Name) {
		String user1 = getUserWord(user1Name);
		String user2 = getUserWord(user2Name);
		
		if(user1.equals(user2)) {
			System.out.println("비겼습니다!");
			return;
		}
		
		String win = "";
		switch(user1) { 
		case 가위: win = user2.equals(바위)? user2Name:user1Name; break;
		case 바위: win = user2.equals(보)? user2Name:user1Name; break;
		case 보: win = user2.equals(가위)? user2Name:user1Name; break;
		}
		System.out.println(win+"이가 이겼습니다.");
	} 
	
	
	public static void main(String[] args) {
		if(args == null || args.length == 0) {
			System.out.println("arguments가 없습니다.");
			return;
		}
		while(args[0]!=null && args[1]!=null) {
			game(args[0],args[1]);
			System.out.println("계속하시겠습니까?(Y/N) >>");
			char isLoop = scan.next().charAt(0);
//			자바 Scanner는 문자를 입력받는 기능이 없다.
//			즉, Scanner.next()로 문자열을 입력받은 다음, String.charAt(0)으로 첫번째 문자를 꺼내오면 된다
			while(!(isLoop == 'n' || isLoop == 'y'|| isLoop == 'Y' || isLoop == 'N')) {
				System.out.println("y 또는 n만 다시 입력해주세요");
				System.out.print("계속하시겠습니까?(Y/N) >> ");
				isLoop = scan.next().charAt(0);
			}
			if(isLoop == 'n'|| isLoop == 'N') {
				break;
			}
		}
	}

}
