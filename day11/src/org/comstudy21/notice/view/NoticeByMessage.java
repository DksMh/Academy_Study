package org.comstudy21.notice.view;

import org.comstudy21.notice.R;
import org.comstudy21.notice.model.NoticeDao;
import org.comstudy21.notice.model.NoticeVo;

public class NoticeByMessage extends NoticeView {


	@Override
	public void display() {
		System.out.println("::::: 메시지 검색 :::::");
		System.out.print("메시지 입력 >> ");
		String message = scan.next();
		
		R.noticeVo = new NoticeVo(0, null, message, null);
		
		
	}

}