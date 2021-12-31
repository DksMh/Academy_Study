package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ch03Ex24 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String[] names = new String[3];
		
		// 이름 3개를 연속적으로 입력해서 출력하기
		for(int i =0; i<names.length; i++) {
			System.out.print("성명을 입력"+(i+1)+" >> ");
			names[i] = scan.next();
			
		}
		System.out.println(Arrays.toString(names));
		// 검색어 입력
		System.out.print("검색어 입력 >> ");
		String keyWord = scan.next();
		
		for(int i =0; i<names.length; i++) {
			if(names[i].indexOf(keyWord)!= -1) { // 포함된 값 무조건 나오게
				System.out.println(names[i]);
			}
		}
		
	}
	public static void main01(String[] args) {
		String[] names = {"홍길동","이순신","강감찬"};
		int[][] score = {{95,100},{100,95},{80,85}};
		
		System.out.print("성명\t국어\t영어\t총점\t\n");
		int size = names.length;
		for(int i =0; i<size; i++) { // 행
			System.out.print(names[i]+"\t");
			int total = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				total += score[i][j];
			}
			System.out.println(total);
		}
		
		// 성명 국어 영어 총점
		// 홍길동 95 100 195
		// 이순신 100 95 195
		// 강감찬 80 85  165
		
 	}
}
