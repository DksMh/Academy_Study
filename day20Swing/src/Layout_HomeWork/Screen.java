package Layout_HomeWork;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.comstudy21.guiex.myframe.MyJframe;

public class Screen extends MyJframe{
	// 전체보기, 추가, 삭제, 검색, 취소 버튼
	JButton allbtn, appendbtn, deletbtn, searchbtn, resetbtn;
	// 이름, 이메일, 전화번호, 큰 창
	JTextField txtFld1, txtFld2, txtFld3, txtFld4;
	public Screen(){
		super("화면",600,400);
	}
	public void init() {
		
	}
	public static void main(String[] args) {
		new Screen().setVisible(true);
	}
	@Override
	protected void displayLayer() {
		
	}
	protected void actionEvent() {
		
	}

}
