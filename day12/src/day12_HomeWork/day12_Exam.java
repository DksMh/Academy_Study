package day12_HomeWork;

import java.util.Scanner;

// 01
class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;} // size를 return만 해줌
}
class ColorTV extends TV{
	private int color =0;
	
	public ColorTV(int size, int color) {
		super(size);
		this.setColor(color);
	}
	
	public void printProperty(){
		System.out.println(getSize()+"인치 "+getColor()+"컬러"); 
		// getSize()가 ColorTV없으면 TV에서 찾음
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
// 02
class IPTV extends ColorTV{
	private String adr = "";
	public IPTV(String adr, int size, int color) {
		super(size, color);
		this.adr = adr;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+adr+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
	
}
//03
abstract class Converter{
    abstract protected double convert(double src); // 추상 메소드
    abstract protected String getSrcString(); // 추상 메소드
    abstract protected String getDestString(); // 추상 메소드
    protected double ratio; // 비율
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다.");
        sc.close();
    }
}
class Won2Dollar extends Converter{	
	public double convert(double src) { // -> 24000
		return src/ratio; // -> 24000 / 1200 => 20.0
	}
	public String getSrcString() {
		return "원";
	}
	public String getDestString() {
		return "달러";	
	}
	public Won2Dollar(double ratio) { // -> 1200
		this.ratio = ratio;
	}
	
}
//04
class Km2Mile extends Converter{
	public double convert(double src) { // -> 30
		return src/ratio; // -> 30 / 1.6 => 18.75
	}
	public String getSrcString() {
		return "Km";
	}
	public String getDestString() {
		return "mile";	
	}
	public Km2Mile(double ratio) { // -> 1.6
		this.ratio = ratio;
	}
}
//05
class Point{
    private int x,y;
    public Point (int x, int y) {this.x = x; this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y) {this.x = x; this.y = y;}
}
class ColorPoint extends Point{
	private String color ="";
	public ColorPoint(int x, int y, String color) {
		 super(x, y);
		 this.color = color;		 
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y); 
	}
	public String toString() {
		return color + "색의 (" + getX() + "," + getY()  +")의 점";
	}
	
}
// 06
class ColorPoint2 extends Point{	
	private String color ="";
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color + "색의 (" + getX() + "," + getY()  +")의 점";
	}
	public ColorPoint2() {
		super(0, 0);
		color= "black";
	}
	public ColorPoint2(int x, int y) {
		super(x, y);
	}
	
	public void setXY(int x, int y) {
		move(x,y);		
	}
	
}
//07
class Point3D extends Point{
	private int z;
	public int getZ() {return z;}
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public void moveUp() {
		z++;
		
	}
	public void moveDown() {
		z--;
		
	}
	public void move(int x, int y, int z) {
		move(x,y);
		this.z = z;
		
	}
	public String toString() {
		return "("+getX() + "," + getY() + "," + z + ")의 점";
	}
	
}
//08
class PositivePoint extends Point{
	public PositivePoint() {
		super(0, 0);
	}
	
	public void move2(int x, int y) {
		if(x>0 && y>0) { // 둘 다 양수 일때만 바꾸기 // 그래서  p.move2(10, 10);으로 두번 적용됨
			super.move(x,y);
		}
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0 || y<0) { // 하나라도 음수면 (0,0)
			super.move(0,0);
		}
	}
	public String toString() {
		return "("+getX() + "," + getY() + ")의 점";
	}
	
}
//09
interface Stack{
    int length(); // 현재 스택에 저장된 개수 리턴 
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴  
    String pop(); // 스택의 톱(top)에 실수 저장 
    boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}
class StringStack implements Stack{
	private String arr[]; // -> 입력한 문자 저장
	private int top = 0;
	
	@Override
	public int length() { // 스택에 저장된 개수
		return top;
	}

	@Override
	public int capacity() { // 배열의 길이가 저장가능한 개수 리턴
		return arr.length;
	}

	@Override
	public String pop() { // 스택의 톱(top)에 실수 저장 // 없을 떄랑 있을 떄
		if(top == 0) {
			return "";			
		}else {
			return arr[top];
		}
	}

	@Override
	public boolean push(String val) { // 스택의 톱(top)에 저장된 실수 리턴
		return false;
		
	}
	
} 
// 11
abstract class Calc{
    protected int a;
    protected int b;
    abstract void setValue(int a, int b);
    abstract int calculate();
}
class Add extends Calc{
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	@Override
	public int calculate() {
		return a+b;
	}
	
}
class Sub extends Calc{
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	@Override
	public int calculate() {
		return a-b;
	}
	
}
class Mul extends Calc{
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	@Override
	public int calculate() {
		return a*b;
	}
	
}
class Div extends Calc{
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	@Override
	public int calculate() {
		return a/b;
	}
	
}
//abstract class Shape {
//	private Shape next;
//	public Shape() { next = null; }
//	public void setNext(Shape obj) { next = obj; } // 링크 연결
//	public Shape getNext() { return next; }
//	public abstract void draw(); // 추상메소드
//}
// 
//class Line extends Shape{
//	public void draw() {
//		System.out.println("Line");
//	}
//}
//class Rect extends Shape{
//	public void draw() {
//		System.out.println("Rect");
//	}
//}
//class Circle extends Shape{
//	public void draw() {
//		System.out.println("Circle");
//	}
//}
class GrapicEditor{
	public void insert(int i) { // Line(1), Rect(2), Circle(3)
		
	}
	public void delete() {
		
	}
	public void searchall() {
		
	}
}
// 13
interface Shape {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
class Circle implements Shape{
	private int radius;
	@Override
	public void draw() { // Shape의 default public void redraw()에서 실행됨
		System.out.println(" 반지름이 "+radius+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return (PI*radius*radius);
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
}
public class day12_Exam {
	public static void main13(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
	public static void main12(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int num = sc.nextInt(); // 1, 2, 3, 4
			switch(num) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				num = sc. nextInt();
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 >> ");
				num = sc.nextInt();
				break;
			case 3:
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				break;
			}
			
		}
	}
	public static void main11(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String set = sc.next(); // --> + - * /
		switch(set) {
		case "+" :
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-" :
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*" :
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/" :
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;	
		default :
			System.out.println("잘못 넣었습니다.");
			break;
		}
	}
	public static void main09(String[] args) {
		StringStack ss = new StringStack();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String word = sc.next();
			if(word.equals("그만")) {
				break;
			}
			boolean notPush = ss.push(word);
			if(notPush == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.println("스택에 저장된 모든 문자열 팝 :");
		for(int i = 0; i<ss.capacity() ; i++) {
			System.out.println(ss.pop());
		}
	}
	public static void main08(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move2(10, 10);
        System.out.println(p.toString() + "입니다.");
        
        p.move2(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음 
        System.out.println(p.toString() + "입니다.");
        
        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");		
	}	
	public static void main07(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");
        
        p.moveUp(); // z축으로 위쪽 이동
        System.out.println(p.toString() + "입니다.");
        p.moveDown(); // z축으로 아래쪽 이동
        p.move(10,10); // x,y축으로 이동
        System.out.println(p.toString() + "입니다.");
       
        p.move(100, 200, 300); // x,y,z 축으로 이동
        System.out.println(p.toString() + "입니다.");		
	}
	public static void main06(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); // 
        System.out.println(zeroPoint.toString() + "입니다.");
        
        ColorPoint2 cp = new ColorPoint2(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");		
	}
	public static void main05(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");		
	}
	public static void main04(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();		
	}
	public static void main03(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}
	public static void main02(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
	public static void main01(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }

}
