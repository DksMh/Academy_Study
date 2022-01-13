package org.comstudy21.ex06;

import java.awt.*;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public abstract class R {
	// TestJTable
	public static JTable table;
	public static DefaultTableModel tbModel;
	public static JScrollPane scrollPane;

	public static Vector data;
	public static Vector<String> columnNames;
//	public static Object[][] data;
//	public static Object[] columnNames; 

	// LeftPane
	public static final JTextField txtFld1 = new JTextField(6);
	public static final JTextField txtFld2 = new JTextField(6);
	public static final JTextField txtFld3 = new JTextField(6);
	public static final JTextField txtFld4 = new JTextField(6);

	// 추가 라디오 버튼
	public static final ButtonGroup rbbox = new ButtonGroup();
	public static JRadioButton rb01 = new JRadioButton("회원", true);
	public static JRadioButton rb02 = new JRadioButton("비회원", false);

	// 추가 체크 박스 버튼
	public static final JCheckBox ch01 = new JCheckBox("남자");
	public static final JCheckBox ch02 = new JCheckBox("여자", true);
	
	public static ImageIcon imageIcon = new ImageIcon("F:\\img\\allBtn.png");
	public static Image image = imageIcon.getImage();  //ImageIcon을 Image로 변환.
	public static Image newimg = image.getScaledInstance(60,30, Image.SCALE_SMOOTH);
	public static ImageIcon imageIcon02 = new ImageIcon(newimg); //Image로 ImageIcon 생성
	
	// BottomPane
	public static final JButton allBtn = new JButton(new ImageIcon(newimg));
//	public static final JButton allBtn = new JButton("All");
	public static final JButton inputBtn = new JButton("Input");
	public static final JButton searchBtn = new JButton("Search");
	public static final JButton modifyBtn = new JButton("Modify");
	public static final JButton deleteBtn = new JButton("Delete");
	public static final JButton finshBtn = new JButton("Finsh");

	public static final SaramDao dao = new SaramDao();

}
