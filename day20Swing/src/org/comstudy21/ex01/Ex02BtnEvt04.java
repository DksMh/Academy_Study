package org.comstudy21.ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;


import org.comstudy21.guiex.myframe.Myframe;

public class Ex02BtnEvt04 extends Myframe {
	public Ex02BtnEvt04() {
		super("Exam", 680, 480);
		Panel lp = new Panel();
		Panel rp = new Panel(new GridBagLayout());
		Button btn1 = new Button("Button");
		Label lb = new Label("안녕하세요");
		TextField tf = new TextField("", 10);
		Checkbox check = new Checkbox("Student", true);
		
		add(BorderLayout.WEST,lp);
		// Button
		Panel row1 = new Panel();
		row1.add(new Label("Button : "));
		row1.add(btn1);
		
		// Name
		Panel row2 = new Panel();
		row2.add(new Label("Name : "));
		row2.add(tf);
		
		// CheckBox
		Panel row3 = new Panel();
		row3.add(new Label("Check : "));
		row3.add(check);
		
		// Gride (3,1)
		Panel grid = new Panel(new GridLayout(3,1));
		
		// 왼쪽 큰 판넬에 이제 넣어주기
		// grid를 넣어주고 그 안에 각각의 row를 넣어준다
		lp.add(grid);
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		
		// HI~
		add(BorderLayout.CENTER,rp);
		rp.add(lb);
		rp.setBackground(Color.GRAY); // 배경
		lb.setForeground(Color.CYAN); // 글자색
		lb.setFont(new Font("Noto Sans",Font.BOLD,25));
		
		
	}	
	
	public static void main(String[] args) {
		new Ex02BtnEvt04().setVisible(true);
	}
}
