package org.comstudy21.ex02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.comstudy21.guiex.myframe.MyJframe;

public class Ex02MyJFrameTest extends MyJframe {
	@Override
	protected void displayLayer() {
		// MyJframe에 필드로 선언되었다. Container contentPan
		contentPan = getContentPane();
		contentPan.add(BorderLayout.SOUTH,new Button("Hello"));
		
	}
	
	@Override
	protected void actionEvent() {
	}
	
	
	public static void main(String[] args) {
		new Ex02MyJFrameTest().setVisible(true); 
	}
	
}
