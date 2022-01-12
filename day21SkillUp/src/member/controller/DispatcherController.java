package member.controller;

import static member.resource.R.*;
import member.view.MemberView;

public class DispatcherController {
	private static MemberView view = null;
	private static Controller ctrl = null; // 멤버필드

	public static void run() {
//		view = new InputController().hadleRequest();
//		view = new MenuController().hadleRequest();
		if (no == INPUT) {
			mainActivity.setContentView(input);
			ctrl = ctrlMapper.get(no);
			view = ctrl.hadleRequest();
		} else {
			ctrl = ctrlMapper.get(no);
			view = ctrl.hadleRequest();
			mainActivity.setContentView(view);
		}
		run(); // 재귀호출
//		no = MENU;

	}
}
