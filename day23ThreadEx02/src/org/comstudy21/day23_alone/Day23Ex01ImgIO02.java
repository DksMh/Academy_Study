package org.comstudy21.day23_alone;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyContentPanTest01 extends JPanel {
	JLabel label;

	public MyContentPanTest01() {
		label = new JLabel("우리는 하나다!");
		Font font = new Font("궁서체", Font.ITALIC, 48);
		label.setFont(font);
		this.add(label);
	}
}

class Airplane01 extends JPanel {
	Image img;
	String imagePath = "F:\\java_work\\day23ThreadEx02\\src\\org\\comstudy21\\day23\\airplan01.png";
	BufferedImage bfimg;
	public int x = 300, y = 300;
	public JLabel imgLbl = null;

	public Airplane01() { // 아군
		// img = Toolkit.getDefaultToolkit().getImage(imagePath);
		// 이미지나 그래픽 관련 메소드는 라이프사이클에 의해서 자동 실행 된다.
		// paint(), repaint(), paintComponent()
		// 1 번째 방법
//		try {
//			bfimg = ImageIO.read(this.getClass().getResource("airplan01.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// 2번째 방법
		// 이미지 아이콘은 이미지가 아니다.
		ImageIcon imgIcon = new ImageIcon("src/org/comstudy21/day23/airplan01.png"); // -> 절대 경로
//		ImageIcon imgIcon = new ImageIcon(getClass().getResource("airplan01.png"));

		img = imgIcon.getImage();
		// 이미지 크기도 조정
		Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newImg);

//		setLayout(null);
		// JLabel()은 imgIcon 객체 사용가능
		imgLbl = new JLabel(imgIcon);
		this.add(imgLbl);
//		imgLbl.setBounds(x, y, 100, 100);

		// 2번쨰 방법 --> 혼자 해봄
//		Image img = imgIcon.getImage();
//		Image newimg = img.getScaledInstance(150,180, Image.SCALE_SMOOTH);
//		ImageIcon imageIcon02 = new ImageIcon(newimg);
//		this.add(new JLabel(imageIcon02));

	}

	@Override
	public void paintComponent(Graphics g) {
//		g.drawImage(bfimg, x, y, 100, 100, this);
	}
}

class Airplane02 extends JPanel { // 적군
	String imagePath = "airplan02.png";
	Image img = null;
	ImageIcon imgIco = null;
	int x = 0, y = 0, w = 100, h = 100;

	public Airplane02() {
		imgIco = new ImageIcon(imagePath);
		img = imgIco.getImage();
		Image newImg = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		imgIco = new ImageIcon(newImg);
		add(new JLabel(imgIco));
	}

}

class MyCenterPan extends JPanel {
	int x1 = 350, y1 = 400, w1 = 100, h1 = 100;
	int x2 = 100, y2 = 0, w2 = 100, h2 = 100;
	public Airplane01 ariplan01 = new Airplane01();
	public Airplane02 ariplan02 = new Airplane02();

	public MyCenterPan() {
		setLayout(null);
//		setLayout(new BorderLayout());
		add(ariplan01);
		add(ariplan02);

		ariplan01.setBounds(x1, y1, w1, y1); // -> 이유 : MyCenterPan로 셋바운드로 바꿨음
		ariplan02.setBounds(x2, y2, w2, y2);
	}

	// 그래서 생성자 만들고 호출하기
	public void airplan01MoveLeft() {
		x1 -= 10;
		ariplan01.setBounds(x1, y1, w1, h1);
	}

	public void airplan01MoveRight() {
		x1 += 10;
		ariplan01.setBounds(x1, y1, w1, h1);
	}

}

class MyContentPan extends JPanel {
	MyCenterPan centerPan = new MyCenterPan();
	JButton leftBtn = new JButton("Left");
	JButton rightBtn = new JButton("Right");

	public MyContentPan() {
		setBackground(Color.PINK);
		layoutComponent();
		actionEvent();
	}

	private void actionEvent() {
		leftBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누르면 비행기가 화면의 좌측으로 이동한다.
//				centerPan.ariplan01.x = centerPan.ariplan01.x - 30;
//				centerPan.ariplan01.imgLbl.setBounds(centerPan.ariplan01.x, centerPan.ariplan01.y, 100, 100);
				centerPan.airplan01MoveLeft();
				repaint();
				
				// 혼자 한 방법
//				if(e.getSource() == leftBtn) {
//					x -= 10;
//					centerPan.setLocation(x, y);
//					centerPan.repaint(); // 해당 콤포넌트의 화면을 다시 그린다.
//				}
			}
		});

		rightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누르면 비행기가 화면의 우측으로 이동한다.
//				centerPan.ariplan01.x = centerPan.ariplan01.x + 30;
//				centerPan.ariplan01.imgLbl.setBounds(centerPan.ariplan01.x, centerPan.ariplan01.y, 100, 100);
				centerPan.airplan01MoveRight();
				repaint();

				// 혼자 한 방법
//				if(e.getSource() == rightBtn) {
//					x += 10;
//					centerPan.setLocation(x, y);
//					centerPan.repaint(); // 해당 콤포넌트의 화면을 다시 그린다.
//				}
			}
		});
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
//				System.out.println(keyCode);
				if (keyCode == KeyEvent.VK_LEFT) {
//					System.out.println("왼쪽으로...");
//					centerPan.ariplan01.x = centerPan.ariplan01.x - 30;
//					centerPan.ariplan01.imgLbl.setBounds(centerPan.ariplan01.x, centerPan.ariplan01.y, 100, 100);
					centerPan.airplan01MoveLeft();
					repaint();
				} else if (keyCode == KeyEvent.VK_RIGHT) {
//					System.out.println("오른쪽으로...");
//					centerPan.ariplan01.x = centerPan.ariplan01.x + 30;
//					centerPan.ariplan01.imgLbl.setBounds(centerPan.ariplan01.x, centerPan.ariplan01.y, 100, 100);
					centerPan.airplan01MoveRight();
					repaint();
				}
			}
		});
		// Focus를 읽을 수 있도록 설정한다.
		this.setFocusable(true);
		this.requestFocus();
	}

	private void layoutComponent() {
		setLayout(new BorderLayout());
		this.add(BorderLayout.NORTH, new JLabel("미사일로 비행기 맞추기 게임 - 방향키로 비행기 조종"));
		this.add(centerPan);
		JPanel bottomPan = new JPanel(new FlowLayout());
		bottomPan.add(leftBtn);
		bottomPan.add(rightBtn);
		this.add(BorderLayout.SOUTH, bottomPan);
	}
}

public class Day23Ex01ImgIO02 extends JFrame {
	Container contentPan;

	public Day23Ex01ImgIO02() {
		setTitle("이미지 불러오기 실습");
		setSize(800, 600);

		// contentPan = getContentPane();
		MyContentPan myContentPan = new MyContentPan();
		setContentPane(myContentPan);
	}

	public static void main(String[] args) {
		new Day23Ex01ImgIO02().setVisible(true);
	}

}