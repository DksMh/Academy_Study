package org.comstudy21.guiex2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyWindowListener implements WindowListener{
	FrameEvent02 target;
	public MyWindowListener(FrameEvent02 target) {
		this.target = target;
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println(">>> 닫기 버튼 누름 ... 프로세스 종료!");
		target.dispose();
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
}

public class FrameEvent02 extends Frame {
	public static final int WIDTH = 600, HEIGHT = 400;
	public FrameEvent02() {
		setTitle("이벤트 리스트 연습");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		
		WindowListener l = new MyWindowListener(this); 
		addWindowListener(l); // -> 외부에 만들어 놓고 쓰겠다는 소리
	}
	
	public static void main(String[] args) {
		new FrameEvent02();
	}


}
