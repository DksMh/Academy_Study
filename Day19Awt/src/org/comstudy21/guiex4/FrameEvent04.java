package org.comstudy21.guiex4;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent04 extends Frame {
	public FrameEvent04() {
		setTitle("익명 내부 클래스를 활용한 이벤트 핸들러 구현");
		setSize(640, 480);
		setVisible(true);
		
		// 인터페이스 --> 인터페이스는 객체를 만들지 못함
		// BUT, 하지만 인터페이스를 구현하면서 인스턴스 생성 가능(익명 내부 클래스 객체)
		// 1회용으로 사용이 끝난다
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				dispose(); // 원래 FrameEvent04.this.dispose(); 으로 접근해야하는 거임
				System.exit(0);
			}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
			
		});
	}
	
	public static void main(String[] args) {
		new FrameEvent04();
	}

}
