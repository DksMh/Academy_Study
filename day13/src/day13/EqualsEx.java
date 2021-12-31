package day13;

import java.util.ArrayList;

// 01. Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라.
class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj; 
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}
// 02. int 타입의 width(너비)와 height(높이) 필드를 가지는 Rect 클래스를 작성하고, 		
//		면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals()를 작성하라. 
//		생성자에서 너비와 높이를 받아 width, height 필드를 초기화하라.
class Rect{
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if(width * height == p.width*p.height) {
			return true;
		}
		else
			return false;
	}	
}

public class EqualsEx {
	public static void main(String[] args) {
		ArrayList<Point> pList = new ArrayList<Point>(); // 배열 같은 구조 index(순서)
		pList.add(new Point(2,3));
		pList.add(new Point(4,5));
		pList.add(new Point(6,7));
		pList.add(new Point(8,9));
		pList.add(new Point(1,2));
		
		System.out.println(pList);
		System.out.println(pList.get(1));
		pList.set(1, new Point(100,200));
		System.out.println(pList.get(1));
	}
	public static void main02(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
	}
	public static void main01(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a == b) {
			System.out.println("a == b");
		}
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
	}

}
