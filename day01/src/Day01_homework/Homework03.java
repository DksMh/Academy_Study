package Day01_homework;

import java.util.Scanner;

public class Homework03 {

	public static void println(String s) {
		System.out.println(s);
	}
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		10. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 
//		두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.

//		첫번째 원의 중심과 반지름 입력>> 10 10 3
//		두번째 원의 중심과 반지름 입력>> 12 12 2
//		두 원은 서로 겹친다.
//		※ 두 개의 반지름의 합보다 작으면 원이 겹칩니다.
		
		// 원의 중심과 반지름 그리고 (x,y) 입력
		double x1 = 0, y1 = 0, radius1 = 0; // 원의 중심점(x,y)와 반지름(radius)
		double x2 = 0, y2 = 0, radius2 = 0;; // 점의 좌표 입력
		
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		radius1 = scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		x2 =scan.nextDouble();
		y2 = scan.nextDouble();
		radius2 = scan.nextDouble();
		scan.close();
		
		System.out.printf("%.1f, %.1f, %.1f\n",x1,y1,radius1);
		System.out.printf("%.1f, %.1f, %.1f\n",x2,y2,radius2);
		
		double d = radius1+ radius2; // 두 원이 가진 반지름을 더해 길이를 구한다 
		// d보다 작으면 겹치고 d보다 크면 겹치지 않는다
		
		if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<d) { // 길이가 반지름보다 작으면
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		
	}
	public static void main09(String[] args) {
//		9. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 
//		그리고 실수 값으로 다른 점 (x.y) 을 입력받아 
//		이 점이 원의 내부에 있는지 판별하여 출력하라.
//		원의 중심과 반지름 입력>> 10 10 6.5
//		점 입력>> 13 13
//		점 (13.0,13.0)은 원 안에 있습니다.
		
		// 원의 중심과 반지름 그리고 (x,y) 입력
		double x = 0, y = 0, radius = 0; // 원의 중심점(x,y)와 반지름(radius)
		double x2 = 0, y2 = 0; // 점의 좌표 입력
		
		System.out.print("원의 중심과 반지름 입력 >> ");
		x = scan.nextDouble(); //10
		y = scan.nextDouble(); //10
		radius = scan.nextDouble(); // 6.5
		
		System.out.print("점 입력 >> ");
		x2 =scan.nextDouble(); //13
		y2 = scan.nextDouble();//13
		scan.close();
		
		System.out.printf("%.1f, %.1f, %.1f\n",x,y,radius);
		System.out.printf("%.1f, %.1f\n",x2,y2);
		
		double d = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2)); // 길이 -> 제곱근을 사용함 
		
		if(d<radius) { // 길이가 반지름보다 작으면
			System.out.println("원 안에 있다.");
		} else {
			System.out.println("원 밖에 있다.");
		}
				
	}

}
