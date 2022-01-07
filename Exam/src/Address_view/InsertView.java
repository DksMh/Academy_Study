package Address_view;

import Address.R;
import Address_model.AddressVo;
public class InsertView extends AddressView {
	@Override
	public void display() {
		System.out.println(":::: 입력 기능 ::::");
		System.out.print("이름 입력 >>> ");
		String name = scan.next();
		System.out.print("전화번호 입력 >> ");
		String tel = scan.next();
		System.out.print("주소 입력 >> ");
		String adr = scan2.nextLine();

		R.addressVo = new AddressVo(0, name, tel, adr);
		System.out.println("입력 완료");
	}
}