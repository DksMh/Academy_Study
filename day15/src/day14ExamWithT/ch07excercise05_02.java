package day14ExamWithT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class ch07excercise05_02 {
	public static final int MAX = 4;
	public static Scanner scan;
	private Vector<Student> sv = new Vector<Student>();
	private HashMap<String, Student> smap = new HashMap<String, Student>();
	{
		smap.put("황기태", new Student("황기태", "모바일", "1", "4.1"));
		smap.put("이재문", new Student("이재문", "안드로이드", "2", "3.9"));
		smap.put("김남윤", new Student("김남윤", "웹공학", "3", "3.5"));
		smap.put("최찬미", new Student("최찬미", "빅데이터", "4", "4.25"));
	}

	public ch07excercise05_02() {
		start();
	}

	private void start() {
		if (scan == null) {
			scan = new Scanner(System.in);
		}
		// 4명의 학생 정보 입력
		System.out.println("학생 이름, 학점, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 0; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");
			String name = st.nextToken().trim();
			String depart = st.nextToken().trim();
			String no = st.nextToken().trim();
			String avg = st.nextToken().trim();
			smap.put(name, new Student(name, depart, no, avg));
		}
	
//		Set<String> keys = smap.keySet(); 
//		Iterator<String> it = keys.iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			System.out.println("------------------------");
//			System.out.println(smap.get(key));
//		}
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.addAll(smap.values());
		Collections.sort(sList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(Integer.parseInt(o1.no) > Integer.parseInt(o2.no)) {
					return 1;
				}else if(Integer.parseInt(o1.no) < Integer.parseInt(o2.no)) {
					return -1;
				}
				return 0;
			}
			
		});
		for(int i =0; i<sList.size(); i++) {
			System.out.println("------------------------");
			System.out.println(sList.get(i).toString(0));
		}
//		System.out.println(sList);
//		smap.values();
		System.out.println("------------------------");
		while (true) {
			System.out.print("학생이름 >> ");
			String name = scan.nextLine();
			if ("그만".equals(name)) {
				break;
			}
			Student std = smap.get(name);
			if(std != null) {
				System.out.println(std);
			}else {
				System.out.println(name + "학생은 없습니다.");
			}
		}
		System.out.println("프로그램 종료!!");
		scan.close();
	}

	public static void main(String[] args) {
		new ch07excercise05_02();
	}
}