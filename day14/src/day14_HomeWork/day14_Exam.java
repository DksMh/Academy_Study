package day14_HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

class Student{
	private String name;
	private String depart;
	private int no;
	private double avg;
	public Student(String name, String depart, int no, double avg) {
		this.name = name;
		this.depart = depart;
		this.no = no;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public int hashCode() {
		return Objects.hash(avg, depart, name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(avg) == Double.doubleToLongBits(other.avg)
				&& Objects.equals(depart, other.depart) && Objects.equals(name, other.name) && no == other.no;
	}
	@Override
	public String toString() {
		return name + ", " + depart + ", " + no + ", " + avg;
	}
}
public class day14_Exam {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();	
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String name = sc.next();
			String depart = sc.next();
			int no = sc.nextInt();
			double avg = sc.nextDouble();
			s.add(new Student(name, depart, no, avg));
		}
		/// 나머지 풀기
	}
	



	public static void main04(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); 
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}
			v.add(num); 
			int sum = 0;
			for(int i=0; i< v.size(); i++) {
				System.out.print(v.get(i)+" ");
				sum += v.get(i);
			}
			System.out.println("\n현재 평균 " + sum/v.size());	
			
		}
	}
	public static void main03(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요(예 : Korea 5000)");
		String name;
		int num = 0;
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			name = scan.next();
			if(name.equals("그만")) {
				break;
			}
			num = scan.nextInt();
			nations.put(name, num);
		}
//		System.out.println(nations);
		while(true) {
			System.out.print("인구 검색 >> ");
			name = scan.next();
			if(name.equals("그만")) {
				break;
			}
			if(nations.containsKey(name)) {
				System.out.println(name+"의 인구는 "+ nations.get(name)); // 키로 값 읽기
			}else {
				System.out.println(name + "은/는 없습니다.");
			}
			
		}
		
	}
	public static void main02(String[] args) {
		ArrayList<Character> ch = new ArrayList<Character>(); // char 타입 사용
		Scanner scan = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		double sum = 0;
		for(int i = 0; i<6; i++) {
			Character grade = scan.next().charAt(0);
			ch.add(grade);
			switch(grade) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		double avg = sum/6;
		System.out.println(avg);
	}
	
	public static void printVector(Vector<Integer> v) { // PPT 7장 16페이지 -> 컬렉션을 매개변수로 받는 메소드
		int bnum = v.get(0); 
		for(int i=0; i< v.size(); i++) {
			if(bnum < v.get(i)) { // 더 큰 수 발견하면
				bnum = v.get(i); // 더 큰 변수 교체해라
			}
		}
		System.out.println("가장 큰 수는 " + bnum);		
	}
	public static void main01(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); 
		Scanner scan = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지) >> ");
		while(true) {
			int num = scan.nextInt();
			if(num == -1) {
				break;
			}
			v.add(num);
		}
		printVector(v); 
	}

}