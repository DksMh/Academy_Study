package Address;
// 제목 : 컬렉션, 파일IO 기능을 활용한 주소록 프로그램 구현
// 간단한 CRUD 기능과 파일 저장 기능을 구현

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Address_model.AddressVo;

public class Address_main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		System.out.println("---- 주소록 관리 프로그램 ----");
		R.AddressController.action(); 

	}

}
