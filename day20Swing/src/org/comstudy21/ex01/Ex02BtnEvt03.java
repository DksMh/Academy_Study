package org.comstudy21.ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import org.comstudy21.guiex.myframe.Myframe;

public class Ex02BtnEvt03 extends Myframe {
	Panel leftPan = new Panel();
	Panel centerPan = new Panel(new GridBagLayout());
	Button btn1 = new Button("Button 01");
	TextField txtfld = new TextField(10);
	TextField txtfld2 = new TextField(10);
	TextField txtfld3 = new TextField(10);
	TextField txtfld4 = new TextField(10);
	
	public Ex02BtnEvt03() {
		super("Member management system", 640, 480);
		add(BorderLayout.WEST, leftPan);
		add(BorderLayout.CENTER, centerPan);
		
//		centerPan.add(new Label("center message"));
		Label label = new Label("center message");
		centerPan.add(label);
		centerPan.setBackground(Color.blue);
		label.setFont(new Font("Serif", Font.BOLD, 10)); // 글씨체, 굵기, 폰트사이즈
		label.setForeground(Color.RED); // 폰트 색 변경
		label.setFont(label.getFont().deriveFont(25.0f)); // 폰트 사이즈
		
		Panel rowPan1 = new Panel(); 
		rowPan1.add(new Label("btn01 :"));
		rowPan1.add(btn1);
		Panel rowPan2 = new Panel();
		rowPan2.add(new Label("txt01 :"));
		rowPan2.add(txtfld);
		Panel rowPan3 = new Panel();
		rowPan3.add(new Label("txt02 :"));
		rowPan3.add(txtfld2);
		Panel rowPan4 = new Panel();
		rowPan4.add(new Label("txt03 :"));
		rowPan4.add(txtfld3);
		Panel rowPan5 = new Panel();
		rowPan5.add(new Label("txt04 :"));
		rowPan5.add(txtfld4);
		
		Panel gridPan = new Panel(new GridLayout(5,1)); 
		gridPan.add(rowPan1);
		gridPan.add(rowPan2);
		gridPan.add(rowPan3);
		gridPan.add(rowPan4);
		gridPan.add(rowPan5);
		
		leftPan.add(gridPan);
		
	}
	public static void main(String[] args) {
		new Ex02BtnEvt03().setVisible(true);
	}
}
