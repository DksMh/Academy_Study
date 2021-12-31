package day04;

import java.util.Scanner;

public class Ch03Ex03 {
	public static Scanner scan = new Scanner(System.in);
	
	// break continue 응용
	public static void main(String[] args) {
		int age = 0;
		while(true) {
			try { // 정수 잘못 입력했을 때를 대비
				System.out.print("나이 입력 : ");
				age = scan.nextInt();
				break;
			} catch(Exception e) {
				System.out.print("입력실패! 다시 ");
				scan.next(); // scan의 버퍼에서 \n을 제거한다.
				continue;
			}
		}
		if(age < 20) {
			System.out.println("미성년자에게는 술을 팔지 않습니다.");
		}else {
			System.out.println("맛있게 드세요!");
		}
	}
	
	public static void main01(String[] args) {
		// break label -> aaa: 달려 있는 for문을 빠져나감
		
		aaa: for(int i =1; i<=10; i++) {
			for(int j =1; j<=10; j++) {
				if(j%3== 0) break aaa;
				System.out.print(i*j+" ");
			}
			System.out.println(); // 100번 실행
		}
		
	}
	

}
