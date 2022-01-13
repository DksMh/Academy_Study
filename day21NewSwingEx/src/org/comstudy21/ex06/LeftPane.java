package org.comstudy21.ex06;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// R에 있는 모든 것을 쓰겠다.
import static org.comstudy21.ex06.R.*;

public class LeftPane extends JPanel {
	
	
	public LeftPane() {

		JPanel rowPan1 = new JPanel();
		rowPan1.add(new JLabel("아이디 : "));
		rowPan1.add(txtFld1);
		JPanel rowPan2 = new JPanel();
		rowPan2.add(new JLabel("사용자 : "));
		rowPan2.add(txtFld2);
		JPanel rowPan3 = new JPanel();
		rowPan3.add(new JLabel("이메일 : "));
		rowPan3.add(txtFld3);
		JPanel rowPan4 = new JPanel();
		rowPan4.add(new JLabel("핸드폰 : "));
		rowPan4.add(txtFld4);
		
		// 라디오 박스 판넬
		rbbox.add(rb01);
		rbbox.add(rb02);

		JPanel rowPan5 = new JPanel();
		rowPan5.add(rb01);
		rowPan5.add(rb02);
		
		// 체크 박스 판넬
		
		JPanel rowPan6 = new JPanel();
		rowPan6.add(ch01);
		rowPan6.add(ch02);
		
		
		JPanel gridPan = new JPanel(new GridLayout(7, 1));
		gridPan.add(rowPan1);
		gridPan.add(rowPan2);
		gridPan.add(rowPan3);
		gridPan.add(rowPan4);
		gridPan.add(rowPan5);
		gridPan.add(rowPan6);

		this.add(gridPan);
	}

}