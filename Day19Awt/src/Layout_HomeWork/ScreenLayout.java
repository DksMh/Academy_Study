package Layout_HomeWork;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScreenLayout extends Frame {
	int w = 550, h = 350;
	
	// 왼쪽 번호, 이름, 전화번호 전체
	Panel leftPan = new Panel(new GridLayout(6, 1, 0, 0));
	// 번호 + 번호쓰기 칸
	Panel no = new Panel();
	Panel name = new Panel();
	Panel email = new Panel();
	Panel tel = new Panel();

	// 글쓰기
	Panel rightPan = new Panel(new GridLayout(1, 1, 5, 5));

	// 아래 버튼
	Panel bottomPan = new Panel(new FlowLayout());

	// 번호, 이름, 이메일, 전화번호
	Label leftLb1 = new Label("No    ");
	TextField tf1 = new TextField(20);

	Label leftLb2 = new Label("Name  ");
	TextField tf2 = new TextField(20);

	Label leftLb3 = new Label("E-mail");
	TextField tf3 = new TextField(20);

	Label leftLb4 = new Label("Tel   ");
	TextField tf4 = new TextField(20);

	// 글쓰기
	TextArea rightarea = new TextArea("", 20, 40, 3);

	// 하단 버튼 5개
	Button btn1 = new Button("ALL");
	Button btn2 = new Button("INSERT");
	Button btn3 = new Button("DELETE");
	Button btn4 = new Button("SEARCH");
	Button btn5 = new Button("CANCEL");

	public ScreenLayout() {
		ScreenLayout02();
		setTitle("--화면 설계하기--");
		super.setSize(w, h);
		
		// 왼쪽 전체
		this.add(BorderLayout.WEST, leftPan);

		// 왼쪽 전체 안에 있는 문구와 문자넣기 칸
		leftPan.add(no);
		leftPan.add(name);
		leftPan.add(email);
		leftPan.add(tel);

		no.add(leftLb1);
		no.add(tf1);

		name.add(leftLb2);
		name.add(tf2);

		email.add(leftLb3);
		email.add(tf3);

		tel.add(leftLb4);
		tel.add(tf4);

		// 글넣기 판넬
		this.add(BorderLayout.CENTER, rightPan);
		rightPan.add(rightarea);

		// 아래 버튼
		this.add(BorderLayout.SOUTH, bottomPan);
		bottomPan.add(btn1);
		bottomPan.add(btn2);
		bottomPan.add(btn3);
		bottomPan.add(btn4);
		bottomPan.add(btn5);

	}

	public void ScreenLayout02() {
		setTitle("화면 설계하기");
		super.setSize(w, h);
		// 닫기 버튼으로 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("WindowAdapter로 프로세스를 종료함");
				dispose();
				System.exit(0);
			}

		});
		
		// 창이 가운데 오도록 만들기
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int width = (int) tk.getScreenSize().getWidth();
		int heigiht = (int) tk.getScreenSize().getHeight();

		int x = width / 2 - w / 2;
		int y = heigiht / 2 - h / 2;
		this.setLocation(x,y);
	}

	public static void main(String[] args) {
		new ScreenLayout().setVisible(true);

	}

}
