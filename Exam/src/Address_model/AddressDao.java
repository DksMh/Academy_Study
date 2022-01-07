package Address_model;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddressDao {
	// 여기서 저장 만들어야 함
	public static File file1 = new File("C:\\Users\\Administrator\\addressBook.dat");
	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static ObjectOutputStream oos = null;
	public static ObjectInputStream ois = null;
	public static ArrayList<AddressVo> adrlist = new ArrayList<AddressVo>();
	public static int no = 1;
	public static File file2 = new File("C:\\Users\\Administrator\\AdrBook.txt");
	public static BufferedWriter bw;
	public static FileWriter fw;
	// fileload 저장된 파일이 있을 수 있음
	// dat파일이 거기에 있는 것을 나는 가지고 오고 싶다는 것을 말하는 것.
	// 없으면 새로 만들 거지만( save() ) 있으면 가지고 오라는 의미
	{
		try {
			fileload();
		} catch (ClassNotFoundException | IOException e) {
		}

	}

	// 저장
	public void save() throws IOException, ClassNotFoundException {
		fos = new FileOutputStream(file1);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(adrlist);
		oos.close();
		
		
		fw = new FileWriter(file2);
		bw = new BufferedWriter(fw);

		for (int i = 0; i < adrlist.size(); i++) {
			AddressVo newAdr = new AddressVo();
			newAdr.setNo(adrlist.get(i).getNo());
			newAdr.setName(adrlist.get(i).getName());
			newAdr.setTel(adrlist.get(i).getTel());
			newAdr.setAdr(adrlist.get(i).getAdr());

			bw.write(newAdr.toString());
			bw.newLine();
		}
		bw.flush();
		bw.close();

	}

	public void fileload() throws IOException, ClassNotFoundException {
		fis = new FileInputStream(file1);
		ois = new ObjectInputStream(fis);
		ArrayList<AddressVo> list2 = (ArrayList<AddressVo>) ois.readObject();
		adrlist.addAll(list2); // adrlist <- list2 넘김
		no = list2.get(list2.size()-1).getNo()+1; // 마지막 번호
	}

	// 입력
	public void insert(AddressVo vo) {
		vo.setNo(no++);
		adrlist.add(vo);
	}

	// 전체 출력
	public ArrayList<AddressVo> selectAll() {
		ArrayList<AddressVo> adrlist2 = new ArrayList<>();
		for (int i = 0; i < adrlist.size(); i++) {
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
			boolean flag = adrlist.get(i).equals(vo);
			if ( flag == true ) {
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
