package test2;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	public int no; // 번호
	public String name; // 이름
	public int kor, eng, mat;
	public int sum; // 국영수 총점
	public double avg; // 국영수 총점의 평균
	public String grade; // 학점
	public int rank; // 등수
	
	public Student() {
		//디폴트 생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	// 객체를 사용하면 toString()이 자동 호출된다.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t"
				+ sum + "\t" + avg + "\t" + grade + "\t" + rank;
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.sum  = kor + eng + mat;
		this.avg = sum/3;
		
		if(avg<=100 && avg>=90) {
			this.grade = "A";
		} else if(avg <90 && avg >=80) {
			this.grade = "B";
		} else if(avg <80 && avg >=70) {
			this.grade = "C";
		} else {
			this.grade = "D";
		}
		
		// 총점, 평균, 학점을 만들어준다.
	}

}

// Student st1 = new Student(1, "김길동", 60, 70, 80);


public class MainCls2 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void Basic() {
		System.out.printf("[no]\t[name]\t[kor]\t[ENG]\t[MAT]\t[SUM]\t[AVG]\t[GRADE]\t[RANK]\n");
	}
	
	public static final int MAX = 100;
	public static Student[] sArr = new Student[MAX];
	public static int top = 0; // 스택 자료구조처럼.
	static int sequence = 1;
	
	
	// static 초기화 블럭
	static {
		sArr[top++] = new Student(sequence++,"KIM", 60,60,75);
		sArr[top++] = new Student(sequence++,"LEE", 90,80,85);
		sArr[top++] = new Student(sequence++,"PARK", 100,70,90);
	}
	
	public static int menu() {
		int num = 0;
		while(true) {
			System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료 ");
			System.out.print("선택 >> ");
			num = scan.nextInt();
			if(num>6 || num<0) {
				System.out.println("범위 초과! 1~6 사이의 숫자를 입력하여 주십시오.");
			} else if(num<=6){
				break;
			}
		}
		
		return num;
	}
	
	public static void run() {
		switch(menu()) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default : System.out.println("--- 해당 사항 없습니다. ---");
		}
		System.out.println("---------------------------------");
	}
	
	private static void end() {
		System.out.println("::::::::::::::: END :::::::::::::::");
		System.out.println("프로그램 종료!");
		System.out.println("수고하셨습니다.");
		System.exit(0);
	}

	private static void delete() {
		System.out.println("::::::::::::::: DELETE :::::::::::::::");
		//이름으로 검색 후 삭제
		int count = 0;
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		int i = 0;
		for(i = 0; i<top; i++) {
			if(name.equals(sArr[i].name)) {
				Basic();
				System.out.println(sArr[i]);
				count++;
				break;
			} 
		}
		
		if(count == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		} else {
			System.out.print("위 데이터를 삭제하시려면 1, 그렇지 않다면 2 입력 >> ");
			int check = scan.nextInt();
			if(check == 1) {
				sArr[i] = new Student();
				System.out.println("데이터를 삭제하였습니다.");
			} else if (check == 2){
				System.out.println("데이터 삭제를 취소합니다");
			}
		}
		
	}

	private static void modify() {
		System.out.println("::::::::::::::: MODIFY :::::::::::::::");
		// 이름으로 검색 후 수정 
		int count = 0;
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		int i = 0;
		for(i=0; i<top; i++) {
			if(name.equals(sArr[i].name)) {
				Basic();
				System.out.println(sArr[i]);
				count++;
				break;
			} 
		}
		if(count == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		} else {
			System.out.println("수정할 데이터를 입력해주십시오.");
			int kor =0, eng=0, mat = 0;
			kor = score("kor");
			eng = score("eng");
			mat = score("mat");
			sArr[i] = new Student(sArr[i].no,name, kor,eng,mat);
		}
	}

	private static void search() {
		System.out.println("::::::::::::::: SEARCH :::::::::::::::");
		// 이름으로 검색
		int count = 0;
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		
		for(int i=0; i<top; i++) {
			if(name.equals(sArr[i].name)) {
				Basic();
				System.out.println(sArr[i]);
				count++;
			} 
		}
		if(count == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		}
	}

	private static void output() {
		System.out.println("::::::::::::::: OUTPUT :::::::::::::::");
		// 배열의 목록이 출력
		// 번호, 성명, 국어, 영어, 수학, 총점, 평균, 학점, 등수, 등수를 기준으로 정렬
		
		//랭크 초기화
		for(int i=0; i < sArr.length; i++){
			if(sArr[i] == null) break;
			sArr[i].rank = 0;
        }
		
		//SUM 내림차순 정렬
		for(int i=1; i < sArr.length; i++){
			if(sArr[i] == null) break;
            for(int j=i ; j >= 1; j--){
                
                if(sArr[j].sum > sArr[j-1].sum){  
                    Student tmp = sArr[j];
                    sArr[j] = sArr[j-1];
                    sArr[j-1] = tmp;
                }else break;      
            }
        }
		
		//랭크 입력
		for(int i=0; i < sArr.length; i++){
			if(sArr[i] == null) break;
			sArr[i].rank = i+1;
        }

		//출력
		Basic();
		for(Student std : sArr) {
			if(std == null) break;
			if(std.name != null) {
				System.out.println(std);
			}
			
		}
	}

	public static int score(String a) {
		int num = 0;
		while(true) {
			System.out.printf("%s >> ",a);
			num = scan.nextInt();
			if(num>100 || num<0) {
				System.out.println("범위 초과! 1~100 사이의 숫자를 입력하여 주십시오.");
			} else if(num<=100){
				break;
			}
		}
	
		return num;
	}
	
	private static void input() {
		System.out.println("::::::::::::::: INPUT :::::::::::::::");
		// 성명, 국어점수, 영어점수, 수학점수를 배열에 입력 받는다
		// 입력 받은 국영수 점수의 총점, 평균, 평균의 학점, 입력 된 학생의 등수가 셋팅된다.
		
		// 유효성 검사 - 4글자 이하입력받기(틀 맞추기위함)
		String name=" ";
		while(true) {
			System.out.print("name >> ");
			name = scan.next();
			if(name.length()>4) {
				System.out.println("글자수 초과! 4글자 이하로 입력하여 주십시오.");
			} else if(name.length()<=4){
				break;
			}
		}

		int kor =0, eng=0, mat = 0;
		kor = score("kor");
		eng = score("eng");
		mat = score("mat");
		
		sArr[top++] = new Student(sequence++,name, kor,eng,mat);
	}

	public static void main(String[] args) {
		System.out.println("::::::::::::::: 성적 출력 프로그램 :::::::::::::::");
		while(true) {
			run();
		}
	}

}
