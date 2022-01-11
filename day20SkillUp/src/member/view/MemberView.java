package member.view;

import member.resource.R;

public abstract class MemberView extends R{ 
	// 최상위라 여기에 extends R을 하면 
	// 하위 입력, 검색, 수정, 삭제, 종료에 다 import 필요가 없어진다
	public void display() {
		onCreate();
	}
	public abstract void onCreate();
}
