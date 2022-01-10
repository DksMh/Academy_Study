package org.comstudy21.guiex5;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent05 extends Frame {
	public FrameEvent05() {
		setTitle("WindowAdapter를 활용한 event처리");
		setSize(640, 480);
		setVisible(true);
		
		// 인터페이스 --> 인터페이스는 객체를 만들지 못함
		// BUT, 하지만 인터페이스를 구현하면서 인스턴스 생성 가능(익명 내부 클래스 객체)
		// 1회용으로 사용이 끝난다
		addWindowListener(new WindowAdapter() { // WindowAdapter는 원하는 거 골라서 쓸 수 있도록 도움
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new FrameEvent05();
	}

}
