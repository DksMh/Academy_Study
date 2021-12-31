package org.comstudy21.notice;

import org.comstudy21.notice.contoller.NoticeController;
import org.comstudy21.notice.model.NoticeVo;
import org.comstudy21.notice.view.InsertView;
import org.comstudy21.notice.view.MenuView;
import org.comstudy21.notice.view.NoticeByMessage;
import org.comstudy21.notice.view.NoticeByName;
import org.comstudy21.notice.view.NoticeDelete;
import org.comstudy21.notice.view.NoticeDetail;
import org.comstudy21.notice.view.NoticeEdit;
import org.comstudy21.notice.view.NoticeListView;
import org.comstudy21.notice.view.NoticeView;

public class R {
	public static int no;
	public static NoticeVo noticeVo;
	public static NoticeVo[] noticeArr;
	
	public static NoticeView menuView = new MenuView();
	public static NoticeView insertView = new InsertView();
	public static NoticeView noticeDetail = new NoticeDetail();
	public static NoticeView noticeEdit = new NoticeEdit();
	public static NoticeView noticeDelete = new NoticeDelete();
	public static NoticeView noticeListView = new NoticeListView();
	public static NoticeView noticeByName = new NoticeByName();
	
	public static NoticeView noticeByMessage = new NoticeByMessage();
	public static TestDate date = new TestDate();
	

	
	
	public static final NoticeController noticeController = new NoticeController();
	
}