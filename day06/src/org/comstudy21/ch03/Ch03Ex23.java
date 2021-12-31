package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ch03Ex23 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main02_1(String[] args) {
		// 배열에 점수를 입력받아서 제일 큰 점수와 제일 작은 점수를 출력
		int[] score = new int[5];
		int max = 0, min = 100;
		int num = 0;
		
		for(int i=0; i<score.length; i++) {
			System.out.print("점수 입력"+i+" >> ");
			num = scan.nextInt();
			if(num>max) {
				 max = num;
			}
			if(num<min) {
				min = num;
			}
		}
		System.out.printf("가장 큰 값은 %d이고 가장 작은값은 %d입니다.",max,min);
		
	}
	public static void main2_2(String[] args) {
		int[] score = {65,100,75,80,35,90};
		int[] rank = new int[score.length];
		// 결과 : [5,1,4,3,6,2]
		// 1. rank[i] 번째를 1로 시작한다.
		// 2. score[i]번째보다 큰 값의 요소가 있다면 rank[i]를 증각한다.
		
		int size = score.length; // 계속 힙에 가서 물어보는 것을 방지하기 위함(부하 방지)
		for(int i=0; i<size; i++) {
			rank[i] = 1;
			for(int j=0; j<size; j++) {
				if(score[i]<score[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		for(int i =0; i<score.length; i++) {
			System.out.printf("%d점은 %d등입니다.\n", score[i], rank[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] score = {95,70,85,90,100,45,35,85,70,75};
		
		// 점수 검색 : 70 
		// 결과 : 70은 1번째 8번째에 있습니다. --> 배열의 위치 찾기
		
		// 1. 검색어 입력받기
		// 2. score의 요소만큼 반복
		// 3. 검색어와 같은 값이 있다면 위치 출력
		
		System.out.print("점수 검색 >> ");
		int keyword = scan.nextInt();
		int size = score.length; 
		System.out.printf("결과 : %d은",keyword);
		
		boolean flag = false;
		for(int i =0; i<size; i++) {
			if(keyword == score[i]) {
				System.out.print(" "+i+"번째");
				flag= true;
			}
		}
		if(flag) {
		System.out.print("에 있습니다."); // \b 는 백스페이스
		}else {
			System.out.print(" 없습니다.");
		}
		
	}
	
	public static void main01(String[] args) {
		int[] score = {95,70,85,90,100,45,35,85,70,75};
		
		// 65를 입력받아 65가 있으면 true를 아니면 false 출력
		// 검색할 점수 >> 65
		// 결과 65는 배열에 없습니다!
		// 1. 점수를 입력받는다.
		// 2. 입력받은 점수가 배열에 있는가? 검색
		// 3. 있다면 count한다.
		int ea = 0;
		int keyNum = 0;
		System.out.print("검색할 점수 >> ");
		keyNum = scan.nextInt();
		for(int i =0; i<score.length; i++) {
			if(keyNum == score[i]) {
				ea++;
			}
		}
		
		// 4. 검색 종료 후 결과 출력
		if(ea == 0) {
			System.out.printf("결과 : %d는 배열에 없습니다.", keyNum);
		}else {
			System.out.printf("결과 : %d는 배열에 %d개 있습니다.", keyNum, ea);
		}
		System.out.println();
		
		
		// 내가 한 거랑 비교해보기
		int count = 0;
		System.out.print("검색할 점수 >> ");
		int search = scan.nextInt();
		
		// 전체를 비교하기위해 전체를 for문으로 돌린다.
		for(int i=0; i<score.length; i++) { //0~9까지 돌린다.
			if(score[i]!=search) {	 // score[1](70) , search =65
				System.out.printf("결과 %d는 배열에 없습니다!",search);
				break;
			}else {
				System.out.printf("결과 %d는 배열에 있습니다!",search);
				break;
			}
		}
		
		
	}
}
