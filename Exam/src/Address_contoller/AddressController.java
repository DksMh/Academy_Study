package Address_contoller;

import Address.R;
import Address.ViewContainer;
import Address_model.AddressDao;

public class AddressController {
	private ViewContainer vc = new ViewContainer();
	private AddressDao dao = new AddressDao();
	public void action() {
//		System.out.println(">>>> SaramController 실행 ...");
		if(R.no == 0) { // no = 0면 선택 안됨
			vc.run(R.menuView);
		}
		switch(R.no) {
		case 1 : 
			vc.run(R.insertView); 
			dao.insert(R.addressVo);
			break;
		case 2 : 
			R.adrlist = dao.selectAll();
			vc.run(R.AddressListView);
			break;
		case 3 : 
			vc.run(R.AddressByName); 
			R.addressVo = dao.search(R.addressVo);
			vc.run(R.AddressDetail); 			
			break;
		case 4 : 
			vc.run(R.AddressByName); 
			R.addressVo = dao.search(R.addressVo);
			vc.run(R.AddressEdit); 
			if(R.addressVo != null) {
				dao.update(R.addressVo);
			}
			break;
		case 5 : 
			vc.run(R.AddressByName); 
			R.addressVo = dao.search(R.addressVo);
			vc.run(R.AddressDelete); 
			if(R.addressVo != null) {
				dao.delete(R.addressVo);
			}
			break;
		case 6 : System.out.println("프로그램 종료"); System.exit(0); break;
		case 7 : System.out.println("저장프로그램 만드는 중"); 
		default : System.out.println("해당 기능이 없습니다.");
		}
		// 재귀 호출
		R.no = 0;
		action();
		
	}
}
