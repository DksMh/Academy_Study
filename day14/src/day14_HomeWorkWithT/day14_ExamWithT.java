package day14_HomeWorkWithT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class day14_ExamWithT {
	public day14_ExamWithT() {
//		ex01();
//		ex02();
//		ex03();
		ex04();
	}
	private void ex04() {
		// Vector에 강슈량을 입력하고 평균을 구한다.
		Vector<Integer> v = new Vector<Integer>(); 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int num = sc.nextInt();
			if(num == 0) break;
			v.add(num);
			int sum =0;
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				int n = it.next();
				sum += n;
				System.out.print(n + " ");
			}
			System.out.println("\n현재 평균"+ sum/v.size());
		}
		sc.close();
	}
	private void ex03() {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요(예 : Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String name = sc.next();
			if("그만".equals(name)) {
				break;
			}
			int num = sc.nextInt();
			nations.put(name, num);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String name = sc.next();
			if("그만".equals(name)) {
				break;
			}
			if(nations.get(name) != null) {
				int num = nations.get(name);
				System.out.println(name + "의 인구는 "+num);
			}else {
				System.out.println(name+"나라는 없습니다.");
			}
			
		}
		sc.close();
	}
	private void ex02() {
		Scanner sc = new Scanner(System.in);
		final int MAX = 6;
		ArrayList<Character> scoreList = new ArrayList<Character>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for(int i=0; i<MAX; ) {
			Character c = 0;
			c = sc.next().charAt(0);
			if(c =='A'||c =='B'||c =='C'||c =='D'||c =='F') {				
				scoreList.add(c);
				i++;
			}
		}
		sc.close();
		
		Iterator<Character> it = scoreList.iterator();
		double sum = 0;
		while(it.hasNext()) {
			Character score = it.next();
			sum +=(69 - score)<0 ? 0 : (double)(69 - score);
		}
		System.out.println("평균 = "+sum/MAX);
	}
	private void ex01() {
		// 백터에 저장하고 가장 큰수를 출력
		// 정수(-1)이 입력될 때까지 >>
		Vector<Integer> iv  = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int max = 0;
		System.out.print("정수(-1이 입력될 때까지) 입력 >>");
		while((i=sc.nextInt()) != -1) {
			if(max < i) {
				max = i;
			}
			iv.add(i);
		}
		System.out.println(iv);
		System.out.println("가장 큰 수는 " + max);
	}
	public static void main(String[] args) {
		new day14_ExamWithT();
	}

}