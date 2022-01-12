package member.controller;

import java.util.List;

import member.model.MemberDTO;
import member.view.MemberView;

public class ListController extends Controller{

	@Override
	public MemberView hadleRequest() {
		List<MemberDTO> memList = memDao.selectAll();
		request.put("memList", memList);
		// 어떤 처리를 하고 보여줄 화면을 반환
		return list; 
	}
	
}
