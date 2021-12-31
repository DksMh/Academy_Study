package HomeWorkWithT_ex09;
import java.util.Scanner;

interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴 
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴  
    String pop(); // 스택의 톱(top)에 실수 저장 
    boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

public class StringStack implements Stack{
	private String[] stack; // -> 입력한 문자 저장
	private int top;
	
	public StringStack(int capacity) {
		stack = new String[capacity];
		top =0;
	}
	
	public int length() {
		return top;
	}
	
	public int capacity() {
		return stack.length; 
	}
	
	public String pop() {// 스택의 톱(top)에 실수 저장 // 없을 떄랑 있을 떄
		if(top-1 < 0) {
			return null;			
		}else {
			return stack[--top];
		}
	}
	
	public boolean push(String val) {
		if(top >= capacity()) {
			return false; // 입력 불가함			
		}else {
			stack[top++] = val;
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int capacity = sc.nextInt();
		StringStack stack = new StringStack(capacity);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			if(!stack.push(str)) {
				System.out.print("스택이 꽉 차서 푸시 불가!");
				break;
			}
		}
		sc.close();
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		while(true) {
			String str = stack.pop();
			if(str == null) break;
			System.out.print(str + " ");
		}
		System.out.println();
		
	}


}
