package test;

import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;

class Student {
	public int no;
	public String name;
	public int kor, eng, mat;
	public int sum;
	public double avg;
	public String grade;
	public int rank;

	public Student() {
		// 디폴트 생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		sum = kor + eng + mat;
		avg = sum / 3.0;
		grade = abc(avg);
	}
	// 총점, 평균, 학점을 만들어 준다.
	
	// 객체를 사용하면 toString()이 자동 호출 된다.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + String.format("%.2f",avg) + "\t" + grade + "\t"
				+ rank;
	}
	
	// 학점 출력 함수 (입력 avg(평균))
	// 100점,90점대: A  80점대: B  70점대 : C  60점대 : D  60점 미만 : F
	public String abc(double avg) {
		String grade = "F";
		switch ((int) avg / 10) {
		case 10:
		case 9:	grade = "A";break;
		case 8:	grade = "B";break;
		case 7:	grade = "C";break;
		case 6:	grade = "D";break;
		default:grade = "F";break;
		}
		return grade;
	}

}

public class MainCls {
	static Scanner sc = new Scanner(System.in);

	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // 스텍 자료구조처럼.
	static int sequence = 1;
	static String[] title = {"번호", "이름", "국어","영어","수학","총점","평균","학점","등수"};
	
	// static 초기화 블럭
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		
		// 초기화된 사람들의 등수 계산
//		t_rank();
		rank(sArr);
	}
	
	static void math(Student s) {
		
		s.sum = s.kor + s.eng + s.mat;
		s.avg = s.sum/3.0;
		s.grade = s.abc(s.avg);
	}
	
	static void rank(Student[] s) {
		int[] score = new int[top];
		for(int i = 0; i<top; i++) {
			score[i] = s[i].sum;
		}
		
		
		for(int i =0; i<top; i++) {
			int r = top;
			for(int j =0; j<top; j++) {
				if(score[i] >score[j]) {
					r--;				
				}
				// 총점이 같다면 no(번호)가 낮은 사람의 등수가 더 높게
				if((score[i] == score[j])&&(s[i].no<s[j].no)) {
					r--;
				}
			}
			s[i].rank = r;
		}
	}
	
	// 숫자만 입력받는 getNum
	static int getNum() {
		int num;
		while(true) {
			try{
				num = sc.nextInt();
				break;
			}catch(Exception e ) {
				out.print("숫자만 입력하세요! >> ");
				sc.next();
				continue;
			}
		}
		return num;
	}
	
	public static int menu() {
		int no = 0;	
		out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		out.print("선택 >> ");
		no = getNum();
		
		// 예외처리 및 유효성 체크
		while (no < 1 || no > 6) {
			System.out.println("잘못입력했습니다! 1~6중 골라주세요!");
			out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
			out.print("선택 >> ");
			no = getNum();
		}
		return no;
	}

	public static void run() {
		switch (menu()) {
		case 1:	input();break;
		case 2:	output();break;
		case 3:	search();break;
		case 4:	modify();break;
		case 5:	delete();break;
		case 6:	end();break;
		default: out.print("--- 해당사항 없습니다! ---");
		}
		rank(sArr);
		System.out.println("--------------------------------------");
	}
	
	
	// 점수 유효성 평가
	static int getScore(String s) {
		int score =0;
		out.printf("%s점수 >> ",s);
		score = getNum();
		while(score<0||score>100) {
			System.out.println("범위를 초과했습니다.");
			out.printf("%s점수(0~100점) >> ",s);
			score = getNum();
		}
		return score;
	}

	// 타이틀 출력하는 함수
	static void title() {
		for(String t : title) {
			out.printf("%s\t",t);
		}
		out.println();
	}
	
	// 입력한 받은 이름의 학생이 있다면 그 학생의 index를 return하는 stdIndex()
		// 이름이 일치하는 학생이 없다면 -1 반환
	static int stdIndex(String name) {
		int index=-1;
		for(int i=0; i<top; i++) {
			if(name.equals(sArr[i].name)) {
				index = i;
			}
		}
		return index;
	}
		
	private static void input() {
		out.println("::::: INPUT :::::");
		// 성명, 국어, 영어, 수학을 입력 배열에 입력 받는다.
		// 입력 받은 국영수 점수의 총점과 평균, 평균의 학점,
		// 입력 된 학생의 등수가 셋팅되어 진다.
		out.print("이름 >> ");
		String name = sc.next();
		sc.nextLine();
		int kor =getScore("국어");
		int eng =getScore("영어");
		int mat =getScore("수학");
		
		sArr[top++] = new Student(sequence++,name,kor,eng,mat);	
		System.out.printf("%s학생의 정보가 입력되었습니다. \n",name);
	}
	
	private static void output() {
		out.println("::::: OUTPUT :::::");
		// 배열의 목록 출력
		// 번호, 성명, 국어, 영어, 수학, 총점, 평균, 학점, 등수, 정렬(등수 or 번호)
		title();
		for (Student std : sArr) {
			if (std == null)
				break;
			out.println(std);
		}
	}
	private static void search() {
		out.println("::::: SEARCH :::::");
		// 이름으로 검색
		out.print("검색할 학생의 이름을 알려주세요 >> ");
		String name = sc.next();
		int index = stdIndex(name);
		if(index == -1) {
			out.printf("%s 학생의 데이터가 없습니다! \n",name);							
		}else {
			System.out.printf("%s학생의 정보가 검색되었습니다. \n",name);
			title();
			System.out.println(sArr[index]);
		}
	}
	
	private static void modify() {
		out.println("::::: MODIFY :::::");
		out.print("수정할 학생의 이름을 알려주세요 >> ");
		String name = sc.next();
		int index = stdIndex(name);
		// 이름으로 검색 후 수정
		if(index != -1 ){
		out.println("1.이름 2.국어점수 3.영어점수 4.수학점수");
		out.print("수정할 사항을 선택해 주세요 >> ");
		int num = getNum();
		
		while(num<0||num>4) {
			out.println("범위를 벗어났습니다! ");
			out.println("1.이름 2.국어점수 3.영어점수 4.수학점수");
			out.print("수정할 사항을 다시 선택해 주세요 >> ");
			num = getNum();
		}
		
			switch(num) {
			case 1 : 
				out.print("이름을 다시 입력해 주세요 >> ");
				String newName = sc.next();
				sArr[index].name = newName;
				break;
			case 2:
				out.println("국어 점수를 다시 입력해 주세요 ");
				int newKor = getScore("국어");
				sArr[index].kor = newKor;
				math(sArr[index]);
				break;
			case 3:
				out.println("영어 점수를 다시 입력해 주세요 ");
				int newEng = getScore("영어");
				sArr[index].eng = newEng;
				math(sArr[index]);
				break;
			case 4:
				out.println("수학 점수를 다시 입력해 주세요 ");
				int newMat = getScore("수학");
				sArr[index].mat = newMat;
				math(sArr[index]);
				break;
				}
			System.out.printf("%s학생의 정보가 수정되었습니다. \n",name);
		}else {
			out.printf("%s 학생의 데이터가 없습니다! \n",name);
		}
		
	}

	private static void delete() {
		out.println("::::: DELETE :::::");
		// 이름으로 검색 후 삭제
		out.print("삭제할 학생의 이름을 알려주세요 >> ");
		String name = sc.next();
		int index = stdIndex(name);
		
		if(index == -1) {
			out.printf("%s 학생의 데이터가 없습니다! \n",name);
		}
		else {
			sArr[index] = null;
			if(index != top) {
				for(int i = index+1; i<top; i++) {
					sArr[i].no--;
					sArr[i-1] = sArr[i];
				}
				// 학생수 1감소
				top--;
				// 마지막이였던 학생이 저장되어있는 방 null 처리
				sArr[top] = null;
			}
		}
		System.out.printf("%s학생의 정보가 삭제되었습니다. \n",name);
	}

	private static void end() {
		out.println("::::: END :::::");
		System.out.println("프로그램 종료!");
		System.out.println("수고하셨습니다!");
		System.exit(0);
	}

	public static void main(String[] args) {
		out.println("::::: 성적 출력 프로그램 :::::");
		while (true) {
			run();
		}
	}
}