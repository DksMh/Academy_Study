package org.comstudy21.ex05;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx01 extends JFrame {
	Container contentPane;
	JTable table;
	DefaultTableModel tableModel;
	JScrollPane scrollPane;

	Object[][] rowData; // -> 2차원배열
	Object[] colNames; // -> 1차원배열

	public JTableEx01() {
		init();
		start();
	}

	private void init() {
		contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		setSize(640, 480);
		// 데이터와 테이블 생성
		mkTbl();
	}

	private void mkTbl() {
		colNames = new Object[] { "idx", "name", "phone" };
		rowData = new Object[][] { { 1, "kim", "1111-1111" }, { 2, "lee", "2222-2222" }, { 3, "pack", "3333-3333" },
				{ 4, "kang", "4444-4444" }, { 5, "hong", "5555-5555" } };

		tableModel = new DefaultTableModel(rowData, colNames); // 수정이 용이하기 위해서
		table = new JTable(tableModel);

		scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane);

		//// ---------------------- 내용 변경 --> 수정테스트
		tableModel.setDataVector(null, colNames); // -> 테이블만 남고 지워짐
		tableModel.addRow(new Object[] { 3, "ccc", "7777" }); // -> 지우고 이것만 넣어줌
		tableModel.addRow(new Object[] { 2, "bbb", "8888" });
		tableModel.addRow(new Object[] { 1, "aaa", "9999" });
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTableEx01().setVisible(true);
	}
}