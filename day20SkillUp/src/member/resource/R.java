package member.resource;

import java.util.Scanner;

import member.view.Delete;
import member.view.End;
import member.view.Input;
import member.view.List;
import member.view.MainActivity;
import member.view.MemberView;
import member.view.Modify;
import member.view.Search;

public class R {
	// title of View pages(뷰 페이지의 제목들)
	public static final String titleInput = "::: 입력 기능 :::";
	public static final String titleList = "::: 회원 목록 :::";
	public static final String titleSearch = "::: 검색 기능 :::";
	public static final String titleModify = "::: 수정 기능 :::";
	public static final String titleDelete = "::: 삭제 기능 :::";
	public static final String titleEnd = "::: 프로그램 종료 :::";
	public static final String titleApp = "::: 회원관리 프로그램 :::";
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static final MemberView input = new Input();
	public static final MemberView list = new List();
	public static final MemberView search = new Search();
	public static final MemberView modify = new Modify();
	public static final MemberView delete = new Delete();
	public static final MemberView end = new End();
	
	public static final MainActivity mainActivity = new MainActivity();
	
}
