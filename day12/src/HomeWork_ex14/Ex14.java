package HomeWork_ex14;

interface Shape {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
class Circle implements Shape{
	private int radius;
	@Override
	public void draw() { // Shape의 default public void redraw()에서 실행됨
		System.out.println(" 반지름이 "+radius+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return (PI*radius*radius);
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
}
class Oval implements Shape{
	private int x;
	private int y;
	@Override
	public void draw() { // Shape의 default public void redraw()에서 실행됨
		System.out.printf(" %d x %d에 내접하는 타원입니다.\n", x, y);
	}
	@Override
	public double getArea() {
		return (PI*x*y); // 타원 넓이 공식 : 파이 * x * y
	}
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
class Rect implements Shape{
	private int width;
	private int height;
	@Override
	public void draw() { // Shape의 default public void redraw()에서 실행됨
		System.out.printf(" %d x %d 크기의 사각형입니다.\n", width, height);
	}
	@Override
	public double getArea() {
		return width*height;
	}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
}
public class Ex14 {

	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20,30); // 20 x 30 사각형에 내접하는 타원
		list[2] = new Rect(10,40); // 10 x 40 크기의 사각형
		for(int i =0; i<list.length; i++) {
			list[i].redraw();
		}
		for(int i =0; i<list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}

	}

}
