package org.comstudy21.ex06;

import javax.swing.JButton;
import javax.swing.JPanel;

//R에 있는 모든 것을 쓰겠다.
import static org.comstudy21.ex06.R.*;

public class BottomPane extends JPanel {
	
	public BottomPane() {
		this.add(allBtn);
		this.add(inputBtn);
		this.add(searchBtn);
		this.add(modifyBtn);
		this.add(deleteBtn);
		this.add(finshBtn);
	}

}
