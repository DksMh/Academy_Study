package org.comstudy21.ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.comstudy21.guiex.myframe.Myframe;

public class Ex02BtnEvt02 extends Myframe implements ActionListener { // implements ActionListener
	private Button[] btnArr = new Button[2];
	{
		// 초기화 블럭 - 필드를 초기화 하는 구역
		btnArr[0] = new Button("Button1");
		btnArr[1] = new Button("Button2");
	}
	private Label lbl = new Label("[Result] No button pressed");

	public Ex02BtnEvt02() {
		super("Button Event Ex", 400, 150);
		start();
		run();
	}

	private void run() {
		// 익명 내부 클래스를 이용한 이벤트 핸들러 처리
		btnArr[0].addActionListener(this);
		btnArr[1].addActionListener(this);

	}

	public void start() {
		Panel southPan = new Panel();
		Panel centerPan = new Panel(new GridBagLayout());
		// Panel의 Default Layout은 FlowLayout
		southPan.add(btnArr[0]);
		southPan.add(btnArr[1]);
		centerPan.add(lbl);
		this.add(BorderLayout.SOUTH, southPan);
		this.add(BorderLayout.CENTER, centerPan);
	}

	public static void main(String[] args) {
		new Ex02BtnEvt02().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnArr[0].equals(e.getSource())) {
			lbl.setText("[Result] BTN1 Pressed");
		}else if(btnArr[1].equals(e.getSource())) {
			lbl.setText("[Result] BTN2 Pressed");
		}
//		if (e.getSource() instanceof Button) {
//			Button btn = (Button) e.getSource();
//			if(btnArr[0].equals(btn)) {
//				lbl.setText("[Result] BTN1 Pressed");
//			}else if(btnArr[1].equals(btn))  {
//				lbl.setText("[Result] BTN2 Pressed");
//				
//			}
//		}
	}

}
