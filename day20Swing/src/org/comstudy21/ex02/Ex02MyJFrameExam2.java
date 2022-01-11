package org.comstudy21.ex02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.comstudy21.guiex.myframe.MyJframe;

public class Ex02MyJFrameExam2 extends MyJframe {
	@Override
	protected void displayLayer() {
		super.setTitle("회원가입");
		super.setSize(320,300);
		// MyJframe에 필드로 선언되었다. Container contentPan
		contentPan = getContentPane();
		JPanel top = new JPanel();
		JPanel topleft = new JPanel();
		JLabel txtl = new JLabel("이  름 : ");
		JLabel txtl2 = new JLabel("아이디  : ");
		JLabel txtl3 = new JLabel("패스워드 : ");
		JLabel txtl4 = new JLabel("나  이 : ");
		JPanel topright = new JPanel();
		JTextField name = new JTextField("",20);
		JTextField id = new JTextField("",20);
		JTextField pw = new JTextField("",20);
		JTextField age = new JTextField("",20);
		
		
		JPanel bottom = new JPanel();
		
		JButton btn1 = new JButton("가입하기");
		JButton btn2 = new JButton("다시쓰기");
		
		// 전체
		GridBagLayout gridbag = new GridBagLayout();
		
		// label있는 부분
		BorderLayout border = new BorderLayout();
		GridLayout gridleft = new GridLayout(4,1);
		
		// 버튼있는 부분
		GridLayout gridbottom = new GridLayout(2,1,5,5);
		FlowLayout flow = new FlowLayout();
		
		contentPan.setLayout(gridbag);
		
		contentPan.add(top);
		top.setLayout(border);
		top.add(topleft);
		top.add(topright);
		topleft.setLayout(gridleft);
		topright.setLayout(gridleft);
		
		topleft.add(txtl);
		topright.add(name);
		topleft.add(txtl2);
		topright.add(id);
		topleft.add(txtl3);
		topright.add(pw);
		topleft.add(txtl4);
		topright.add(age);
		
		contentPan.add(bottom);
		bottom.setLayout(flow);
		bottom.add(btn1);
		bottom.add(btn2);
		
	}
	
	@Override
	protected void actionEvent() {
	}
	
	
	public static void main(String[] args) {
		new Ex02MyJFrameExam2().setVisible(true); 
	}
	
}
