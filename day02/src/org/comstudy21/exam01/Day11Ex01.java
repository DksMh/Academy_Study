package org.comstudy21.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Day11Ex01 {
//	public static Scanner scan = new Scanner(System.in);	// -> 예외를 처리해주지 못함
	public static int getNum() {
		int num = 0; 
		int ch = 0;
		try {
			while((ch = System.in.read())!='\n') { // 엔터일 때만 가능
				if(ch>='0' && ch<='9') {  // = if(ch!='\n')
					num = num*10 + ch - '0'; // 10자리수를 하려면 올려주고 해야하니까
				}
				// 숫자를 넣었을 때는 숫자가 됨 아스키 문자가 숫자로 바뀌어서 num으로 넣어짐
				// 문자 0의 아스키값은 48
				// ch - '0'문자를 해당 정수로 변환 
				// EX)) ('9' - '0') = (57 − 48) = 9
			}
		} catch (IOException e) {e.printStackTrace();}
		return num;
	}
	
	public static void main(String[] args) {
		// 정수 3개를 입력 받아서 큰수, 중간, 작은 수를 판별하는 프로그램
		int a, b, c;
		int max = 0, mid = 0, min = 0;
		System.out.print("정수1 입력 >> ");
		a = getNum();
		System.out.print("정수2 입력 >> ");
		b = getNum();
		System.out.print("정수3 입력 >> ");
		c = getNum();
		
		System.out.printf("%d, %d, %d\n", a, b, c);
		
		// A)
		if(b<a) {
			if(c<a) {
				max = a;
				if(b<c) {
					min = b;
					mid = c;
				}else {
					min = c;
					mid = b;
				}
			}else {
				max = c;
				if(a<b) {
					min = a;
					mid = b;
				}else {
					min = b;
					mid = a;
				}
			}
		}else {
			if(c<b) {
				max = b;
				if(a<c) {
					min = a;
					mid = c;
				}else {
					min = c;
					mid = a;
				}
			}else {
				max = c;
				if(a<b) {
					min = a;
					mid = b;
				}else {
					min = b;
					mid = a;
				}
			}
		}
		
		// B)
		if(b<a) {
			if(c<a) {
				max = a;
				if(b<c) {
					min = b;
				}else {
					min = c;
				}
			}else {
				max = c;
				if(a<b) {
					min = a;
				}else {
					min = b;
				}
			}
		}else {
			if(c<b) {
				max = b;
				if(a<c) {
					min = a;
				}else {
					min = c;
				}
			}else {
				max = c;
				if(a<b) {
					min = a;
				}else {
					min = b;
				}
			}
		}
		// 추가된 부분
		if(a!=max && a!=min)
			mid = a;
		else if(b!=max && b!=min)
			mid = b;
		else
			mid = c;

		System.out.println("제일 큰 수는 "+max);
		System.out.println("제일 작은 수는 "+min);
		System.out.println("중간 수는 "+mid);
	
		
		
	}

}
