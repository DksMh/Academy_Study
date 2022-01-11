package member.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class MemberDAO {
	private static final Vector<MemberDTO> memList = new Vector<MemberDTO>();

	// 목록
	public List<MemberDTO> selectAll() { // 다넘겨줌
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Collections.copy(list, memList);
		// Vector<MemberDTO> memList 복사 받아서 List<MemberDTO> list 넣어줌
		return list;
	}

	// 상세보기 서치
	public MemberDTO selectOne(MemberDTO dto) { // 1개만 넘겨줌
		MemberDTO member = null;
		int i = memList.indexOf(dto);
		if (i != -1) {
			member = memList.get(i);
		}
		return member;
	}

	// 이름으로 검색
	public List<MemberDTO> selectByName(String name) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		for (int i = 0; i < memList.size(); i++) {
			MemberDTO mem = memList.get(i);
			if (name.equals(mem.getName())) {
				list.add((MemberDTO) mem.clone());
			}
		}
		return list;
	}

	// 삭제
	public boolean delete(MemberDTO dto) {
		return memList.remove(dto);
	}

	// 수정
	public MemberDTO update(MemberDTO dto) {
		int i = memList.indexOf(dto);
		if (i != -1) {
			return memList.set(i, dto);
		} else {
			return null; // 업데이트 못한다고 알려주는 거
		}
	}

	// 불러오기
	public List<MemberDTO> fileload() {
		return null;
	}

	// 저장
	public boolean filesave(List<MemberDTO> list) {
		return false;
	}

}
