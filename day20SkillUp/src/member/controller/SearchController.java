package member.controller;

import member.view.MemberView;

public class SearchController extends Controller{

	@Override
	public MemberView hadlerMapping() {
		// 어떤 처리를 하고 보여줄 화면을 반환
		return search; 
	}
	
}
