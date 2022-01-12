package member.view;

public class MainActivity {
	public void setContentView(MemberView view){
		view.display(); // display에서 onCreate()실행 (동적 바인딩)
	}
}
