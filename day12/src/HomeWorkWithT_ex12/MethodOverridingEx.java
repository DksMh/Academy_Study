package HomeWorkWithT_ex12;

class Shape { // 슈퍼 클래스
	public Shape next; 
	public Shape() { next = null; }
//	public void setNext(Shape obj) {this.next = obj;}  // 링크연결
//	public Shape getNext() {return next;}
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	public static void main(String[] args) {
		Shape start, last, node;
		start = new Line(); // start가 기준이라 가만히 있음
		last = start; // last만 계속 바뀜
		node = new Rect();
		last.next = node;
		last = node;
		node = new Line();
		last.next = node;
		last = node;
		node = new Circle();
		last.next = node;
		last = node;
		Shape cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}
	static void paint(Shape p) {
		p.draw();
	}
	public static void paint_test(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
