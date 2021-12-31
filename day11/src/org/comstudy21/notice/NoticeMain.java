package org.comstudy21.notice;

public class NoticeMain {
	public static void main(String[] args) {
		System.out.println("--------- 사람 정보 관리 프로그램 --------");
		R.noticeController.action(); //재귀호출에 의해서 반복됨.
	}

}