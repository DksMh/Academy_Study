package org.comstudy21.guiex;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent extends Frame implements WindowListener {
	public FrameEvent() {
		setTitle("WindowsEventListener 실습"); // this.생략 -> 여기에 없으면 부모로 넘어감
		setSize(640,480);
		setVisible(true);
		
		this.addWindowListener(this); // 이벤트 설정 --> WindowListener를 이곳에서 구현
		// 이벤트 리스너가 구현이 되었다면 이제 컴포넌트에 연결을 지어야겠죠? 
		// 해당 컴포넌트의 add~Listener()  메소드가 그 역할을 합니다. 
		// 여기서는 addWindowListener() 메소드입니다.
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// 닫기 버튼 눌렀을 때 창닫고 프로세스 끝내기
		System.out.println("닫기 버튼을 눌렀기 때문에 프로세스를 종료된다.");
		dispose(); // 메모리 제거
		// dispose() 메소드는 프로그램을 종료하는 것이 아니라, 현재의 frame만 종료시킵니다.
		// 프레임이 3개가 있다는 가정해 본다면 이해가 될 것입니다.
		
		System.exit(0); // 강제 종료
		// JVM을 종료시킵니다. 프레임과 관계없이 무조건 프로그램 종료
		// 어떠한 상황에서도 위 명령을 만나면 자바는 지금까지 하던 일을 그만두고 종료됩니다.

	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	
	public static void main(String[] args) {
		new FrameEvent();
	}


}
