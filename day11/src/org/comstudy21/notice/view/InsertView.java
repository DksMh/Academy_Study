package org.comstudy21.notice.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comstudy21.notice.R;
import org.comstudy21.notice.model.NoticeVo;

public class InsertView extends NoticeView {
	@Override
	public void display() {
		System.out.println(":::: 입력 기능 ::::");
		// 성명, 전화, 이메일
		// R.noticeVo에 저장 후 Controller로 이동
		System.out.print("이름 입력 >>> ");
		String user = scan.next();
		System.out.print("내용 입력 >> ");
		String message = scan.next();
		System.out.print("날짜 입력 >> ");
//		String regDate = scan.next();
		LocalDateTime myDateObj = LocalDateTime.now();
//		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String regDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + regDate);

		R.noticeVo = new NoticeVo(0, user, message, regDate);
		scan.nextLine();
		System.out.println("입력 완료");
		// 작업 완료후 자동으로 Controller로 이동.
	}
}