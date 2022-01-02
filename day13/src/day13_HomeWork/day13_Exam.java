package day13_HomeWork;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

// 01
class MyPoint {
	private int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

// 02
class Circle {
	int x;
	int y;
	int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
	}
	// "toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 입니다.

	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (c.x == x && c.y == y) {
			return true;
		} else
			return false;
	}
}

// 03
class Calc {
	private int x, y;

	public Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int sum() {
		return x + y;
	}
}

class People {
	private String name;

	public People(String name) {
		this.name = name;
	}

}

public class day13_Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String words = sc.nextLine();	
		for(int i = 1; i <= words.length() ;i++) {
			System.out.print(words.substring(i)); // 줄어드는 역할 // 역삼각형 역할 -> 마지막은 빈칸
			System.out.println(words.substring(0, i)); // 삼각형 역할  //substring(0, 7) 0 ~ 6 (7-1)까지
		}
	}	
	public static void main07_02(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");	
				break;
			}
			String [] words = s.split(" ");	
			System.out.println("어절 개수는 " + words.length);
		}
	}
	public static void main07_01(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");	
				break;				
			}
			StringTokenizer st = new StringTokenizer(s, " ");	
			System.out.println("어절 개수는 " + st.countTokens());			
		}
	}

	public static void main06(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		People p1 = new People("황기태");
		People p2 = new People("이재문");
	}

	public static void main05(String[] args) {
		Calendar day = Calendar.getInstance(); // Calendar 객체 생성

		int hour = day.get(Calendar.HOUR_OF_DAY);
		int minute = day.get(Calendar.MINUTE);

		System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");

		if (hour > 4 && hour < 12)
			System.out.println("Good Morning");
		else if (hour >= 12 && hour < 18)
			System.out.println("Good Afternoon");
		else if (hour >= 18 && hour < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

	public static void main03(String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());
	}

	public static void main02(String[] args) {
		Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}

	public static void main01(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
