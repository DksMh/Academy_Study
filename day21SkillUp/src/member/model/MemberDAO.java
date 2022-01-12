package member.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class MemberDAO {
	private static final Vector<MemberDTO> memList = new Vector<MemberDTO>();
	private static int sequence = 1;
	static {
		memList.add(new MemberDTO(sequence++, "홍길동", "hong@a.com", "010-1111-1111"));
		memList.add(new MemberDTO(sequence++, "이순신", "lee@a.com", "010-2222-2222"));
		memList.add(new MemberDTO(sequence++, "일지매", "il@a.com", "010-3333-3333"));
		memList.add(new MemberDTO(sequence++, "이순신", "il2@a.com", "010-3232-3232"));
	}

	// 목록
	public List<MemberDTO> selectAll() { // 다넘겨줌
		List<MemberDTO> list = new ArrayList<MemberDTO>();
//		Collections.copy(list, memList);
		// Vector<MemberDTO> memList 복사 받아서 List<MemberDTO> list 넣어줌
		for(MemberDTO mem : memList) {
			list.add((MemberDTO) mem.clone());
		}
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
	
	// 입력
	public void insert(MemberDTO memberDTO) {
		memberDTO.setIdx(sequence++);
		memList.add(memberDTO);
	}

}
