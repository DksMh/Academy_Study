package Address_view;

import java.util.Iterator;

import Address.R;
import Address_model.AddressVo;

public class AddressListView extends AddressView {
	@Override
	public void display() {
		System.out.println("::::: 주소록 목록 :::::");

		Iterator<AddressVo> it = R.adrlist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}