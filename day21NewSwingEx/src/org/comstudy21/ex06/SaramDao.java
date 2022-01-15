package org.comstudy21.ex06;

import java.util.Vector;

public class SaramDao {
	// view 에 있는 것을 일관성을 위해 여기로 옮김
	private static Vector<SaramDto> saramList = new Vector<SaramDto>();
	static {
		saramList.add(new SaramDto(1, "kim", "kim@aa.com", "010-1111-1111","회원"));
		saramList.add(new SaramDto(2, "lee", "lee@aa.com", "010-2222-2222","비회원"));
		saramList.add(new SaramDto(3, "park", "park@aa.com", "010-3333-3333","회원"));
	}
	public static int sequence = 4;

	public Vector selectAll() {
		Vector vector = new Vector();
		for (int i = 0; i < saramList.size(); i++) {
			vector.add(saramList.get(i).toVector()); // toVector -> 데이터를 Vector로 넘겨주는 거 만듬
		}
		return vector;
	}
	
	public Vector selectList(SaramDto saramDto) {
		Vector vector = new Vector();
		for (int i = 0; i < saramList.size(); i++) {
			if(saramDto.getName().equals(saramList.get(i).getName())) {				
				vector.add(saramList.get(i).toVector()); // toVector -> 데이터를 Vector로 넘겨주는 거 만듬
			}
		}
		return vector;
	}

	public void insert(SaramDto saramDto) {
		if (saramDto != null) {
			saramDto.setIdx(sequence++);
			saramList.add(saramDto);
		}
	}
	public Vector search(SaramDto saramDto) {	
		Vector vector = new Vector();
		for(int i = 0; i<saramList.size(); i++) {
			if(saramDto.getName().equals(saramList.get(i).getName())) {
				vector = saramList.get(i).toVector();
				return vector;
			}
		}
		return null;
	}
		
	
	public Vector modify(SaramDto saramDto) {	
		Vector vector = new Vector();		
		int index = 0;
		for(int i = 0; i<saramList.size(); i++) {
			if(saramDto.getIdx() == saramList.get(i).getIdx()) {
				index = i;
				saramList.set(index, saramDto);
			}
		}
		vector = saramList.get(index).toVector();
		return vector;
	}

	public Vector delete(SaramDto saramDto) {	
		Vector vector = new Vector();		
		int index = 0;
		for(int i = 0; i<saramList.size(); i++) {
			if(saramDto.getIdx() == saramList.get(i).getIdx()) {
				index = i;
				saramList.remove(index);
			}
		}
		vector = saramList.get(index).toVector();
		return vector;
	}
}
