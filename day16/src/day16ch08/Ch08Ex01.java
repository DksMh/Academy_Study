package day16ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch08Ex01 {
	public static String getLine(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(isr);
		
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static int getNum() {
		String s = getLine();
		// 수정이 일어날 때는 스트링 버퍼
		StringBuffer s2 = new StringBuffer();
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i); // 자바에서는 character도 정수
			if(ch>'0'&&ch<'9') {
				s2.append(ch);
			}
		}
		return Integer.parseInt(s2.toString());
	}
	public static void main(String[] args) {
		// main02와 같음 
		System.out.print("주소 입력 : ");
		String addr = getLine();
		System.out.print("나이 입력 : ");
		int age = getNum();
		
		System.out.println("입력된 주소는 : "+addr);
		System.out.println("입력된 나이는 : "+age);
	}
	public static void main02(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in); // 알파벳정도만 받아드림
		BufferedReader br  = new BufferedReader(isr); // 띄어쓰기, 특수문자나 한글을 받아주기 위해 사용
		
		System.out.print("성명입력 : ");
		String name = br.readLine();
		System.out.println(name);
	}
	public static void main01(String[] args) {
		Scanner sc = new Scanner("우리나라 true 대한민국\n 만세 false 나라\n 사랑 가족");
		
		while(sc.hasNext()) {
			if(sc.hasNextBoolean())
				System.out.println(sc.nextBoolean());
			else sc.next();
		}
	}
}
