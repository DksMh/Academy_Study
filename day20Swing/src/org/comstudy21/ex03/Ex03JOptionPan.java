package org.comstudy21.ex03;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.comstudy21.guiex.myframe.MyJframe;

public class Ex03JOptionPan extends MyJframe {
	JButton openBtn, btn2, btn3, btn4;

	public Ex03JOptionPan() {
		super("show dialog example", 400, 400);
	}

	protected void init() {
		openBtn = new JButton("message 열기");
		btn2 = new JButton("아이디 입력버튼");
		btn3 = new JButton("작업 종료버튼");
		btn4 = new JButton("직업 선택버튼");
	}

	protected void displayLayer() {
		init();
		contentPan = getContentPane();
		contentPan.setLayout(new GridBagLayout());
		contentPan.add(openBtn);
		contentPan.add(btn2);
		contentPan.add(btn3);
		contentPan.add(btn4);
	}

	protected void actionEvent() {
		openBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭하면 다이얼로그 창 보이게 하기
				JOptionPane.showMessageDialog(Ex03JOptionPan.this, "환영합니다!");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(Ex03JOptionPan.this, "아이디를 입력하시오.");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(Ex03JOptionPan.this, "작업을 종료하시겠습니까?");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str = { "가입하기", "다시쓰기", "취소" };
				JOptionPane.showOptionDialog(Ex03JOptionPan.this,
						  "원하는 작업을 선택하시오.", "대화상자",
						  JOptionPane.YES_NO_CANCEL_OPTION,     
						  JOptionPane.INFORMATION_MESSAGE,
						  null, str, str[0]);
			}
		});
	}

	public static void main(String[] args) {
		new Ex03JOptionPan().setVisible(true);
	}

	public static void test01(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello world");
	}

}
