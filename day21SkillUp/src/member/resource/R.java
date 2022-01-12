package member.resource;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

import member.controller.Controller;
import member.controller.DeleteController;
import member.controller.EndController;
import member.controller.InputController;
import member.controller.ListController;
import member.controller.MenuController;
import member.controller.ModifyController;
import member.controller.SearchController;
import member.model.MemberDAO;
import member.view.Delete;
import member.view.End;
import member.view.Input;
import member.view.List;
import member.view.MainActivity;
import member.view.MemberView;
import member.view.Menu;
import member.view.Modify;
import member.view.Search;

public class R {
	// title of View pages(뷰 페이지의 제목들)
	// title of view pages
	public static final String titleInput = "::: 입력 기능 :::";
	public static final String titleList = "::: 회원 목록 :::";
	public static final String titleSearch = "::: 검색 기능 :::";
	public static final String titleModify = "::: 수정 기능 :::";
	public static final String titleDelete = "::: 삭제 기능 :::";
	public static final String titleEnd = "::: 프로그램 종료 :::";
	public static final String titleApp = "::: 회원관리 프로그램 :::";
	public static final String titleMenu = "::: 회원관리 프로그램 :::";

	public static final Scanner scan = new Scanner(System.in);

	public static final MemberView input = new Input();
	public static final MemberView list = new List();
	public static final MemberView search = new Search();
	public static final MemberView modify = new Modify();
	public static final MemberView delete = new Delete();
	public static final MemberView end = new End();
	public static final MemberView menu = new Menu();

	public static final MainActivity mainActivity = new MainActivity();

	public static final MemberDAO memDao = new MemberDAO();

	public static final Hashtable<Integer, Controller> ctrlMapper = new Hashtable<Integer, Controller>();
	public static final int MENU = 0, INPUT = 1, LIST = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	static {
		ctrlMapper.put(MENU, new MenuController());
		ctrlMapper.put(INPUT, new InputController());
		ctrlMapper.put(LIST, new ListController());
		ctrlMapper.put(SEARCH, new SearchController());
		ctrlMapper.put(MODIFY, new ModifyController());
		ctrlMapper.put(DELETE, new DeleteController());
		ctrlMapper.put(END, new EndController());
	}

	public static int no = MENU;

	// 다목적으로 데이터들이 바인딩 되도록 준비.
	public static final HashMap<String, Object> request = new HashMap<String, Object>();
}
