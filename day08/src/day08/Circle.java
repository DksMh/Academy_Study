package day08;

import java.util.Scanner;

//반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라. 
// 그리고 객체가 생성된 모습을 그려보라.

public class Circle {
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	public Circle() {} // 원의 생성자 메소드
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();// Circle 객체 생성
		pizza.radius = 5;// 피자의 반지름 설정
		pizza.name = "도미노";// 피자의 이름 설정
		double area = pizza.getArea();// 피자의 면적 알아내기
		System.out.println(pizza.name +"이고 피자의 넓이는 "+area);
		
		Circle pizza2;
		pizza2 = new Circle();
		pizza2.radius = 10;
		pizza2.name = "피자헛";
		area = pizza2.getArea();
		System.out.println(pizza2.name +"이고 피자의 넓이는 "+area);

	}

}
