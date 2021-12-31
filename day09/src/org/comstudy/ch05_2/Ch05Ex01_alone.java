package org.comstudy.ch05_2;

class Point{
	private int x,y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.printf("(%d, %d)",x,y);
	}
}
class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		showPoint();
		System.out.print("red");
	}
	
}

class Point3D extends Point{
	private int z;
	public void set(int x, int y, int z) {
		set(x,y);
		this.z = z;
	}
	public void show3Dpoint(){
		showPoint();
		System.out.print(z);
	}
	
}
public class Ch05Ex01_alone {
	// Point , ColorPoint ,Point3D 클래스 구현 실습
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
		p.set(10,20);
		p.showPoint();

	}

}
