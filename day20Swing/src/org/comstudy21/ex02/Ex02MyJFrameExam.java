package org.comstudy21.ex02;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.comstudy21.guiex.myframe.MyJframe;

public class Ex02MyJFrameExam extends MyJframe {
//	Button btn= new Button("Hello"); // 이렇게 하면 에러 생기는데 부모에 없기 때문이다
	JButton okbtn, resetBtn;
	JTextField txtFld1, txtFld2, txtFld3, txtFld4;
	JPanel centerPan, leftPan, mainPan, bottomPan;
	
	public Ex02MyJFrameExam() {
		super("회원가입",120,200);
	}
	
	public void init() {
		okbtn = new JButton("가입하기");
		resetBtn = new JButton("다시쓰기");
		txtFld1 = new JTextField(30);
		txtFld2 = new JTextField(30);
		txtFld3 = new JTextField(30);
		txtFld4 = new JTextField(30);
		centerPan = new JPanel(new BorderLayout());
		leftPan = new JPanel(new GridLayout(4,1));
		mainPan = new JPanel(new GridLayout(4,1));
		bottomPan = new JPanel(); // 디폴트가 -> new FlowLayout()
	}
	@Override
	protected void displayLayer() {
		init();
		// MyJframe에 필드로 선언되었다. Container contentPan
		contentPan = getContentPane();
		contentPan.setLayout(new GridBagLayout());
		contentPan.add(centerPan);
		centerPan.add(BorderLayout.WEST,leftPan); 
		centerPan.add(BorderLayout.CENTER,mainPan);
		centerPan.add(BorderLayout.SOUTH, bottomPan);
		leftPan.add(new JLabel("성    명 : "));
		leftPan.add(new JLabel("아이디  : "));
		leftPan.add(new JLabel("패스워드 : "));
		leftPan.add(new JLabel("나    이 : "));
		mainPan.add(txtFld1);
		mainPan.add(txtFld2);
		mainPan.add(txtFld3);
		mainPan.add(txtFld4);
		
		bottomPan.add(okbtn);
		bottomPan.add(resetBtn);
	}
	
	@Override
	protected void actionEvent() {
	}
	
	
	public static void main(String[] args) {
		new Ex02MyJFrameExam().setVisible(true); 
	}
	
}
