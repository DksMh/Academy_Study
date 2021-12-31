package day03;

import java.io.IOException;

public class Day12Ex01 {
	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while((ch=System.in.read())!='\n') { // 엔터가 아닐 떄까지
				if(ch>'0'&&ch<='9') {
					num = num*10 +ch - '0'; // 숫자을 입력받은 함수 만듬
				}
			}
		} catch (IOException e) {e.printStackTrace();}
		return num;
	}
	static int input(String s) {
		System.out.print(s);
		return getNum();
	}
	public static void main(String[] args) {
		// 숫자 3개를 입력 받아서 큰수, 중간, 작은 수를 출력하는 프로그램을 만든다.
		int a,b,c;
		int max = 0, mid = 0, min = 0;
		
		a = input("정수 입력a >>");
		b = input("정수 입력b >>");
		c = input("정수 입력c >>");
		
		System.out.printf("%d, %d, %d\n",a,b,c);
		
		// 의사코드
		// 1. 두개의 숫자를 비교해서 큰것은 max, 작은 것은 min에 입력
		// 2. 나머지 한개의 숫자를 max와 비교해서 max보다 크면 max치환
		// 3. 만약 max보다 작다면 그것을 min과 비교해서 min보다 작다면 min 치환
		// 4. 나머지 숫자가 max보다도 크지 않고 min보다도 작지않다면 그것이 mid
		
		if(a > b) {	// a가 b보다 큰 경우
			max = a;
			min = b;
		}else {		// b가 a보다 큰 경우
			max = b;
			min = a;
		}
		if(c > max) { // c가 max보다 큰 경우
			mid = max; // 기존 max가 mid가 되고
			max = c;   // c가 max가 된다
		}else if(c<min) { // c가 min보다 작은 경우
			mid = min;	
			min = c;
		}else {	// min < c < max인 경우
			mid = c;
		}
		
		System.out.printf("%d, %d, %d", max,mid,min);
		
	}

}
