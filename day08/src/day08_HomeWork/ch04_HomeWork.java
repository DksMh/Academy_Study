package day08_HomeWork;

import static java.lang.System.out;

import java.util.Scanner;

//01
class TV{
	private String n;
	private int year;
	private int inch;
	TV(String n, int year, int inch) {
		this.n = n;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(n+"에서 만든 "+year+"년형 "+inch+"인치 TV");			
	}
}
//02
class Grande{
	private int math;
	private int science;
	private int english;
	private double avg;
	Grande(int a, int b, int c){
		this.math = a;
		this.science = b;
		this.english = c;
	}
	public int average() {
		return (this.math+this.science+this.english) / 3;
	}
}

//03
class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	Song(){
		System.out.println();
	}
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);			
	}
}
//04
class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	Rectangle(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	int square() {
		return (width *height);
	}
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"X"+height+"인 사각형");
		return;
	}
	boolean contains(Rectangle r) {
		if(x<r.x && y<r.y) {// main 에서 현 사각형이 t, t와 r을 비교한다. 
			if((width + x) > (r.x + r.width) && (height + y)>(r.y + r.height)) { 
				// 좌표가 없이 0,0이 아닌 따로 따로 좌표가 있으므로 좌표+ width값을 구하고 height값을 구해야한다.
				// 이전 Homework03 의 충돌검사를 이해해야한다.
				return true;
			}
		}
		return false;
	}
}

//05
class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; // x,y, radius 초기화
		this.y= y;
		this.radius =radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}
//06
class Circle02{
	private double x,y;
	private int radius;
	public Circle02(double x, double y, int radius) {
		this.x = x; // x,y, radius 초기화
		this.y= y;
		this.radius =radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double size(){ 
		// 원의 넓이를 구한다
		return radius*radius*3.14;
	}
}
//07
class Day{
	private String work;//하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work;}
	public String get() { return work;}
	public void show() {
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}

class MonthSchedule{
	Scanner scanner = new Scanner(System.in);
	private Day days[]; // day 객체배열
	
	public MonthSchedule(int i) {
		days = new Day[i];
	}
	
	public void input(){
		System.out.print("날짜(1~30)? ");
		int day=scanner.nextInt();
		System.out.print("할일(빈칸없이입력)? ");
		String work = scanner.next();
		days[day-1].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int day=scanner.nextInt();		
		System.out.printf("%d일의 할 일은 ",days);
		days[day-1].show();
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	public int menu() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");	
		int num = scanner.nextInt();
		while(num <0 || num>3) {
			System.out.print("다시 번호를 입력하세요 >> ");
			num = scanner.nextInt();
		}
		return num;
	}
	public void run() {
		int num = scanner.nextInt();
		switch(menu()) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); break;
			default : out.println("--- 해당 사항 없습니다! ---");
		}
	}
}
// 08
// 09
class ArryUtil{
	public static int[] concat(int[] a, int[] b) {
		/*배열 a와 b를 연결한 새로운 배열 리턴 */
		int[] c;
		c = new int[a.length+b.length]; // 길이 만듬
		
		
		return c;
		
	}
	public static void print(int[] a) {
		/* 배열 a 출력 */
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
// 11
class Add{
	private int a;
	private int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a+b;
	}
}
class Sub{
	private int a;
	private int b;	
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a-b;
	}
}
class Mul{
	private int a;
	private int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a*b;
	}
}
class Div{
	private int a;
	private int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a/b;
	}
}
// 10
class Dictionary{
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		String same = "";
		int i = 0;
		for(i=0;i<kor.length;i++) {
			if(kor[i].equals(word)) {
				same = (word+"은/는 "+eng[i]);
				break;
			}
		}
		if(i==kor.length)
			same = (word+"는 저희 사전에 없습니다.");
		return same;		
	}
}
public class ch04_HomeWork {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		System.out.print("한글 단어? ");
		String kw=scanner.next();
		while(true) {
			System.out.print("한글 단어? ");
			kw=scanner.next();
			if(kw.equals("그만")) {
				break;
			}else {
				System.out.println(Dictionary.kor2Eng(kw));
			}
			
		}
		
	}
	public static void main11(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String option = scanner.next();
		switch(option) {
		case "+":
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.calculate());
			break;
		default:
			break;
		}
		
	}
	public static void main09(String[] args) {
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArryUtil.concat(array1,array2);
		ArryUtil.print(array3);
	}
	
	public static void main07(String[] args) { // -> 콘솔에서 안돌아감 수정해야함
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할일
		april.run();
	}
	public static void main01(String[] args) {
		TV myTV = new TV("LG",2017,32); // LG에서 만든 2017년 32인치
		myTV.show();
	}
	public static void main02(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grande me = new Grande(math,science,english);
		System.out.println("평균은 "+me.average());
	}
	public static void main03(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
	}
	public static void main04(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		r.show();
		System.out.println("s의 면적은 "+ s.square());
		if(t.contains(r))System.out.println("t는 r을 포함합니다.");
		if(t.contains(s))System.out.println("t는 s을 포함합니다.");
	}
	public static void main05(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3]; // 3개의 Circle 배열 선언
		for(int i =0; i<c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble(); // x 값이 읽기
			double y = scanner.nextDouble(); // y 값이 읽기
			int radius = scanner.nextInt(); // 반지름 읽기
			c[i] = new Circle(x,y,radius); // Circle 객체 생성	
		}
		for(int i =0; i<c.length;i++) {
			c[i].show();// 모든 Circle 객체 출력
			scanner.close();
		}
	}
	public static void main06(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle02 c [] = new Circle02[3]; // 3개의 Circle02 배열 선언
		for(int i =0; i<c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble(); // x 값이 읽기
			double y = scanner.nextDouble(); // y 값이 읽기
			int radius = scanner.nextInt(); // 반지름 읽기
			c[i] = new Circle02(x,y,radius); // Circle02 객체 생성	
		}
		for(int i =0; i<c.length;i++) {
			c[i].show();// 모든 Circle02 객체 출력
		}
		int max = 0; // 초기값 
		for(int i =0; i<c.length;i++) {		
			// 모든 Circle02 객체 넓이를 비교하자.
			if(c[max].size()<c[i].size()) { 
				max = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 : ");
		c[max].show();
		scanner.close();
	}

}
