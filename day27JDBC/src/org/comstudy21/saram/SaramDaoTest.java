package org.comstudy21.saram;

import java.util.List;

import org.comstudy21.saram.model.SaramDao;
import org.comstudy21.saram.model.SaramDto;

public class SaramDaoTest {

	public static void main(String[] args) {
		testSaramSelectAll();
		//testSaramSelectOne();
//		testInsert();
//		testUpdate();
//		testDelete();
//		testSaramSelectId();
//		testSaramSelectName();
	}

	private static void testSaramSelectName() {
		List<SaramDto> saram = SaramDao.selectByName(new SaramDto(0, null, "BUN", 0));
		System.out.println(saram.toString());
//		SaramDto saram = SaramDao.selectByName(new SaramDto(0, null, "gilsun", 0));
//		System.out.println(saram.toString());
		
	}

	private static void testSaramSelectId() {
		SaramDto saram = SaramDao.selectById(new SaramDto(0, "KIM", null, 0));
		System.out.println(saram.toString());
		
	}

	private static void testDelete() {
		SaramDto dto = new SaramDto(1, null, null, 0);
		SaramDao.delete(dto);
		testSaramSelectAll();
		
	}

	private static void testUpdate() {
		SaramDto dto = new SaramDto(3, "JUN", "BUN", 45);
		SaramDao.update(dto);
		testSaramSelectAll();
	}

	private static void testInsert() {
		SaramDao.insert(new SaramDto(0, "test1", "name1", 15));
	}

	private static void testSaramSelectOne() {
		SaramDto saram = SaramDao.selectOne(new SaramDto(1, null, null, 0));
		System.out.println(saram.toString());
		
	}

	private static void testSaramSelectAll() {
		List<SaramDto> list = SaramDao.selectAll();
		for(SaramDto saram : list) {
			System.out.println(saram);
		}
	}

}
