package Address_view;

import Address.R;
import Address_model.AddressVo;

public class AddressByName extends AddressView {
	@Override
	public void display() {
		System.out.println("::::: 주소록 정보 검색 :::::");
		System.out.print("검색 할 이름 >> ");
		String name = scan.next();
		R.addressVo = new AddressVo(0, name, null, null);
		// controller로 이동
	}
}