package member.controller;

import member.view.MemberView;

public class ModifyController extends Controller{

	@Override
	public MemberView hadleRequest() {
		// 어떤 처리를 하고 보여줄 화면을 반환
		return modify; 
	}
	
}
