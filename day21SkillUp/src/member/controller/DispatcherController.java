package member.controller;

import static member.resource.R.*;
import member.view.MemberView;

public class DispatcherController {
	private static MemberView view = null;
	private static Controller ctrl = null; // 멤버필드

	public static void run() {
//		view = new InputController().hadleRequest();
//		view = new MenuController().hadleRequest();
		if(no == INPUT) {
			mainActivity.setContentView(input); // -> onCreate()에서 메뉴를 다 0으로 만들어줬다. 그래서 0이다 지금
			ctrl = ctrlMapper.get(INPUT); // 그러니까 INPUT = 2로 넣어준 것이다.
			ctrl.hadleRequest();
		} else {
			ctrl = ctrlMapper.get(no);
			view = ctrl.hadleRequest();
			mainActivity.setContentView(view);
		}
		run(); // 재귀호출
//		no = MENU;

	}
}
