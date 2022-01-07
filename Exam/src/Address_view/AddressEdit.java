package Address_view;

import Address.R;

public class AddressEdit extends AddressView {
	@Override
	public void display() {
		System.out.println("::::: 주소록 정보 수정 :::::");
		if(R.addressVo == null) {
			System.out.println("검색 결과 없습니다!");
			return;
		}
		System.out.println(R.addressVo);
		System.out.println("수정 항목을 선택하세요.");
		System.out.print("이름을 수정하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이름 >> ");
			R.addressVo.setName(scan.next());
		}
		
		System.out.print("전화번호를 수정하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 번호 >> ");
			R.addressVo.setTel(scan.next());
		}
		
		System.out.print("주소를 수정하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		scan.nextLine();
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 주소 >> ");
			R.addressVo.setAdr(scan.nextLine());
		}
	}
}