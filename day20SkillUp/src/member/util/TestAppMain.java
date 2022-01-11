package member.util;

import member.resource.R;

public class TestAppMain extends R{
	public TestAppMain() {
		viewTest();
	}
	private void viewTest() {
		mainActivity.setContentView(input);
	}
	public static void main(String[] args) {
		new TestAppMain();

	}

}
