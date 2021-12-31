package org.comstudy.ch05_6;

class 할배{
	public void 나팔() {
		System.out.println("할배의 나팔 뽕!");
	}
}
class 아배 extends 할배{
	@Override
	public void 나팔() { // 오버라이드 -> 매개변수까지 똑같아야함 지금은 ()
		System.out.println("아배의 나팔 삐리리!");
	}
}
class 손자 extends 아배{
	@Override
	public void 나팔() {
		System.out.println("손자의 나팔 뿡뿡!");
	}
}

public class Ch05Ex30 {

	public static void main(String[] args) {
		할배[] family = new 할배[5]; // 배열 만들어지고 참조변수 5개가 생김
		family[0] = new 할배(); 
		family[1] = new 아배(); 
		family[2] = new 손자(); 
		family[3] = new 아배(); 
		family[4] = new 손자();
		
		for(할배 h : family) { // family가 돌아가면서 h([0]~[4])에 들어감 
			h.나팔();// 동적 바인딩
		}

	}

}
