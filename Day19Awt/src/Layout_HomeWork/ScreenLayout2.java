package Layout_HomeWork;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.comstudy21.guiex.myframe.Myframe;

// 보기(V) 편집(E) 도움말(H) -> 메뉴
// text 보여주는 곳
// MC MR MS M+ M-
// ← CE C ± √ 
// 왼쪽 오른쪽 
// ¹∕ⅹ 
public class ScreenLayout2 extends Myframe{
	// 전체
	Panel all = new Panel(new GridLayout(4, 1));
	// 버튼 넣어지는 곳
	Panel topbtn = new Panel(new GridLayout(6, 5, 5, 5));
	
	public ScreenLayout2() {
		super("--계산기--", 500, 400);
		// 메뉴
		MenuBar menuBar = new MenuBar();
		Menu v = new Menu("View(V)");
		Menu e = new Menu("Edit(E)");
		Menu h = new Menu("Help(H)");

		menuBar.add(v);
		menuBar.add(e);
		menuBar.add(h);
		this.setMenuBar(menuBar);

		add(BorderLayout.NORTH, all); // 위부터 넣어진다.
		// 숫자 들어가는 부분
		TextArea textarea = new TextArea("0", 3, 30, 3);
		all.add(textarea);

		// MC MR MS M+ M- 부분
		// 7 8 9 / % 부분
		all.add(topbtn);
		topbtnPanel();
		midbtnPanel();
		bottombtnPanel();

	}

	private void topbtnPanel() {
		topbtn.add(new Button("MC"));
		topbtn.add(new Button("MR"));
		topbtn.add(new Button("MS"));
		topbtn.add(new Button("M+"));
		topbtn.add(new Button("M-"));

		topbtn.add(new Button("<-"));
		topbtn.add(new Button("CE"));
		topbtn.add(new Button("C"));
		topbtn.add(new Button("±"));
		topbtn.add(new Button("√"));
	}

	private void midbtnPanel() {
		topbtn.add(new Button("7"));
		topbtn.add(new Button("8"));
		topbtn.add(new Button("9"));
		topbtn.add(new Button("/"));
		topbtn.add(new Button("%"));

		topbtn.add(new Button("4"));
		topbtn.add(new Button("5"));
		topbtn.add(new Button("6"));
		topbtn.add(new Button("*"));
		topbtn.add(new Button("¹∕x"));
	}

	private void bottombtnPanel() {
		topbtn.add(new Button("1")); 
		topbtn.add(new Button("2")); 
		topbtn.add(new Button("3")); 
		topbtn.add(new Button("-")); 
		topbtn.add(new Button("=")); // 25
		topbtn.add(new Button("0")); // 26
		topbtn.add(new Button("0")); // 27
		topbtn.add(new Button(".")); 
		topbtn.add(new Button("+")); 
		topbtn.add(new Button("=")); // 30

	}


	public static void main(String[] args) {
		new ScreenLayout2().setVisible(true);
	}


}
