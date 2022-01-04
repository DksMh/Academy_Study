package day14_HomeWorkWithT;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class ch07excercise05_01 {
	public static final int MAX = 4;
	public static Scanner scan;
	private Vector<Student> sv = new Vector<Student>();
	{
		sv.add(new Student("황기태", "모바일", "1", "4.1"));
		sv.add(new Student("이재문", "안드로이드", "2", "3.9"));
		sv.add(new Student("김남윤", "웹공학", "3", "3.5"));
		sv.add(new Student("최찬미", "빅데이터", "4", "4.25"));
	}

	public ch07excercise05_01() {
		start();
	}

	private void start() {
		if (scan == null) {
			scan = new Scanner(System.in);
		}
		// 4명의 학생 정보 입력
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 0; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");
			String name = st.nextToken().trim();
			String depart = st.nextToken().trim();
			String no = st.nextToken().trim();
			String avg = st.nextToken().trim();
			sv.add(new Student(name, depart, no, avg));
		}
		Iterator<Student> it = sv.iterator();
		while (it.hasNext()) {
			System.out.println("------------------------");
			System.out.println(it.next().toString(0));
		}
		while (true) {
			System.out.print("학생이름 >> ");
			String name = scan.nextLine();
			if ("그만".equals(name)) {
				break;
			}
			int idx = sv.indexOf(new Student(name, null, null, null));
			if (idx != -1) {
				System.out.println(sv.get(idx));
			} else {
				System.out.println(name + " 학생은 없습니다!");
			}
		}
		System.out.println("프로그램 종료!!");
		scan.close();
	}

	public static void main(String[] args) {
		new ch07excercise05_01();
		
	}

}
