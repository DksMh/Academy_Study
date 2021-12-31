package day10Exam01;

import static java.lang.System.out;

import java.util.Scanner;

public class Exam01 {
	
	public static void main12(String[] args) {
		
		//연산 >> 2 + 4
		//2+4의 계산 결과는 6
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 >> ");		
		int a = sc.nextInt(); //2
		String ope = sc.next(); // +
		int b = sc.nextInt(); // 4
		
		int result = 0;
		
		//if~else
		if(ope.equals("+")) {
			result = a + b;
		}
		else if(ope.equals("-")) {
			result = a - b;
		}
		else if(ope.equals("*")) {
			result = a * b;
		}
		else if(ope.equals("/")) {
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				result = a / b;
			}
		}
		else {
			System.out.println("사칙연산을 잘못 입력하셨습니다.");
		}
		System.out.println(a + ope + b + "의 계산 결과는 " + result);
		
		// switch
		switch(ope) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a + b;
			break;
		case "*":
			result = a + b;
			break;
		case "/":
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				result = a / b;
			}
			break;
		default:
			System.out.println("사칙연산을 잘못 입력하셨습니다.");
			break;
		}
		System.out.println(a + ope + b + "의 계산 결과는 " + result);
		sc.close();
		
	}
	public static void main11(String[] args) {
//		달을 입력하세요(1~12) >> 9
//		가을		
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>> ");		
		int month = sc.nextInt();
		
		// if문
		if (3<=month && month<=5) {
			System.out.println("봄"); 
		}
		else if(6<=month && month<=8) {
			System.out.println("여름"); 
		}
		else if(9<=month && month<=11) {
			System.out.println("가을"); 
		}
		else if(month==12 || month==1 || month==2) {
			System.out.println("겨울"); 
		}
		else System.out.println("잘못 입력했습니다.");
		// switch문
		switch(month) { 
		case 3: case 4: case 5: 
			System.out.println("봄"); 
			break; 
		case 6: case 7: case 8: 
			System.out.println("여름"); 
			break; 
		case 9: case 10: case 11: 
			System.out.println("가을"); 
			break; 
		case 12: case 1: case 2: 
			System.out.println("겨울"); 
			break; 
		default: 
			System.out.println("잘못 입력했습니다.");
		}
	
		sc.close();
		
	}
	
	public static void main10(String[] args) {
//		첫번째 원의 중심과 반지름 입력>>10 10 3
//		두번째 원의 중심과 반지름 입력>>12 12 2
//		두 원은 서로 겹친다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double r1 = sc.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double r2 = sc.nextDouble();
		// 여기까지 풀고 뒤를 못 풀겠습니다.
		
		sc.close();
		
	}
	
	public static void main09(String[] args) {
//		원의 중심과 반지름 입력>>10 10 6.5
//		점 입력>>13 13
//		점 (13,13)는 원 안에 있다.
		// [HINT] 중심에서 점 (x, y) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다. 
		// 변수 x에 대한 제곱근의 값은 Math.sqrt(x)를 이용하면 된다. Math는 6장에서 설명한다.

		Scanner sc = new Scanner(System.in);
			      
	    System.out.print("원의 중심과 반지름 입력>>");
	    int r_x = sc.nextInt();
	    int r_y = sc.nextInt();
	    double r = sc.nextDouble();
	    System.out.print("점 입력>>");
	    int x = sc.nextInt();
	    int y = sc.nextInt();
                
		sc.close();
		
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>rectx1)&&(x<rectx2)&&(y>recty1)&&(y<recty2))
			return true;
		else 
			return false;
	}
	
	public static void main08(String[] args) {
		// 입력받은 (x1,y1), (x2,y2) 가 (100, 100), (200, 200)과 충돌하는지 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x1, y1)의 좌표를 입력하시오>> ");
		System.out.print("점 (x2, y2)의 좌표를 입력하시오>> ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		// 여기까지 풀고 뒤를 못 풀겠습니다.
		
		sc.close();
		
	}
	
	public static void main07(String[] args) {
		// (100, 100), (200, 200)
		// 점 (x, y)의 좌표를 입력하시오>>150 150
		// (150, 150)는 사각형 안에 있습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x, y)의 좌표를 입력하시오>> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
	         System.out.print("("+x+", "+y+")는 사각형 안에 있습니다.");
	         }
		else {
	         System.out.print("("+x+", "+y+")는 사각형 안에 없습니다.");
	      }	         
	      sc.close();
		
	}
	
	public static void main06(String[] args) {
		// 1~99 사이의 정수를 입력하시오>>36
		// 박수짝짝
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		int a = sc.nextInt();	
		 if(a<1 || a>99)
	            System.out.println("범위에 없는 값입니다.");
		 if((a/10==3 || a/10==6 || a/10==9) && (a%10==3 || a%10==6 ||a%10==9)) // 33 -> 몫도 3 나머지도 3
	            System.out.println("박수짝짝");            
	     else if((a/10==3 || a/10==6 || a/10==9) || (a%10==3 || a%10==6 ||a%10==9)) // 23 -> 몫은 2거나 나머지는 3
	            System.out.println("박수짝");
	 
	        sc.close();
	}
	
	
	
	public static void main05(String[] args) {
		// Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 
		// 삼각형이 되려면 두변의 합이 다른 한 변의 합보다 커야 한다.
		
		// 정수 3개를 입력하시오>>4 3 5
		// 삼각형이 됩니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>> ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a+b<=c) || (a+c<=b) || (b+c<=a)) {
			System.out.println("삼각형이 안됩니다.");
		}else {
			System.out.println("삼각형이 됩니다.");
		}
		
		sc.close();
		
	}
	
	public static void main04(String[] args) {
		// Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의하라.
		
		// 정수 3개 입력>>20 100 33
		// 중간 값은 33
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a<b && b<c) || (c<b && b<a)) {
			System.out.println("중간값은 "+b);
		}else if((b<a && a<c) || (c<a && a<b)) {
			System.out.println("중간값은 "+a);
		}else {
			System.out.println("중간값은 "+c);
		}
		
		sc.close();
		
	}
	
	public static void main03(String[] args) {
		// Scanner 클래스를 이용하여 적수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 
		// 동전, 10원짜리 동전 각 몇개로 변환되는지 출력하라.
		
//		금액을 입력하시오>>65376
//		오만원권 1매
//		만원권 1매
//		천원권 5매
//		백원 3개
//		오십원 1개
//		십원 2개
//		일원 6개
		
		// 지폐랑 동전이랑 세는 수가 달라 반복문을 사용하지 않았습니다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>> ");
		int cash = sc.nextInt();
		int m_50000, m_10000, m_1000, m_100, m_50, m_10, m_1;

		m_50000 = cash/50000;	// 65376/50000 = 1
		cash = cash - 50000;	// 65376-50000 = 15376
		
		m_10000 = cash/10000;	// 15376/10000 = 1
		cash = cash - 10000;	// 15376-10000 = 5376
		
		m_1000 = cash/1000;		// 5376/1000 = 5
		cash = cash - (m_1000*1000); // 5376-(5*1000) = 376
		
		m_100 = cash/100;		// 376/100 = 3
		cash = cash - (m_100*100);	// 376-(3*100) = 76
		
		m_50 = cash/50;			// 76/50 = 1
		cash = cash - 50;		// 76 - 50 = 26
		
		m_10 = cash/10;			// 26/10 = 2
		cash = cash - (m_10*10);	// 26-(2*10) = 6
		
		m_1 = cash;			// 6/1 = 6 이라 cash만 적어도 괜찮다.
		
		
		System.out.println("오만원권 "+m_50000+"매");
	    System.out.println("만원권 "+m_10000+"매");
	    System.out.println("천원권 "+m_1000+"매");
	    System.out.println("백원 "+m_100+"개");
	    System.out.println("오십원 "+m_50+"개");
	    System.out.println("십원 "+m_10+"개");
	    System.out.println("일원 "+m_1+"개");
	    
	    // 반복문
//		int[] money = {50000,10000,1000,100,50,10,1};
//		for(int i = 0; i<money.length; i++) {
//			System.out.println(money[i]+"원권 : "+cash/money[i] +"매");
//			cash %= money[i];
//		}
		
		sc.close();
		
	}
	public static void main02(String[] args) {
		// Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
		// 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
		
		// 2자리수 정수 입력(10~99)>>77
		// Yes! 10의 자리와 1의 자리가 같습니다.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int ten = sc.nextInt();
		if((ten/10) == (ten%10)) { // 11/10 = 1(몫) --- 1(나머지) (22~99도 10으로 나누면 몫과 나머지가 같음)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		
		
		sc.close();
		
	}
	public static void main01(String[] args) {
		// Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
		// $1=1100원으로 가정하고 계산하라
		
		// 원화를 입력하세요(단위 원)>>3300  
		// 3300원은 $3.0입니다.
		
		Scanner scFi = new Scanner(System.in);
		float dollar;

		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = scFi.nextInt();
		dollar = (float)won/1100; // 1$ = 1100/1100 
		System.out.println(won+"원은 $"+dollar+"입니다.");
		
		scFi.close();
		
	}

}
