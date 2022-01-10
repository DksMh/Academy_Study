package org.comstudy21.layout_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.comstudy21.guiex.myframe.Myframe;

public class LayoutEx03 extends Myframe implements ActionListener {
	// Panel을 이용한 세부 레이아웃
	Panel centerPan = new Panel(new GridBagLayout());
	Label centerLb1 = new Label("Hello Java World!");
	Panel southPan = new Panel(new GridLayout(1, 3));
	Panel innerPan = new Panel(new GridLayout(2, 1));
	Button btn1 = new Button("BTN1");
	Button btn2 = new Button("BTN2");
	Button btn3 = new Button("BTN3");
	Button btn4 = new Button("BTN4");

	public LayoutEx03() {
		layoutEx01();
	}

	public void layoutEx01() {
		// 센터에 불인다.
		this.add(BorderLayout.CENTER, centerPan);
		centerPan.add(centerLb1);
		// 하단에 붙인다.
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(innerPan);
		innerPan.add(btn3);
		innerPan.add(btn4);
		this.add(BorderLayout.SOUTH, southPan);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}

	public static void main(String[] args) {
		new LayoutEx03().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 제어문을 이용하여 버튼을 선별
		if (e.getSource() instanceof Button) { // getSource() -> 해당 버튼
			Button btn = (Button) (e.getSource()); // Button으로 형변환
			if (btn1.equals(btn)) {
				System.out.println("btn1 눌렀다");
				centerLb1.setText("press btn1");
			} else if (btn2.equals(btn)) {
				System.out.println("btn2 눌렀다");
				centerLb1.setText("press btn2");
			} else if (btn3.equals(btn)) {
				System.out.println("btn3 눌렀다");
				centerLb1.setText("press btn3");
			} else if (btn4.equals(btn)) {
				System.out.println("btn4 눌렀다");
				centerLb1.setText("press btn4");
			}
		}
	}
}
