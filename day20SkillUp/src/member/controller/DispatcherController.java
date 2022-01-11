package member.controller;

import member.resource.R;
import member.view.MemberView;

public class DispatcherController extends R{
	private static MemberView view = null;
	public static void run(){
		view = new InputController().hadlerMapping();
		
		mainActivity.setContentView(view);
		
	}
}
