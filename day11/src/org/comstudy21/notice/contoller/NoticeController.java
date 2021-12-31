package org.comstudy21.notice.contoller;

import org.comstudy21.notice.R;
import org.comstudy21.notice.ViewContainer;
import org.comstudy21.notice.model.NoticeDao;

public class NoticeController {
	private ViewContainer vc = new ViewContainer();
	private NoticeDao dao = new NoticeDao();

	public void action() {
		// System.out.println(">>>> SaramController 실행 ...");
		if (R.no == 0) {
			vc.run(R.menuView); // 동적 바인딩 처리된다.
		}

		switch (R.no) {
		case 1:
			vc.run(R.insertView);
			dao.insert(R.noticeVo);
			break;
		case 2:
			R.noticeArr = dao.selectAll();
			vc.run(R.noticeListView);
			break;
		case 3:
			vc.run(R.noticeByName);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.noticeDetail);
			break;
			// 검색(메시지) 추가
		case 4:
			vc.run(R.noticeByMessage);
			R.noticeVo = dao.selectMessage(R.noticeVo);
//			R.noticeVo => message만 갖고있는 객체.
//			이걸 dao로 보내서 message가 포함된 객체를 갖고와야된다.
//			처리를 dao에서!
			vc.run(R.noticeDetail);
			break;
		case 5:
			vc.run(R.noticeByName);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.noticeEdit); 
			if(R.noticeVo != null) {
				dao.update(R.noticeVo);
			}
			
			break;
		case 6:
			vc.run(R.noticeByName);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.noticeDelete); 
			if(R.noticeVo != null) {
				dao.delete(R.noticeVo);			
			}
			break;
		case 7:
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default:
			System.out.println("해당 기능이 없습니다!");
		}

		// 재귀 호출
		R.no = 0;
		action();
	}
}