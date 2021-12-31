package day08;

import java.util.Scanner;

//너비와 높이를 입력 받아 삼각형의 합을 출력하는 프로그램을 작성하라. 
//너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Triangle 클래스를 만들어 활용하라. 

public class Triangle {
	int width; // 너비 필드
	int height; // 높이 필드
	
	public Triangle() {}
	public int getArea() {
		return width*height/2;
	}
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Triangle tri = new Triangle(); // 객체 생성
		System.out.print("너비를 입력하세요 : ");
		tri.width = scan.nextInt(); // 너비 입력받기
		System.out.print("높이를 입력하세요 : ");
		tri.height = scan.nextInt(); // 높이 입력받기
		
		double size = tri.getArea();
		System.out.println("삼각형의 너비는 "+tri.width+"이고 높이는 "+tri.height+"이다.");
		System.out.println("삼각형의 넓이는 "+tri.getArea()+"이다.");

	}

}
