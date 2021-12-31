package org.comstudy21.notice.view;

import org.comstudy21.notice.R;
import org.comstudy21.notice.model.NoticeVo;

public class NoticeByName extends NoticeView {
	@Override
	public void display() {
		System.out.println("::::: 유저 정보 검색 :::::");
		System.out.print("검색 할 이름 >> ");
		String name = scan.next();
		R.noticeVo = new NoticeVo(0, name, null, null);
		// controller로 이동
	}
}