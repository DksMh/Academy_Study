package org.comstudy21.ex06;

import java.util.Vector;

import javax.swing.JButton;
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
	
	// BottomPane
	public static final JButton allBtn = new JButton("All");
	public static final JButton inputBtn = new JButton("Input");
	public static final JButton searchBtn = new JButton("Search");
	public static final JButton modifyBtn = new JButton("Modify");
	public static final JButton deleteBtn = new JButton("Delete");
	public static final JButton finshBtn = new JButton("Finsh");
	
	public static final SaramDao dao = new SaramDao();
	
}