package org.comstudy21.saram.view;

import org.comstudy21.saram.R;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: 사람 정보 수정 :::::");
		if(R.saramVo == null) {
			System.out.println("검색결과 없음");
			return;
		}
		System.out.println(R.saramVo);
		System.out.println("수정 항목을 선택하세요.");
//		System.out.println("1.이름 2.연락처 3.이메일 4.모두");
		System.out.println("이름을 수정하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이름 >> ");
			R.saramVo.setName(scan.next()); 			
		}
		System.out.println("연락처 수정하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 연락처 >>");
			R.saramVo.setPhone(scan.next()); 
		}
		System.out.println("이메일 수정하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이메일 >>");
			R.saramVo.setEmail(scan.next()); 
		}
	}
}
