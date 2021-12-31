package day08;

import java.util.Scanner;

// 두 개의 생성자를 가진 Circle 클래스

public class Circle02 {
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	public Circle02() {} // 매개 변수 없는 원의 생성자 메소드
	public Circle02(int r, String n) {// 매개 변수 있는 원의 생성자 메소드
		radius = r;
		name = n;
	} 
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		
		// 매개 변수 없는 생성자(10번째 줄 가져옴)
		Circle02 pizza;
		pizza = new Circle02();// Circle 객체 생성
		pizza.radius = 5;// 피자의 반지름 설정
		pizza.name = "도미노";// 피자의 이름 설정
		double area = pizza.getArea();// 피자의 면적 알아내기
		System.out.println(pizza.name +"이고 피자의 넓이는 "+area);
		
		Circle02 pizza02 = new Circle02(10, "피자헛"); // 매개 변수 있는 생성자(11번째 줄) 가져옴
		area = pizza02.getArea();
		System.out.println(pizza02.name + "의 면적은 " + area);

	}

}
