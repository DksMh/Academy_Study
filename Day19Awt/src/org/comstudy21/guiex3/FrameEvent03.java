package org.comstudy21.guiex3;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent03 extends Frame {
	private int width = 640, height = 480;

	public FrameEvent03() {
		setTitle("Inner class를 활용한 이벤트 처리 연습");
		setSize(width, height);
		setVisible(true);

		WindowListener l = new InnerWindowListener();
		addWindowListener(l);
	}

	// 클래스 내부에 클래스를 선언한다. (매우 중요!!! 많이 사용!!!!)
	class InnerWindowListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
		}

		public void windowClosing(WindowEvent e) {
//			System.out.println("닫기 버튼으로 프로세스 종료");
//			dispose();
//			System.exit(0);
			// 접근 가능함
			// 두번째로 닫기 버튼 누르면 변경
			if (width == 100) {
				dispose();
				System.exit(0);
			}
			// 첫번째 닫기 버튼 누르면 변경
			setTitle("aaa");
			width = 100;
			height = 100;
			setSize(width, height);

		}

		public void windowClosed(WindowEvent e) {
		}

		public void windowIconified(WindowEvent e) {
		}

		public void windowDeiconified(WindowEvent e) {
		}

		public void windowActivated(WindowEvent e) {
		}

		public void windowDeactivated(WindowEvent e) {
		}

	}

	public static void main(String[] args) {
		new FrameEvent03();
	}

}
