package org.comstudy21.notice.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comstudy21.notice.model.NoticeVo;

public class NoticeDao {
	private static final int MAX = 100;
	private static final NoticeVo[] noticeArr = new NoticeVo[MAX]; 
	private static int top = 0; 
	private static int noticeSeq = 1;
	
	public static String regDate() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		return formattedDate;
		
	}
	
	// selectAll, selectOne, selectByNo, update, insert, delete 구현
	static {
		noticeArr[top++] = new NoticeVo(noticeSeq++, "KIM", "hi", regDate());
		noticeArr[top++] = new NoticeVo(noticeSeq++, "LEE", "hello", regDate());
		noticeArr[top++] = new NoticeVo(noticeSeq++, "PARK", "bye", regDate());
	}
	
	
	
	public NoticeVo[] selectAll() {
		// noticeArr와 참조 끊기 - 새 배열과 새 객체가 필요하다.
		NoticeVo[] newArr = new NoticeVo[top];
		for (int i = 0; i < newArr.length; i++) {
			// 새로 만든 객체에 값만 올겨 담기.
			NoticeVo newNotice = new NoticeVo();
			newNotice.setNo(noticeArr[i].getNo());
			newNotice.setUser(noticeArr[i].getUser());
			newNotice.setMessage(noticeArr[i].getMessage());
			newNotice.setRegDate(noticeArr[i].getRegDate());
			newArr[i] = newNotice;
		}
		return newArr;
	}

	
	public NoticeVo selectOne(NoticeVo vo) {
		// 1. 검색하기
		// 2. 같은 요소가 존재하면 복제해서 반환(return)
		for (int i = 0; i < top; i++) {
			if (vo.getUser().equals(noticeArr[i].getUser())) {
				NoticeVo newNotice = new NoticeVo();
				newNotice.setNo(noticeArr[i].getNo());
				newNotice.setUser(noticeArr[i].getUser());
				newNotice.setMessage(noticeArr[i].getMessage());
				newNotice.setRegDate(noticeArr[i].getRegDate());
				return newNotice;
			}
		}
		return null;
	}

	public NoticeVo selectMessage(NoticeVo vo) {
		// 1. 메시지 검색하기
		// 2. 같은 요소가 존재하면 복제해서 반환(return)
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getMessage().indexOf(vo.getMessage()) != -1) { //비교할대상.indexof(비교할 값)
				NoticeVo newNotice = new NoticeVo();
				newNotice.setNo(noticeArr[i].getNo());
				newNotice.setUser(noticeArr[i].getUser());
				newNotice.setMessage(noticeArr[i].getMessage());
				newNotice.setRegDate(noticeArr[i].getRegDate());
				return newNotice;
			}
		}
		return null;
	}

	// insert
	public void insert(NoticeVo vo) {
		if (top >= MAX) {
			System.out.println(">>> 더이상 입력이 불가능합니다!");
			return;
		}
		vo.setNo(noticeSeq++);
		noticeArr[top++] = vo;
	}

	// update
	public void update(NoticeVo vo) {
		// 검색해서 같은 요소가 있다면 수정하기, no로 검색해서 index를 찾기
		if(vo == null) return;
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getNo() == vo.getNo()) {
				noticeArr[i] = vo;
				noticeArr[i].setRegDate(regDate());
			}
		}

	}

	// delete
	public void delete(NoticeVo vo) {
		// 1. no로 검색하기
		// 2. 같은 요소가 있다면 한칸씩 땡기기
		// 3. 마지막 요소는 null로 변경하고 top감소
		for (int i = 0; i < top; i++) {
			if (noticeArr[i].getNo() == vo.getNo()) {  //no는 변하지 않음
				for(int j=i; j<top-1; j++) {
					noticeArr[i] = noticeArr[i+1];
				}
				noticeArr[top-1] = null;
				top--;
			}
		}
	}
	
	
}