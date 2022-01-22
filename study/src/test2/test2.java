package test2;
// 쓰레드 혼자 공부하기

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Airplan extends JPanel { // 판넬을 만들고 라벨에 비행기 이미지를 붙이기
	Image img;
	String imagePath = "F:\\java_work\\study\\src\\test2\\airplan01.png"; // 이미지 위치 찾고
	public int x, y; // x, y 좌표
	public JLabel imgLbl; // JPanel에서 라벨에 붙여넣을 거임.

	public Airplan() { // 생성자를 만듬
		ImageIcon imgIcon = new ImageIcon(imagePath); // 아이콘으로 위치찾은 거 넣어주고
		img = imgIcon.getImage(); // 이미로 다시 넣어줌
		Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지 크기 조정
		imgIcon = new ImageIcon(newImg);
		imgLbl = new JLabel(imgIcon); // 라벨에 이미지 넣어줌
		this.add(imgLbl); // Airplan이라는 판넬에 이미지 넣은 라벨 넣어줌
		this.setBounds(150, 200, 100, 100); // 처음 위치 좌표
	}
}

class Airplan02 extends JPanel implements Runnable { // 자성 이미지를 움직이게 만들고 싶어 extend를 못하니까 Runnable
	String imagePath = "F:\\java_work\\study\\src\\test2\\airplan02.png";
	Image img;
	public JLabel imgLbl2; // JPanel에서 라벨에 붙여넣을 거임.
	int x, y; // y좌표 위치

	public Airplan02() {
		ImageIcon imgIcon = new ImageIcon(imagePath);
		img = imgIcon.getImage();
		Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newImg);
		imgLbl2 = new JLabel(imgIcon);
		this.add(imgLbl2);
		this.setBounds(300, -100, 100, 100); // 처음 위치 좌표
	}

	public void run() { // start하면 달릴 부분이야.
		while (true) { // 계속 보여주게 만들고 싶어서 반복 사용

			this.y += 10; // 10px 더할 꺼야.
			if (this.y >= 600) { // 600이 넘어가면
				this.y = -100; // 다시 -100 부터 다시보여
				this.setBounds(300, this.y, 100, 100);
			}

		}
	}

}

class AiplanStarterThread extends Thread { // 스타트 부분 만들어줄 쓰레드
	Airplan02 airplan02;

	public AiplanStarterThread(Airplan02 airplan02) {
		this.airplan02 = airplan02;
	}

	@Override
	public void run() {
		while (true) {
			try {

				Thread.sleep(500);

				airplan02.y += 10; // 10px 더할 꺼야.
				if (airplan02.y >= 600) { // 600이 넘어가면
					airplan02.y = -100; // 다시 -100 부터 다시보여
				}
				airplan02.setBounds(300, airplan02.y, 100, 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyContentPan extends JPanel { // 컨테이너 위에 붙이는 판넬 만듬
	// 이곳에 비행기를 넣을 것임.
	Airplan airplan01 = new Airplan();
	Airplan02 airplan02 = new Airplan02();

	public MyContentPan() { // 생성자를 만들고
		setLayout(null); // 레이아웃을 초기화 하고
		this.add(airplan01); // 비행기를 넣어준다.
		this.add(airplan02);

		airplan02.setBounds(100, 100, 100, 100); // 위치를 변경해준다. == (x, y, w, h)

		// start
		AiplanStarterThread aaa = new AiplanStarterThread(airplan02);
		aaa.start();
	}
}

public class test2 extends JFrame {

	public test2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 닫으면 프로세스도 같이 닫기
		setTitle("이미지 불러오기 실습"); // 이름
		setSize(800, 600); // 사이즈
		MyContentPan myContentPan = new MyContentPan(); // 컨테이너 만들기
		setContentPane(myContentPan); // JFrame에 컴포넌트가 포함된 JPanel을 부착
	}

	public static void main(String[] args) {
		new test2().setVisible(true);
	}

}