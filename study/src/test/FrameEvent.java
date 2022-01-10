package test;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent extends Frame implements WindowListener {
	public FrameEvent() {
		this.setTitle("윈도우 실습");
		this.setSize(640,480);
		this.setVisible(true); 
		// 여기 까지가 창띄우기
		
		// 창닫기
		this.addWindowListener(this);
		
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		// 창을 닫자.
		System.out.println("닫기 버튼으로 프로세스를 종료하였습니다.");
		dispose();
		System.exit(0);
		
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new FrameEvent();
	}
}
