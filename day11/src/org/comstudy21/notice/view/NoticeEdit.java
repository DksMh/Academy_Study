package org.comstudy21.notice.view;

import org.comstudy21.notice.R;


public class NoticeEdit extends NoticeView {
	@Override
	public void display() {
		System.out.println("::::: 메세지 정보 수정 :::::");
		if(R.noticeVo == null) {
			System.out.println("검색 결과 없습니다!");
			return;
		}
		System.out.println(R.noticeVo);
		System.out.println("수정 항목을 선택하세요.");
		System.out.println("이름을 수정하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이름 >> ");
			R.noticeVo.setUser(scan.next());
		}
		
		System.out.println("내용을 수정하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 내용 >> ");
			R.noticeVo.setMessage(scan.next());
		}
	}
}