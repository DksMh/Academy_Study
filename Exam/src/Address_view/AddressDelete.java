package Address_view;

import Address.R;

public class AddressDelete extends AddressView{
	@Override
	public void display() {
		System.out.println("::::: 주소록 정보 삭제 :::::");
		if(R.addressVo == null) {
			System.out.println("검색 결과가 없습니다!");
			return;
		}
		System.out.println(R.addressVo);
		System.out.print("정말 삭제하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'N' || yn == 'n') {
			R.addressVo = null;
		}else {
			System.out.println("삭제가 취소되었습니다.");
		}
		
	}
}
