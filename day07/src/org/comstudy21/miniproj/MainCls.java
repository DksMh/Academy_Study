package org.comstudy21.miniproj;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

class Student {
	public int no; // 번호
	public String name; // 이름
	public int kor, eng, mat;
	public int sum; // 국영수의 총점
	public double avg; // 국영수의 총점 평균
	public String grade; // 학점
	public int rank; // 등수

	public Student() {
		// 디폴트 생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
//		super(); // 부모의 생성자 불러오라는 의미
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		// 총점, 평균, 학점을 만들어준다.
		this.sum = kor + eng + mat;
		this.avg = sum / 3.0;
		this.grade = grade(avg);

	}

	// 학점 함수 만들기
	public String grade(double avg) {
		if (avg <= 100 && avg >= 90) {
			this.grade = "A";
		} else if (avg < 90 && avg >= 80) {
			this.grade = "B";
		} else if (avg < 80 && avg >= 70) {
			this.grade = "C";
		} else if (avg < 70 && avg >= 60) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
		return grade;
	}

	// 객체를 사용하면 toString()이 자동 호출된다.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + String.format("%.2f", avg) + "\t" + grade + "\t"
				+ rank;
	}

	// 쨘 sum , avg, grade만 뺀 함수를 만들었습니다! TADA-
	public void sag() {
		this.sum = this.kor + this.eng + this.mat;
		this.avg = this.sum / 3.0;
		this.grade = grade(this.avg);
	}

}

// Student st1 = new Student(); // 디폴트 생성자
// st1.name = "홍길동";
// Student st2 = new Student(1, "김길동", 60,70,80); - 매개변수 이용

public class MainCls {
	public static final Scanner scan = new Scanner(System.in);

	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // stack 자료구조 처럼
	static int sequence = 1; // 자동으로 값이 증가해주는 거

	// static 초기화 블럭
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
		rank();
	}

	// rank함수도 만들어줘야됨. -> 나랑 전체를 비교하기
	static void rank() {
		for (int i = 0; i < top; i++) {
			int r = 1; // 1등을 기준으로 만들기
			for (int j = 0; j < top; j++) {
				if (sArr[i].sum < sArr[j].sum) {
					r++; // 내 점수가 작으면 1등에서 2등으로 내려가니까.
				}
			}
			sArr[i].rank = r;
		}

	}

	// 입력한 받은 이름의 학생이 있다면 그 학생의 index를 return하는 stdIndex()
	// 이름이 일치하는 학생이 없다면 -1 반환
	static int Index(String name) {
//		name =scan.next();
		int index = -1;
		for (int i = 0; i < top; i++) {
			if (name.equals(sArr[i].name)) {
				index = i;
			}
		}
		return index;
	}

	public static int menu() {
		int no = 0;
		out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		out.print("선택>> ");
		no = scan.nextInt();
		// 예외처리 및 유효성 검사
		while (no < 1 || no > 6) {
			System.out.println("1~6까지의 정수를 넣으세요.");
			out.print("다시 선택>> ");
			no = scan.nextInt();
		}
		return no;
	}

	// 점수 0~100점까지만 적기
	public static int score(String s) {
		int num = 0;
		out.printf("%s 점수를 입력해주세요 >> ", s);
		num = scan.nextInt();
		while (num < 0 || num > 100) {
			System.out.println("점수를 잘못 입력했습니다.");
			out.print("다시 입력>> ");
			num = scan.nextInt();
		}
		return num;
	}

	public static void run() {
		switch (menu()) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search();
			break;
		case 4:
			modify();
			break;
		case 5:
			delete();
			break;
		case 6:
			end();
			break;
		default:
			out.println("--- 해당 사항 없습니다! ---");
		}
		rank();
		System.out.println("---------------------"); // 구분선
	}

	private static void end() {
		System.out.println("::::: END :::::");
		System.out.println("프로그램 종료!");
		System.out.println("수고하셨습니다.");
		System.exit(0);
	}

	private static void delete() {
		System.out.println("::::: DELETE :::::");
		// 이름으로 검색 후 삭제 -> 비어있는 부분에 땡겨와서 top--
		// 이름으로 검색
		System.out.print("삭제할 학생의 이름을 알려주세요 >> ");
		String Delname = scan.next();
		for (int i = 0; i < top; i++) {
			if ((sArr[i].name).equals(Delname)) {
				for (int j = i; j < top - 1; j++) {
					sArr[j] = sArr[j + 1];
				}
				sArr[top - 1] = null;
				top--;
			}
		}

	}

	private static void search() {
		System.out.println("::::: SEARCH :::::");
		// 이름으로 검색
		System.out.print("검색할 이름을 입력해주세요 >> ");
		String keyWord = scan.next();
		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (keyWord.equals(sArr[i].name)) {
				System.out.println(sArr[i]);
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		}

	}

	private static void modify() {
		System.out.println("::::: MODIFY :::::");
		System.out.print("검색할 이름을 입력해주세요 >> ");
		String keyWord = scan.next();
		int index = Index(keyWord);
		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (keyWord.equals(sArr[i].name)) {
				System.out.println(sArr[i]);
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		}
		System.out.println("수정할 번호를 입력해주세요.");
		System.out.print("1.이름 2.국어점수 3.영어점수 4.수학점수 >> ");
		int num = scan.nextInt();
		while (num < 0 || num > 4) {
			out.println("다른 번호를 입력했습니다.");
			out.println("1.이름 2.국어점수 3.영어점수 4.수학점수");
			out.print("1~4 사이의 정수를 입력하세요. >> ");
		}

		switch (num) {
		case 1:
			out.print("수정할 이름 입력 >> ");
			String rename = scan.next();
			sArr[index].name = rename;
			System.out.println("수정이 완료되었습니다.");
			break;
		case 2:
			out.print("수정할 국어 점수 >> ");
			int rekor = scan.nextInt();
			sArr[index].kor = rekor;
			System.out.println("수정이 완료되었습니다.");
			sArr[index].sag();
			break;
		case 3:
			out.print("수정할 영어 점수 >> ");
			int reeng = scan.nextInt();
			sArr[index].eng = reeng;
			System.out.println("수정이 완료되었습니다.");
			sArr[index].sag();
			break;
		case 4:
			out.print("수정할 수학 점수 >> ");
			int remat = scan.nextInt();
			sArr[index].mat = remat;
			System.out.println("수정이 완료되었습니다.");
			sArr[index].sag();
			break;
		}

	}

	private static void output() {
		System.out.println(":::::::::::::::::::: OUTPUT ::::::::::::::::::::");
		// 배열의 목록 출력
		// 번호, 성명, 국어, 영어, 수학, 총점, 평균, 학점, 등수, 등수를 기준으로 정렬
		for (Student std : sArr) {
			if (std == null)
				break;
			out.println(std);
		}

	}

	private static void input() {
		System.out.println("::::: INPUT :::::");
		// 성명, 국어, 영어, 수학을 배열에 입력받는다.
		// 입력받은 국영수 점수의 총점, 평균, 평균의 학점
		// 입력된 학생의 등수가 만들어진다.
		System.out.print("이름 >> ");
		String name = scan.next();

		int kor = score("국어");
		int eng = score("영어");
		int mat = score("수학");

		sArr[top++] = new Student(sequence++, name, kor, eng, mat);
	}

	public static void main(String[] args) {
		out.println("::::::::::::::: 성적 출력 프로그램 :::::::::::::::");
		while (true) {
			run();
		}

	}

}