package Day01_homework;

import java.util.Scanner;

public class Homework02 {

	public static void println(String s) {
		System.out.println(s);
	}
	public static final Scanner scan = new Scanner(System.in);
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
		if((rectx1<=x && x<= rectx2) && (recty1<=y && y<= recty2)) { 
			return true;
		}
		return false;
	}
	public static void main08(String[] args) {
		// 2장 연습문제 8번
		// 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 
		// 키보드로부터 사각형을 구성하는 두 점(x1, y1), (x2, y2)를 입력받아 
		// 100,100과 200,200의 두 점으로 이루어진 사각형과 충돌하는지 판별하는 프로그램을 작성하라.
		// 다음은 점(x,y)가 사각형 (rectx1, recty1), (rectx2, recty2)
		// 안에 있으면 true를 리턴하는 메소드이다. 이를 활용하라.
		int x1=100, x2=200, y1=100,y2=200; // int rectx1, int recty1, int rectx2, int recty2
		System.out.print("점(x1,y1)의 좌표를 입력하시오 >> ");
		int nx1 = scan.nextInt();
		int ny1 = scan.nextInt();
		System.out.print("점(x2,y2)의 좌표를 입력하시오 >> ");
		int nx2 = scan.nextInt();
		int ny2 = scan.nextInt();
		scan.close();
		
		// OR로 하면 모서리 구퉁이에 들어오는 것도 처리가 가능함
		if(inRect(100,100,nx1,ny1,nx2,ny2)||inRect(200,200,nx1,ny1,nx2,ny2)||inRect(100,200,nx1,ny1,nx2,ny2)||inRect(200,100,nx1,ny1,nx2,ny2)) 
			System.out.println("충돌합니다.");
		else
			System.out.println("충돌하지 않습니다.");
		
	
		// AND는 사각형 안에만 있는 경우만 처리 가능함
//		if(inRect(nx1, ny1, x1, y1, x2, y2)&&inRect(nx2, ny2, x1, y1, x2, y2)) { 
//			System.out.println("충돌 성공!");
//		} else {
//			System.out.println("충돌 실패!");
//		}
		
	}
	
	public static void main07(String[] args) {
		// 7. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 
		// 오른쪽 하단 모서리의 두 점으로 표현한다. 
		// 100,100과 200,200의 두 점으로 이루어진 사각형이 있을 때 
		// Scanner를 이용하여 정수 x와 y 값을 입력받고 
		// 점 (x,y)가 이 직사각형 안에 있는 지를 판별하는 프로그램을 작성하라.
		
//		점 (x,y)의 좌표를 입력하시오 >> 150 150
//		(150,150)은 사각형 안에 있습니다.
		int x1=100, x2=200, y1=100,y2=200;
		System.out.print("점(x,y)의 좌표를 입력하시오 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		// x가 x1과 x2사이에 있고 y가 y1과 y2사이에 있는가?
		if((x1<=x && x<=x2) && (y1<=y && y<=y2)) {
			System.out.println("점 ("+x+","+y+")은 "+"사각형 안에 있습니다.");
		}else {
			System.out.println("점 ("+x+","+y+")은 "+"사각형 안에 없습니다.");
		}
				
	}

}
