package org.comstudy21.guiex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.Label;

public class Ex01Frame {
	public static void main(String[] args) {
		// 프레임 실행
		// 1. 단독으로 실행하기 
		// 2. 상속 받아서 생성하기
		Frame frame = new Frame(); // 프레임이 만들어지지만 보여지지 않을 뿐
		
		frame.setLayout(new GridBagLayout());
//		frame.setLayout(new FlowLayout());
		
		frame.add(new Label("Hello : "));
		frame.add(new Button("WORLD"));
		
		frame.setSize(640,480); // 크기 지정
		frame.setVisible(true);
		
	}
}
