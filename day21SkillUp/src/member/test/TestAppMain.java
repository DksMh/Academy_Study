package member.test;

import java.util.List;

import member.model.MemberDTO;
import member.resource.R;

public class TestAppMain extends R {
	public TestAppMain() {
//		viewTest();
//		daoInsertTest();
//		daoDeleteTest();
//		daoUpdateTest();
//		daoSelectTest();
//		daoSelectOneTest();
		daoSelectByNameTest();
	}

	private void daoSelectByNameTest() {
		List<MemberDTO> list = memDao.selectByName("이순신");
		System.out.println(list);
	}

	private void daoSelectOneTest() {
		MemberDTO member = memDao.selectOne(new MemberDTO(2, null, null, null));
		System.out.println(member);

	}

	private void daoUpdateTest() {
		memDao.update(new MemberDTO(2, "강감찬", "kang@a.com", "010-9999-9999"));

	}

	private void daoDeleteTest() {
		memDao.delete(new MemberDTO(2, null, null, null));

	}

	private void daoInsertTest() {
		memDao.insert(new MemberDTO(0, "마이콜", "my@a.com", "010-1234-1345"));

	}

	private void daoSelectTest() {
		List<MemberDTO> list = memDao.selectAll();
		for (MemberDTO mem : list) {
			System.out.println(mem);
		}
	}

	private void viewTest() {
		mainActivity.setContentView(input);
	}

	public static void main(String[] args) {
		new TestAppMain();

	}

}
