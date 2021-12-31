package org.comstudy21.notice;

import org.comstudy21.notice.model.NoticeDao;
import org.comstudy21.notice.model.NoticeVo;

public class NoticeDaoTest {

	public static NoticeDao dao = new NoticeDao();

	// DAO 테스트 delete
	public static void test_delete(String[] args) {
		dao.delete(new NoticeVo(2, null, null, null));
		// 전체 출력
		test_selectAll(null);
	}

	// DAO 테스트 SelectMessage
	public static void main(String[] args) {
		NoticeVo vo = new NoticeVo(0, null, "hi", null);
		NoticeVo notice = dao.selectMessage(vo);
		System.out.println(notice);
	}
	
	// DAO 테스트 selectOne
	public static void test_selectOne(String[] args) {
		NoticeVo vo = new NoticeVo(0, "LEE", null, null);
		NoticeVo notice = dao.selectOne(vo);
		System.out.println(notice);
	}

	// DAO 테스트 selectAll
	public static void test_selectAll(String[] args) {

		NoticeVo[] noticeArr = dao.selectAll();
		for (NoticeVo notice : noticeArr) {
			System.out.println(notice);
		}
	}

}