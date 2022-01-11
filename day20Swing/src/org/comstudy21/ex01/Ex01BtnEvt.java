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

public class Ex01BtnEvt extends Myframe { // 내가 한 방법 - implements ActionListener
	private Button[] btnArr = new Button[2];
	{
		// 초기화 블럭 - 필드를 초기화 하는 구역
		btnArr[0] = new Button("Button1");
		btnArr[1] = new Button("Button2");
	}
	private Label lbl = new Label("[Result] No button pressed");

	public Ex01BtnEvt() {
		super("Button Event Ex", 400, 150);
		start();
		run();
	}

	private void run() {
		// 익명 내부 클래스를 이용한 이벤트 핸들러 처리
		btnArr[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("[Result] First button pressed");
				Button btn = (Button) (e.getSource());
				btn.setBackground(Color.BLUE);
				// Ex01BtnEvt.this를 하고 setBackground하면 안바뀐다
				// -> 왜? Panel이 한번 막고있어서
			}
		});
		btnArr[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("[Result] Second button pressed");
			}
		});
		
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
		// 내 방법
//		btnArr[0].addActionListener(this);
//		btnArr[1].addActionListener(this);
	}

	public static void main(String[] args) {
		new Ex01BtnEvt().setVisible(true);
	}
	// 내 방법
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() instanceof Button) {
//			Button btn = (Button) (e.getSource());
//			if(this.btnArr[0].equals(btn)) {
//				Ex01BtnEvt.this.lbl.setText("Press Button1");
//			}else if(this.btnArr[1].equals(btn)) {
//				Ex01BtnEvt.this.lbl.setText("Press Button2");
//			}
//		}
//		
//	}

}
