package Address_view;

import Address.R;

public class AddressDetail extends AddressView {
	@Override
	public void display() {
		System.out.println("::::: 주소록 정보 상세보기 :::::");
		System.out.println(R.addressVo);
	}
}
