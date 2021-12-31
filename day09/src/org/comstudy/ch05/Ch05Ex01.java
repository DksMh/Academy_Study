package org.comstudy.ch05;

// 1개의 java 파일에 여러 클래스 선언 가능 (팩키지 멤버) 
// 한 점을 구성하는 x,y좌표 저장하는 객체의 클래스
class Point {
	private int x,y;// 자식한테 보내고 싶으면 protected 나 get, set 이용
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.printf("(%d, %d)", x, y);
	}
}
// Point 를 확장한 ColorPoint 클래스 선언
// class 서브클래스명 extends 슈퍼클래스명{}
// 서브클래스의 내용이 슈퍼클래스의 내용이 포함된다는 의미
class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
class Point3D extends Point{
	private int z;
	public void set(int x, int y, int z) {
		// x와 y는 부모 클래스로 넘기기
		// 매개변수가 똑같으면 super 아니면 안해도 괜찮아 넘겨주는 거 안다.
		set(x,y);
		this.z = z;
	}
	public void show3Dpoint() {
		showPoint();
		System.out.println(z);
	}	
}

public class Ch05Ex01 {
	public static void main(String[] args) {
		// Point 를 확장한 Point3D 클래스를 선언하고 사용하기
		Point3D p3d = new Point3D();
		p3d.set(10,20,15); // x,y,z
		p3d.show3Dpoint();
	}
	public static void main01(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
		
	}
	public static void main00(String[] args) {
		Point p = new Point();
		p.set(1,2);
		p.showPoint();

	}

}
