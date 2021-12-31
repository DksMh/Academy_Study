package day03;

class Person {
private int age;
//public int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
//public class Example {
//    public static void main (String args[]) {
//        Person aPerson = new Person();
//        aPerson.setAge(17);
//    }
//}

class Power {
	private int kick;
	private int punch;
	public int getKick(int kick) {// 반환 하는 메서드 25~27 
		// 값을 얻는 get() 메서드
		// private 변수 kick에 접근해 값을 가져옴
		return kick;
	}
	public void setKick(int kick) {// kit을 매개변수로 전달 
		// 값을 지정하는 set()메서드
		// private 변수 kick에 접근해 값을 지정하는 public set() 메서드
		// set 이 메서드는 kick을 전달받아 지정하는 것이라
		// 매개변수 kick이 필요. 매개변수 kick을 멤버변수 에 대입하면 
		// kick이 지정되어 반환값은 없으므로 반환형은 void 
		this.kick = kick;
	}
	public int getPunch() {
		return punch;
	}
	public void setPunch(int punch) {
		this.punch = punch;
	}
}
public class Example {
    public static void main (String args[]) {
        Power robot = new Power();
        robot.setKick(10); // setKick() 메서드를 활용해 private 변수에 접근가능
        robot.setPunch(20);
    }
}
