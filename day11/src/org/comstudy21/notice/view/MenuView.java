package org.comstudy21.notice.view;

import org.comstudy21.notice.R;

public class MenuView extends NoticeView {
	@Override
	public void display() {
		System.out.println("::::: MENU :::::");
		int no = 0;
		while(true) {
			try {
				System.out.println("1.입력 2.출력 3.검색(이름) 4. 검색(내용) 5.수정 6.삭제 7.종료");
				System.out.print("선택 : ");
				no = scan.nextInt();
				while(no>7 || no < 1) {
					System.out.println("범위를 넘었습니다.");
					System.out.print("다시선택 : ");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력 하세요!");
				scan.next();
				continue;
			}
		} // end of while
		// no가 정상적으로 입력 되었다.
		// R의 no에 바인딩 한다.
		R.no = no;
	}
}