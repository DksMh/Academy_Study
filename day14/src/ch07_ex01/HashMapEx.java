package ch07_ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

abstract class Exam {
	public abstract void run();

	public void start() {
		System.out.println("----예제 실행 ----");
		run();
	}
}

class Ex002 extends Exam {
	@Override
	public void run() {
		System.out.println("사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성");
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		// 5개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);

		System.out.println("HashMap의 요소 개수 : " + javaScore.size());

		// 모든 사람의 점수 출력
		// javaScore에 들어 있는 모든 (key, value) 쌍 출력

		// key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = javaScore.keySet();
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}
	}
}

class Ex001 extends Exam {
	@Override
	public void run() {
		System.out.println("영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성");
		HashMap<String, String> dic = new HashMap<String, String>();

		// 3 개의 (key, value) 쌍을 dic에 저장
		dic.put("baby", "아기"); // "baby"는 key, "아기"은 value
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		// 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			// 해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
		scanner.close();

	}

}
class Ex003 extends Exam {
	class Student { // 학생을 표현하는 클래스
		int id;
		String tel;
		public Student(int id, String tel) {
			this.id = id; this.tel = tel;
		}
		public int getId() {
			return id;
		}
		public String getTel() {
			return tel;
		}
	}
	
	@Override
	public void run() {
		System.out.println("학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성");
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		// 3 명의 학생 저장
		map.put("황기태", new Student(1,"010-1234-5678"));
		map.put("이재문", new Student(2,"010-4567-7890"));
		map.put("김남윤", new Student(3,"010-1478-8520"));
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름은?? ");
			String name = scan.nextLine();
			if(name.equals("exit")){
				System.out.println("종료합니다");
				System.exit(0);
				break;
			}
			Student student = map.get(name); 
			if(student == null) {
				System.out.println(name +"은 없는 사람입니다.");
			}else {
				System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
			}
		}

	}
}
public class HashMapEx {
	public HashMapEx() {
//		Exam ex = new Ex001();
//		ex.start();
//		Exam ex = new Ex002();
//		ex.start();
		Exam ex1 = new Ex003();
		ex1.start();

	}

	public static void main(String[] args) {
		// 메인에 직접 구현하기보다는 객체에 구현해보자.
		// 생성자에서 시작하도록 한다.
		new HashMapEx();

	}
}
