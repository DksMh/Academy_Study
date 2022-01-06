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
		String adr = scan.next();

		R.addressVo = new AddressVo(0, name, tel, adr);
		scan.nextLine();
		System.out.println("입력 완료");
		// 작업 완료후 자동으로 Controller로 이동.
	}
}