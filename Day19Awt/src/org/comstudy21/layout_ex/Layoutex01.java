package org.comstudy21.layout_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import org.comstudy21.guiex.myframe.Myframe;

public class Layoutex01 extends Myframe {
	public Button btn1 = new Button("BTN1");
	public Button btn2 = new Button("BTN2");
	public Button btn3 = new Button("BTN3");
	public Button btn4 = new Button("BTN4");
	public Button btn5 = new Button("BTN5");
	public ArrayList<Button> btns = new ArrayList<Button>();
	{
		for (int i = 0; i < 100; i++) {
			btns.add(new Button("BTN" + i));
		}
	}

	public Layoutex01() {
		super("Layout manager 연습", 640, 480);
//		BorderLayoutEx();
//		flowLayoutEx();
		gridLayoutEx();
//		gridBagLayoutEx();
	}

	public void gridBagLayoutEx() {
		this.setLayout(new GridBagLayout()); // 정 가운데 붙이기
		this.add(btn1);

	}

	public void gridLayoutEx() {
		this.setLayout(new GridLayout(3, 2, 5, 5)); // 2행 3열 5px씩 간격
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btns.get(10));

	}

	public void flowLayoutEx() {
		// FlowLayout - 왼쪽에서 오른쪽으로 순서대로 붙인다
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);

		for (Button btn : btns) {
			this.add(btn);
		}

	}

	public void BorderLayoutEx() {
		// Window를 상속받은 Frame은 디폴트 레이아웃이 BorderLayout
		add(BorderLayout.NORTH, btn1);
		add(BorderLayout.SOUTH, btn2);
		add(BorderLayout.WEST, btn3);
		add(BorderLayout.EAST, btn4); // 하나가 블락 처리되면
		add(BorderLayout.CENTER, btn5); // 100% 꽉 차지함
	}

	public static void main(String[] args) {
		new Layoutex01().setVisible(true);
		// Myframe이 아닌 여기서 setVisible을 한 이유는 마지막에 하는 것이 가장 좋기때문
		// setVisible을 먼저 하면 안먹히는 경우가 있음
	}

}
