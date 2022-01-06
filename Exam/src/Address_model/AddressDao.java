package Address_model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Address_model.AddressVo;

public class AddressDao {
	// 여기서 저장 만들어야 함
	private static final int MAX = 100;
	private static final AddressVo[] adrArr = new AddressVo[MAX];
	public static int top = 0;
	public static int sequenceNo = 1;
	public static ArrayList<AddressVo> adrlist = new ArrayList<AddressVo>();
	public static int no = 1;
	

	// 입력
	public void insert(AddressVo vo) {
		for (int i = 0; i < adrlist.size(); i++) {
		}
		adrlist.add(vo);
		vo.setNo(no++);
	}
	// 전체 출력
	public ArrayList<AddressVo> selectAll() {
		ArrayList<AddressVo> adrlist2 = new ArrayList<>();
		for (int i = 0; i < adrlist.size(); i++) {
			// 새로 만든 객체에 값만 올겨 담기.
			AddressVo newAdr = new AddressVo();
			newAdr.setNo(adrlist.get(i).getNo());
			newAdr.setName(adrlist.get(i).getName());
			newAdr.setTel(adrlist.get(i).getTel());
			newAdr.setAdr(adrlist.get(i).getAdr());
			adrlist2.add(newAdr);
		}
		return adrlist2;
	}	

	// 검색 - 이름으로
	public AddressVo search(AddressVo vo) {
		for (int i = 0; i < adrlist.size(); i++) {
			if (adrlist.get(i).getName().equals(vo.getName())) {
				AddressVo newAdr = new AddressVo();
				newAdr.setNo(adrlist.get(i).getNo());
				newAdr.setName(adrlist.get(i).getName());
				newAdr.setTel(adrlist.get(i).getTel());
				newAdr.setAdr(adrlist.get(i).getAdr());
				return newAdr;
			}
		}
		return null;
	}

	// 수정
	public void update(AddressVo vo) {
		if (vo == null)
			return;
		for (int i = 0; i < adrlist.size(); i++) {
			if (adrlist.get(i).getNo() == vo.getNo()) {
				adrlist.set(i, vo);
			}
		}
	}

	// 삭제
	public void delete(AddressVo vo) {
		if (vo != null) {
			int index = adrlist.indexOf(vo);
			adrlist.remove(index); // index 인덱스의 요소 삭제 -> 이 인덱스는 ArrayList의 인덱스
		}
	}

	// 종료

}
