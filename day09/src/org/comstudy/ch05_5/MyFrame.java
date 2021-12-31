package org.comstudy.ch05_5;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	// Frame을 상속받은 MyFrame은 Frame이다. (IS-A관계)
	public MyFrame() {
		// 인스턴스 내부
		super.setVisible(true);
		this.setSize(640,480); // 자기거에서 찾다가 부모로 가니까 이렇게 써도 괜찮다
	}
	
	public MyFrame(String title, int with, int height) {
		setTitle(title);
		super.setVisible(true);
		this.setSize(with,height); 
		
		Toolkit tk = getToolkit().getDefaultToolkit();
		int sw = (int)(tk.getScreenSize().getWidth());
		int sh = (int)(tk.getScreenSize().getHeight());
		setLocation(sw/2 - this.getWidth()/2,sh/2 -this.getHeight()/2);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//윈도우 닫기 버튼을 클릭하면 발생하는 이벤트 핸들러
				MyFrame.this.dispose(); // 리소스 수거하기
				System.exit(0); // 프로그램 강제종료
			}
		});
	}
	

	public static void main(String[] args) {
//		Frame frame = new MyFrame();
		Frame frame = new MyFrame("윈도우 생성 실습",600,400);
		// 여기는 인스턴스 외부
//		frame.setVisible(true);
//		frame.setSize(640,480);
//		new MyFrame(); // MyFrame의 생성자 호출하란 소리

	}

}
