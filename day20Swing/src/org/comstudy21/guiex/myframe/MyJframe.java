package org.comstudy21.guiex.myframe;

import java.awt.Container;

import javax.swing.JFrame;

public abstract class MyJframe extends JFrame {
	protected Container contentPan = null;
	public MyJframe() {
//		// 닫기 버튼 누를 때 강제 종료 이벤트 처리
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		// 타이틀 지정
//		setTitle("첫번째 스윙 실습");
//
//		// 크기 설정
//		setSize(640, 480);
		this("MyJframe",200,200);
	}

	public MyJframe(String title, int w, int h) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(title);
		setSize(w,h);
		
		displayLayer(); // 동적 바인딩
		actionEvent();
	}
	
	protected abstract void displayLayer();
	protected abstract void actionEvent();


}
