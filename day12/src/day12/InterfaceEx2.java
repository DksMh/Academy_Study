package day12;
// 인터페이스를 구현하고 동시에 클래스를 상속받는 사례
// SmartPhone 클래스는 PDA를 상속받고,
// MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한 후,
// 추가로 메소드를 작성한다.

interface PhoneInterface2 { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}
}
interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface { // 인터페이스 선언
	public void play();
	public void stop();
}
class PDA { // 클래스 작성
	public int calculate(int x, int y) {
		return x + y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{	
	@Override
	public void sendCall() {
		System.out.println("전화 검");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 옴");
	}
	@Override
	public void sendSMS() {
		System.out.println("메세지 전송");
	}
	@Override
	public void receiveSMS() {
		System.out.println("메세지 도착");
	}
	@Override
	public void play() {
		System.out.println("음악 실행");
	}
	@Override
	public void stop() {
		System.out.println("음악 중지");
	}
	// 추가 메소드
	public void appdownload() {
		System.out.println("앱을 다운로드 합니다.");
	}
	
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();
		sp.sendSMS();
		sp.receiveSMS();
		sp.play();
		sp.stop();
		sp.appdownload();
		System.out.println(sp.calculate(3, 4));

	}

}
