package org.comstudy21.ex02;

import javax.swing.JFrame;

public class Ex02 extends JFrame {
	public Ex02() {
		// 그래서 닫기 버튼을 만들어줘야한다.
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 종료할 때 모든 자원 반납
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼 누를 때 강제 종료 이벤트 처리
		
		// 타이틀 지정
		setTitle("첫번째 스윙 실습");
		
		// 크기 설정
		setSize(640,480);
	}
	public static void main(String[] args) {
		new Ex02().setVisible(true); // -> 닫기버튼 눌러줘도 단순히 setVisible(false)로 바꿔준것
	}
}
