package ch07_ex01;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

abstract class Ex {
	public abstract void run();

	public void start() {
		System.out.println("----예제 실행 ----");
		run();
	}
}

class Ex01 extends Ex {
	@Override
	public void run() {
		System.out.println(">> 정수값만 다루는 제네릭 벡터 생성");
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity()); // -> 처음에 생성하면 capacity는 10부터 시작
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		System.out.println("add 후 v.size() : " + v.size());
		System.out.println(v);
		for (Integer i : v) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
//			sum += v.get(i); 
			sum += v.elementAt(i); // 둘 다 가능하다.
		}
		System.out.println("sum : " + sum);
	}
}

class Point {
	private int x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	// 소스에 제너레이트 헤쉬코드/ 이퀄스
	// hashCode() / equals를 제정의 해줘야 밑에서 contain과 indexOf를 사용할 수 있음
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

}

class Ex02 extends Ex {
	@Override
	public void run() {
		System.out.println(">>> Point 객체를 요소로만 가지는 벡터 생성");
		Vector<Point> v = new Vector<Point>();// 포인트만 받음
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		int findIdx = v.indexOf(new Point(-5, 20)); // hashCode() / equals() 제정의
		System.out.println(findIdx);
//		System.out.println(v.indexOf(new Point(-5,20))); // 1
		v.remove(findIdx);
		System.out.println(v);
	}

}

class Ex03 extends Ex {
	@Override
	public void run() {
		System.out.println(">>> 문자열만 삽입가능한 ArrayList 컬렉션");
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			a.add(scan.next());
		}
		System.out.println("저장 완료!");
		int longIndex = 0; // index는 -1이 될 수 없다.
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
			if (name.length() > a.get(longIndex).length()) {
				longIndex = i;
			}
		}
		System.out.println();
		System.out.println("긴 이름 => " + a.get(longIndex));
	}

}

class Ex04 extends Ex {

	@Override
	public void run() {
		System.out.println("정수 값만 다루는 제네릭 벡터 생성");
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n); // 5 4 100 -1
		}
		// Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator(); // Iterator 객체 얻기
		while (it.hasNext()) {
			int n = it.next(); // 다음 요소 리턴
			sum += n;
		}
		System.out.println("백터에 있는 정수 합 : " + sum); // 108
	}

}


public class ch07Ex01VectorEx {
	public ch07Ex01VectorEx() {
		// 생성자는 필드를 초기화 한다.
		// 예제 구현 메소드 별도로 만든다.
//		ex01();
//		Ex ex01 = new Ex01();
//		ex01.start();
//		Ex ex = new Ex02();
//		ex.start();
//		Ex ex = new Ex03();
//		ex.start();
		Ex ex = new Ex04();
		ex.start();

	}

//	private void ex01() {
//		// 정수값만 다루는 제네릭 벡터 생성
//		Vector<Integer> v = new Vector<Integer>();
//	}

	public static void main(String[] args) {
		// 메인에 직접 구현하기보다는 객체에 구현해보자.
		// 생성자에서 시작하도록 한다.
		new ch07Ex01VectorEx();

	}

}
