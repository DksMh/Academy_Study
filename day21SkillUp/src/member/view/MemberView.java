package member.view;

import member.resource.R;

public abstract class MemberView extends R{ 
	// 최상위라 여기에 extends R을 하면 
	// 하위 입력, 검색, 수정, 삭제, 종료에 다 import 필요가 없어진다
	public void display() {
		
		boolean isMenu = onCreate();
//		System.out.println(">>> 기능실행 후 ... ");
		// 모든 뷰가 공통으로 끝날 때 실행된
		if(!isMenu) { // Menu가 아닐때만
			no = MENU;
		}
		System.out.println("-------------------------------------");
	}
	public abstract boolean onCreate();
}
