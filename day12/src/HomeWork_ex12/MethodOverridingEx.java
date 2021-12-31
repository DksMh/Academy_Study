package HomeWork_ex12;

import java.util.Scanner;

class Shape { // 슈퍼 클래스
	public Shape next;
	public Shape() {next = null;}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
class ShapeLinkedList{
	private Shape start, last, node, cur;
	private int size = 0;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void append(Shape shape) {
		size++;
		if(start == null) {
			start = shape;
			last = start; 
//			System.out.println(">>> 첫번째 노드 생성");
			return;
		}
		node = shape;
		last.next = node;
		last = node;
//		System.out.println(">>> 마지막 노드 추가");
	}

	public void showAll() {
		cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next; // 그다음노드 그다음 노드 가르키면서 돌아감
		}
		
	}

	public void remove(int i) {
		// 1. 제거되는 경우의 수
		// 1-1. 추가가 1개만 되는 경우 / 2개 이상인 경우
		// 2. System.out.println("삭제할 수 없습니다.");는 입력값이 더 클 때 >
		
		size--;
		if(start == last) { // 1개인 경우
			start = null;
			last = null;
			return;
		}
	
		
	}

	public int size() {
		return size;
	}
	
}
public class MethodOverridingEx {
	public static void main(String[] args) {
		ShapeLinkedList linkedList = new ShapeLinkedList();
//		linkedList.append(new Circle()); // 연결해주도록
//		linkedList.append(new Rect()); 
//		linkedList.append(new Line()); 
//		linkedList.append(new Circle()); 
		
		linkedList.showAll();
		linkedList.remove(3);
//		System.out.println(linkedList.size());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int num = sc.nextInt(); // 1, 2, 3, 4
			switch (num) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int num1 = sc.nextInt(); // 여기서 1 , 2, 3 선택
				switch(num1) {
				case 1:
					linkedList.append(new Line()); 
					break;
				case 2:
					linkedList.append(new Rect()); 
					break;
				case 3: 
					linkedList.append(new Circle()); 
					break;
				}
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 >> ");
				int num2 = sc.nextInt();
				
				break;
			case 3:
				linkedList.showAll();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				System.exit(0);
				break;
			}

		}
	}

}
//Shape start, last, node;
//start = new Line(); // start가 기준이라 가만히 있음
//last = start; // last만 계속 바뀜
//node = new Rect();
//last.next = node;
//last = node;
//node = new Line();
//last.next = node;
//last = node;
//node = new Circle();
//last.next = node;
//last = node;
//Shape cur = start;
//while(cur != null) {
//	cur.draw();
//	cur = cur.next;
