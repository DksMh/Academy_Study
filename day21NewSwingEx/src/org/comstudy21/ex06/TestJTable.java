package org.comstudy21.ex06;

//R에 있는 모든 것을 쓰겠다.
import static org.comstudy21.ex06.R.allBtn;
import static org.comstudy21.ex06.R.columnNames;
import static org.comstudy21.ex06.R.dao;
import static org.comstudy21.ex06.R.data;
import static org.comstudy21.ex06.R.deleteBtn;
import static org.comstudy21.ex06.R.finshBtn;
import static org.comstudy21.ex06.R.inputBtn;
import static org.comstudy21.ex06.R.modifyBtn;
import static org.comstudy21.ex06.R.scrollPane;
import static org.comstudy21.ex06.R.searchBtn;
import static org.comstudy21.ex06.R.table;
import static org.comstudy21.ex06.R.tbModel;
import static org.comstudy21.ex06.R.txtFld1;
import static org.comstudy21.ex06.R.txtFld2;
import static org.comstudy21.ex06.R.txtFld3;
import static org.comstudy21.ex06.R.txtFld4;
import static org.comstudy21.ex06.R.rb01; // ----> 라디오 버튼 만든 거 회원
import static org.comstudy21.ex06.R.rb02; // ----> 라디오 버튼 만든 거 비회원

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.guiex.myframe.MyJframe;

public class TestJTable extends MyJframe {
	public TestJTable() {
		super("JTable 연습", 640, 480);
	}

	private void mkTableData() {
		columnNames = new Vector();
		columnNames.add("IDX");
		columnNames.add("USER");
		columnNames.add("EMAIL");
		columnNames.add("PHONE");
		columnNames.add("MEMBER");

		// Object[][] 배열을 대체하는 코드
		data = dao.selectAll();

//		columnNames = new Object[] { "IDX", "USER", "EMAIL", "PHONE" };
//		data = new Object[][] { { 1, "hong", "hong@a.com", "010-1111-1111" },
//				{ 2, "kim", "kim@a.com", "010-2222-2222" }, { 3, "lee", "lee@a.com", "010-3333-3333" } };
	}

	@Override
	protected void displayLayer() {
		mkTableData();
		contentPan = getContentPane();

		contentPan.add(BorderLayout.WEST, new LeftPane());
		contentPan.add(BorderLayout.SOUTH, new BottomPane());

		tbModel = new DefaultTableModel(data, columnNames);
		table = new JTable(tbModel);

		scrollPane = new JScrollPane(table);
		contentPan.add(scrollPane);
//		table = new JTable(tbModel);
//		scrollPane = new JScrollPane(table);
//		contentPan.add(scrollPane);
		
	}
	
	private void addRowDataTest() {
//		tbModel.setDataVector(null, columnNames); // -> 테이블만 남고 지워짐 / mapping했다는 것임
//		tbModel.addRow(new Object[] { 4, "aaa", "aaa@naver.com", "010-4444-4444" }); // -> 지우고 이것만 넣어줌
//		tbModel.addRow(new Object[] { 5, "bbb", "bbb@naver.com", "010-5555-5555" });
	}

	private void displayList() {
		tbModel.setDataVector(null, columnNames);
		Vector<Vector> saramList = dao.selectAll();
		for (Vector vector : saramList) {
			tbModel.addRow(vector);

		}
	}

	protected void actionEvent() {
		// 테이블 이벤트 핸들러 추가
		// tbModel에 데이터를 누르면 옆에 textfield로 들어가게 만들기
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			} // 눌렀다 뗄때

			public void mousePressed(MouseEvent e) {
//				System.out.println(">> 마우스를 눌렀다");
				JTable tbl = (JTable) e.getSource();
				// 테이블의 전체 행과 열 알아내기
				int totalcol = tbl.getColumnCount();
				int totalrow = tbl.getRowCount();
				// 선택한 컬럼 행과 열 알아내기
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
//				System.out.println(row+","+col); 
				// 데이터 찾아오기
				int idx = (int) tbModel.getValueAt(row, 0);
				String name = (String) tbModel.getValueAt(row, 1);
				String email = (String) tbModel.getValueAt(row, 2);
				String phone = (String) tbModel.getValueAt(row, 3);
				String member = (String) tbModel.getValueAt(row, 4);
				// 확인하기
//				System.out.println(idx+", "+name+", "+email+", "+phone);
				// 찾아 온 데이터 적용하기
				txtFld1.setText("" + idx);
				txtFld2.setText(name);
				txtFld3.setText(email);
				txtFld4.setText(phone);
				rb01.setText(member);
				

			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}

		});
		// 버튼 이벤트 핸들러 추가
		allBtn.setBorderPainted(false);
		allBtn.setContentAreaFilled(false);
		allBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">> allBtn 클릭");
				displayList();
			}
		});
		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">> inputBtn 클릭");
				// textField의 데이터를 읽어온다.
				String name = txtFld2.getText();
				txtFld2.setText(""); // 읽어왔으니 비워준다.
				String email = txtFld3.getText();
				txtFld3.setText("");
				String phone = txtFld4.getText();
				txtFld4.setText("");
				System.out.println(rb01.getName()); 
				//============================================================수정해야함
				// 되는지 test
//				System.out.println("name => "+name);
//				System.out.println("email => "+email);
//				System.out.println("phone => "+phone);

				// TableModel 에 반영해주기
				// dao에 저장 후
//				dao.insert(new SaramDto(0, name, email, phone));
				// list를 다시 그려준다.
				displayList();
//				tbModel.addRow(new Object[] { sequence++, name, email, phone });
			}

		});
		searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(">>> searchBtn 클릭!");
//				String name = txtFld2.getText();
//				Vector vector = dao.search(new SaramDto(0, name, null, null));
//				tbModel.setDataVector(null, columnNames);
//				tbModel.addRow(vector);
				
				String name = txtFld2.getText();
				Vector<Vector> saramList = dao.selectList(new SaramDto(0, name, null, null, null));
				tbModel.setDataVector(null, columnNames);
				for (Vector vector : saramList) {
					tbModel.addRow(vector);

				}
				
			}
		});
		modifyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> modifyBtn 클릭!");
				int idx = Integer.parseInt(txtFld1.getText());
				String name = txtFld2.getText();
				String email = txtFld3.getText();
				String phone = txtFld4.getText();
				String member = rb01.getText(); // =============================================================수정해야함
				Vector vector = dao.modify(new SaramDto(idx, name, email, phone, member));
//				tbModel.setDataVector(null, columnNames);
//				tbModel.addRow(vector);
				displayList();

			}
		});
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> deleteBtn 클릭!");
				int idx = Integer.parseInt(txtFld1.getText());
				String name = txtFld2.getText();
				String email = txtFld3.getText();
				String phone = txtFld4.getText();
				String member = rb01.getText(); // =============================================================수정해야함
				Vector vector = dao.delete(new SaramDto(idx, name, email, phone, member));
//				tbModel.setDataVector(null, columnNames);
//				tbModel.addRow(vector);
				displayList();
			}
		});
		finshBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(TestJTable.this, "굿바이");
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new TestJTable().setVisible(true);
	}

}
