package org.comstudy.ch05_3;

class People{
	// 이름, 나이,직업이 저장되는 필드
	private String name;
	private int age;
	private String job;
	
	// 개발자가 매개변수 있는 생성자를 직접 구현하면
	// 매개변수 없는 디폴트 생성자도 반드시 구현해줘야한다.
	public People() {
		this("",0,""); // String name, int age, String job이렇게 호출하는 거다.
	}
	// People의 생성자 (생성자 오버로딩) -- 매개변수는 지역변수이다.
	public People(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void showInfo() {
//		System.out.printf("이름은 %s이고 나이는 %d이고 직업은 %s입니다.\n",name,age,job);
		System.out.printf("People [성명=%s, 나이=%d, 직업=%s]\n",name,age,job);
	}
	
	public void setInfo(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
}

public class Ch05Ex05 {

	public static void main(String[] args) {
		People people1 = new People("홍길동",23,"의적");
		people1.showInfo(); 

		People people2 = new People();
		people2.setInfo("이순신",35,"장군"); 
		people2.showInfo(); // 
		
	}

}
