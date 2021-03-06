package day12;
// PhoneInterface 인터페이스를 구현하고 flash() 메소드를 추가한 
// SamsungPhone 클래스를 작성하라.

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}
}
class SamsungPhone implements PhoneInterface{
	@Override 
	public void sendCall() {
		System.out.println("띠리리리링"); 
	}
	@Override 
	public void receiveCall() {
		System.out.println("전화가 왔습니다."); 
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone sp = new SamsungPhone();
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();

	}

}
