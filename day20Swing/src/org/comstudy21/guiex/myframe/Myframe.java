package org.comstudy21.guiex.myframe;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Myframe extends Frame{
	// 디폴트 생성자
	public Myframe() {
		// 생성자 오버로딩 호출
		this("my-frame", 200, 200);
	}
	//생성자 오버로딩
	public Myframe(String title, int w, int h) {
		this.setTitle(title);
		super.setSize(w,h);
		
		// 이벤트 핸들러	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Myframe에 작성한 windowClosing");
				dispose();
				System.exit(0);
			}
		});
		
		// 스크린 화면의 정 가운데 배치
		// 창 위치 정하기 --> 지금은 정가운데에 뜨게 만들어줌
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrWitdh = (int)tk.getScreenSize().getWidth();
		int scrHeight = (int)tk.getScreenSize().getHeight();	
		
		int x = scrWitdh/2 - w/2;
		int y = scrHeight/2 - h/2;
		
		this.setLocation(x,y);
		
	}

}
